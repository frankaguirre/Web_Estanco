/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Carrito;
import Modelo.Categoria;
import Modelo.CategoriaDAO;
import Modelo.Detalle_Pedido;
import Modelo.Detalle_PedidoDAO;
import Modelo.Pedido;
import Modelo.PedidoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HPLAPTOP01
 */
public class CtrProducto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    ProductoDAO pdao = new ProductoDAO();
    CategoriaDAO cdao = new CategoriaDAO();
    List<Producto>productos = new ArrayList();
    List<Categoria>categoria = new ArrayList();
    List<Carrito>listacarrito = new ArrayList();
    List<Pedido>listapedido = new ArrayList();
    List<Detalle_Pedido>listadetped = new ArrayList();
    Pedido ped = new Pedido();
    Detalle_PedidoDAO dpdao = new Detalle_PedidoDAO();
    PedidoDAO peddao = new PedidoDAO();
    UsuarioDAO usudao = new UsuarioDAO();
    Carrito car;
    Usuario us;
    int cantidad;
    int idp;
    int subtotal;
    int item;
    int totalpagar;
    String nom, des, foto, idusu, fec, estado, idcliente;
    int pre, sto, cat, mon, idcli;
    Date d = new Date();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        System.out.println("accion= "+accion);
        HttpSession sesion = request.getSession();
        productos = pdao.listar();
        categoria = cdao.listar();
        System.out.println("producto "+productos.get(0).getFoto());
        Producto p = new Producto();
        request.setAttribute("contador", listacarrito.size());
        switch (accion){
                       
            case "home":
                request.setAttribute("categorias", categoria);
                request.setAttribute("productos", productos);
                if (sesion.getAttribute("tipo") != null) {
                    if (sesion.getAttribute("tipo").equals("Administrador")) {
                        request.getRequestDispatcher("Vistas/VentasAdmin.jsp").forward(request, response);
                    } else {
                        if (sesion.getAttribute("tipo").equals("Cliente")) {
                            request.getRequestDispatcher("Vistas/VentasCliente.jsp").forward(request, response);
                        } 
                    }
                }else {
                            System.out.println("entro en inicio");
                            request.getRequestDispatcher("Vistas/Inicio.jsp").forward(request, response);
                }
                
                break;
            case "buscarcat":
                int idcat =Integer.parseInt(request.getParameter("catid"));
                productos = pdao.buscarcat(idcat);
                request.setAttribute("categorias", categoria);
                request.setAttribute("productos", productos);
                if (sesion.getAttribute("tipo").equals("Administrador")){
                    request.getRequestDispatcher("Vistas/VentasAdmin.jsp").forward(request, response);
                }
                break;
            case "buscar":
                String nombre =request.getParameter("busqueda");
                productos = pdao.buscar(nombre);
                request.setAttribute("categorias", categoria);
                request.setAttribute("productos", productos);
                if (sesion.getAttribute("tipo").equals("Administrador")){
                    request.getRequestDispatcher("Vistas/VentasAdmin.jsp").forward(request, response);
                }
                break;
            case "salir":
                //HttpSession sesion = request.getSession();
                sesion.invalidate();
                response.sendRedirect("/AppWeb/Vistas/Loggin.jsp");
                break;
            case "AgregarCarrito":
                cantidad =1;
                int pos = 0;
                
                idp = Integer.parseInt(request.getParameter("id"));
                p = pdao.listarid(idp);
                if (listacarrito.size()>0){
                    for (int i = 0; i < listacarrito.size(); i++) {
                        if(idp == listacarrito.get(i).getIdproducto()){
                            pos = i;
                        }
                    }
                    if (idp == listacarrito.get(pos).getIdproducto()){
                        cantidad = cantidad + listacarrito.get(pos).getCantidad();
                        subtotal = cantidad * listacarrito.get(pos).getPreciocompra();
                        listacarrito.get(pos).setCantidad(cantidad);
                        listacarrito.get(pos).setSubtotal(subtotal);
                    }else{
                        item++;
                        car = new Carrito();
                        car.setItem(item);
                        car.setIdproducto(idp);
                        car.setNombre(p.getNombre());
                        car.setDescripcion(p.getDescripcion());
                        car.setFoto(p.getFoto());
                        car.setPreciocompra(p.getPrecio());
                        car.setCantidad(cantidad);
                        car.setSubtotal(cantidad * p.getPrecio());
                        listacarrito.add(car);
                    }
                }else{
                     item++;
                    car = new Carrito();
                    car.setItem(item);
                    car.setIdproducto(idp);
                    car.setNombre(p.getNombre());
                    car.setDescripcion(p.getDescripcion());
                    car.setFoto(p.getFoto());
                    car.setPreciocompra(p.getPrecio());
                    car.setCantidad(cantidad);
                    car.setSubtotal(cantidad * p.getPrecio());
                    listacarrito.add(car);
                }
                request.setAttribute("contador", listacarrito.size());
                request.getRequestDispatcher("CtrProducto?accion=home").forward(request, response);
                break;
            case "Carrito":
                totalpagar = 0;
                for (int i = 0; i < listacarrito.size(); i++) {
                    totalpagar = totalpagar + listacarrito.get(i).getSubtotal();
                }
                request.setAttribute("totalpagar", totalpagar);
                request.setAttribute("carrito", listacarrito);
                if (sesion.getAttribute("tipo").equals("Administrador")){
                    request.getRequestDispatcher("Vistas/CarritoAdmin.jsp").forward(request, response);
                }else if (sesion.getAttribute("tipo").equals("Cliente")){
                    request.getRequestDispatcher("Vistas/CarritoCliente.jsp").forward(request, response);
                }
                break;
            case "Comprar":
                totalpagar = 0;
                idp = Integer.parseInt(request.getParameter("id"));
                p = pdao.listarid(idp);
                item++;
                car = new Carrito();
                    car.setItem(item);
                    car.setIdproducto(idp);
                    car.setNombre(p.getNombre());
                    car.setDescripcion(p.getDescripcion());
                    car.setFoto(p.getFoto());
                    car.setPreciocompra(p.getPrecio());
                    car.setCantidad(cantidad);
                    car.setSubtotal(cantidad * p.getPrecio());
                    boolean producto = false;
                    int con= 0;
                    for (int i = 0; i < listacarrito.size(); i++) {
                        if(listacarrito.get(i).getIdproducto() == idp){
                            producto = true;
                            con = i;
                        }
                        totalpagar = totalpagar + listacarrito.get(i).getSubtotal();
                    }
                    if (producto == false){
                        listacarrito.add(car);
                        totalpagar = totalpagar + listacarrito.get(listacarrito.size()-1).getSubtotal();
                    }else{
                       listacarrito.get(con).setCantidad(listacarrito.get(con).getCantidad()+1);
                       listacarrito.get(con).setSubtotal(listacarrito.get(con).getPreciocompra() * listacarrito.get(con).getCantidad());
                       int can = listacarrito.get(con).getCantidad();
                       totalpagar = totalpagar + (listacarrito.get(con).getPreciocompra() *(can -1 ));
                    }
                request.setAttribute("contador", listacarrito.size());
                request.setAttribute("totalpagar", totalpagar);
                request.setAttribute("carrito", listacarrito);
                if (sesion.getAttribute("tipo").equals("Administrador")) {
                    request.getRequestDispatcher("Vistas/CarritoAdmin.jsp").forward(request, response);
                }
                break;
            case "Delete":
                int idproducto = Integer.parseInt(request.getParameter("idp"));
                for (int i = 0; i < listacarrito.size(); i++) {
                    if (idproducto == listacarrito.get(i).getIdproducto()){
                        listacarrito.remove(i);
                    }
                }
                break;
            case "ActualizarCantidad":
                System.out.println("entro actualizar cantidad ");
                int idpro = Integer.parseInt(request.getParameter("idp"));
                System.out.println("idpro = "+request.getParameter("idp"));
                int can = Integer.parseInt(request.getParameter("Cantidad"));
                System.out.println("entro actualizar cantidad cantidad = "+can);
                for (int i = 0; i < listacarrito.size(); i++) {
                    if (idpro == listacarrito.get(i).getIdproducto()){
                        listacarrito.get(i).setCantidad(can);
                        int st = listacarrito.get(i).getPreciocompra() * can;
                        listacarrito.get(i).setSubtotal(st);
                    }
                }
                break;
            case "listar":
                productos = pdao.listarT();
                request.setAttribute("producto", productos);
                request.setAttribute("categorias", categoria);
                request.getRequestDispatcher("/Vistas/ListarProductos.jsp").forward(request, response);
                break;
            case "buscarn":
                nombre = request.getParameter("txtbuscar");
                System.out.println("nombre: "+nombre);
                productos = pdao.listarT(nombre);
                request.setAttribute("producto", productos);
                request.setAttribute("categorias", categoria);
                request.getRequestDispatcher("/Vistas/ListarProductos.jsp").forward(request, response);
                break;
            case "Agregar":
                System.out.println("entro Agregar AppWeb");
                nom = request.getParameter("txtnombre");
                System.out.println("nombre producto: "+nom);
                des = request.getParameter("txtdescripcion");
                pre = Integer.parseInt(request.getParameter("txtprecio"));
                sto = Integer.parseInt(request.getParameter("txtstock"));
                cat = Integer.parseInt(request.getParameter("categoria"));
                System.out.println("categoria producto: "+cat);
                foto = "Imagenes/" + request.getParameter("foto");
                p.setNombre(nom);
                p.setDescripcion(des);
                p.setPrecio(pre);
                p.setStok(sto);
                p.setCategoria(cat);
                p.setFoto(foto);
                pdao.crear(p);
                request.getRequestDispatcher("CtrProducto?accion=listar").forward(request, response);
                break;
            case "EditarPro":
                int idp =Integer.parseInt(request.getParameter("idpro"));
                p = pdao.listarT(idp);
                request.setAttribute("Productoe", p);
                request.setAttribute("editarPro", true);
                productos = pdao.listarT();
                request.setAttribute("producto", productos);
                request.setAttribute("categorias", categoria);
                request.getRequestDispatcher("/Vistas/ListarProductos.jsp").forward(request, response);
                break;
            case "actualizarpro":
                int idprodu = Integer.parseInt(request.getParameter("txtid"));
                String nompro = request.getParameter("txtnombre");
                int prepro = Integer.parseInt(request.getParameter("txtprecio"));
                String despro = request.getParameter("txtdescripcion");
                int stopro = Integer.parseInt(request.getParameter("txtstock"));
                int catpro = Integer.parseInt(request.getParameter("cat"));
                String fotpro = request.getParameter("foto2");
                /*System.out.println("id producto: "+idprodu);
                System.out.println("nombre producto: "+nompro);
                System.out.println("precio producto: "+prepro);
                System.out.println("id descripcion: "+despro);
                System.out.println("id stock: "+stopro);
                System.out.println("id categoria: "+catpro);
                System.out.println("id foto: "+fotpro);*/
                p.setId(idprodu);
                p.setNombre(nompro);
                p.setPrecio(prepro);
                p.setDescripcion(despro);
                p.setStok(stopro);
                p.setCategoria(catpro);
                p.setFoto(fotpro);
                pdao.editar(p);
                request.getRequestDispatcher("CtrProducto?accion=listar").forward(request, response);
                break;
            case "pedido":
                if (listacarrito.size() > 0) {
                    
                    idusu = request.getParameter("idusu");
                    System.out.println("usuario " + idusu);
                    int idpago = 1;
                    fec = DateFormat.getDateInstance().format(d);
                    mon = Integer.parseInt(request.getParameter("totalp"));
                    estado = "En Proceso";
                    ped.setIdcliente(idusu);
                    ped.setFecha(fec);
                    ped.setMonto(mon);
                    ped.setEstado(estado);
                    ped.setIdpago(idpago);
                    peddao.crear(ped);
                    int idpe = peddao.listarId();
                    System.out.println("idpedido: " + idpe);
                    for (int i = 0; i < listacarrito.size(); i++) {
                        Detalle_Pedido dped = new Detalle_Pedido();
                        dped.setIdpedido(idpe);
                        dped.setIdproducto(listacarrito.get(i).getIdproducto());
                        dped.setNombre(listacarrito.get(i).getNombre());
                        dped.setCantidad(listacarrito.get(i).getCantidad());
                        dped.setPrecio(listacarrito.get(i).getPreciocompra());
                        dpdao.crear(dped);
                    }
                   Properties propiedad = new Properties();
                   propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
                   propiedad.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");
                   propiedad.setProperty("mail.smtp.starttls.enable", "true");
                   propiedad.setProperty("mail.smtp.port", "587");
                   propiedad.setProperty("mail.smtp.auth", "true");
                   
                   Session session1 = Session.getDefaultInstance(propiedad);
                   String correoenvio= "zarro1978@gmail.com";
                   String contrasena = "fhgklxoesgnpfkvf";
                   String destinatario = sesion.getAttribute("correo").toString();
                   String Asunto = "Pedido Generado";
                   String Mensaje = "Estimado cliente "+ sesion.getAttribute("User").toString() + "\n\n Su pedido ha sido gerenerado satisfactoriamente," + "\n\n Datos de su pedido: " + "\n\nNumero Pedido: "+idpe+"\nFecha: "+fec+"\nValor: "+mon+"\nEstado: "+estado;
                   
                   MimeMessage mail = new MimeMessage(session1);
                   
                   try{
                       mail.setFrom(new InternetAddress(correoenvio));
                       mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
                       mail.setSubject(Asunto);
                       mail.setText(Mensaje);
                       //mail.setContent(Mensaje, "text/html");
                       
                       Transport transporte = session1.getTransport("smtp");
                       transporte.connect(correoenvio, contrasena);
                       transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
                       transporte.close();
                   }catch(Exception e){
                       System.out.println("Error al enviar el correo: "+e);
                   }
                }
                listacarrito.removeAll(listacarrito);
                request.getRequestDispatcher("CtrProducto?accion=Carrito").forward(request, response);
               break;  
            case "HistorialPed":
                idcliente =request.getParameter("id");
                //idcli = Integer.parseInt(idcliente);
                us = usudao.list(idcliente);
                System.out.println("id cliente: "+idcliente);
                request.setAttribute("Usu", us);
                if (sesion.getAttribute("tipo") != null){
                    if (sesion.getAttribute("tipo").equals("Administrador")){
                        listapedido = peddao.listar();
                        request.setAttribute("Pedido", listapedido);
                        request.getRequestDispatcher("Vistas/Pedidos_Admin.jsp").forward(request, response);
                    }else{
                        if (sesion.getAttribute("tipo").equals("Cliente")){
                            listapedido = peddao.listar(idcliente);
                            request.setAttribute("pedido", listapedido);
                            request.getRequestDispatcher("Vistas/Pedidos_Cliente.jsp").forward(request, response);
                        }
                    }
                }else{
                    request.getRequestDispatcher("Vistas/index.jsp").forward(request, response);
                }
                break;
            case "DetallePed":
                String idcliente1 = request.getParameter("id");
                int id1 = Integer.parseInt(idcliente1);
                us = usudao.list(idcliente);
                System.out.println("id cliente: "+idcliente);
                request.setAttribute("Usu", us);
                idp = Integer.parseInt(request.getParameter("idped"));
                listadetped = dpdao.Listar(idp);
                request.setAttribute("mostrarmodal", true);
                request.setAttribute("detped", listadetped);
                if (sesion.getAttribute("tipo") != null){
                    if (sesion.getAttribute("tipo").equals("Administrador")){
                        listapedido = peddao.listar();
                        request.setAttribute("Pedido", listapedido);
                        request.getRequestDispatcher("Vistas/Pedidos_Admin.jsp").forward(request, response);
                    }else{
                        if (sesion.getAttribute("tipo").equals("Cliente")){
                            listapedido = peddao.listar(idcliente);
                            request.setAttribute("pedido", listapedido);
                            request.getRequestDispatcher("Vistas/Pedidos_Cliente.jsp").forward(request, response);
                        }
                    }
                }else{
                    request.getRequestDispatcher("Vistas/index.jsp").forward(request, response);
                }
                break;
            case "EditPed":
                String idcliente2 = request.getParameter("id");
                us = usudao.list(idcliente2);
                request.setAttribute("Usu", us);
                idp = Integer.parseInt(request.getParameter("idped"));
                ped = peddao.listar(idp);
                request.setAttribute("editarmodal", true);
                request.setAttribute("ped", ped);
                listapedido = peddao.listar();
                request.setAttribute("Pedido", listapedido);
                request.getRequestDispatcher("Vistas/Pedidos_Admin.jsp").forward(request, response);
                break;
            case "ActualizarPed":
                int idped = Integer.parseInt(request.getParameter("txtid"));
                String es = request.getParameter("estado");
                peddao.actualizar(es, idped);
                idcliente = request.getParameter("id");
                us = usudao.list(idcliente);
                request.setAttribute("Usu", us);
                listapedido = peddao.listar();
                request.setAttribute("Pedido", listapedido);
                request.getRequestDispatcher("Vistas/Pedidos_Admin.jsp").forward(request, response);
                break;
            case "busest":
                String est = request.getParameter("busest");
                listapedido = peddao.buscarest(est);
                idcliente = request.getParameter("id");
                us = usudao.list(idcliente);
                request.setAttribute("Usu", us);
                //listapedido = peddao.listar();
                request.setAttribute("Pedido", listapedido);
                request.getRequestDispatcher("Vistas/Pedidos_Admin.jsp").forward(request, response);
                break;
            case "Ayuda":
                request.setAttribute("Ayuda", true);
                request.getRequestDispatcher("CtrProducto?accion=home").forward(request, response);
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
