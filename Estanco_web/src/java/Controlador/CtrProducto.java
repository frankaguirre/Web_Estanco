package Controlador;

import Modelo.Categoria;
import Modelo.CategoriaDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CtrProducto", urlPatterns = {"/CtrProducto"})
public class CtrProducto extends HttpServlet {

    ProductoDAO pdao = new ProductoDAO();
    CategoriaDAO cdao = new CategoriaDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        HttpSession sesion = request.getSession();
        
        List<Producto> productos = pdao.listar();
        List<Categoria> categorias = cdao.Listar();
        
        switch (accion) {
            case "inicio":
                request.setAttribute("categorias", categorias);
                request.setAttribute("productos", productos);
                String tipoUsuario = (String) sesion.getAttribute("Tipo");
                
                if (tipoUsuario != null) {
                    if ("administrador".equals(tipoUsuario)) {
                        request.getRequestDispatcher("/Estanco_web/vista/VentasAdmin.jsp").forward(request, response);
                    } else if ("cliente".equals(tipoUsuario)) {
                        request.getRequestDispatcher("/Estanco_web/vista/VentasCliente.jsp").forward(request, response);
                    } else {
                        response.sendRedirect("/vista/Inicio.jsp");
                    }
                } else {
                    response.sendRedirect("/vista/Inicio.jsp");
                }
                break;
                
            case "salir":
                sesion.invalidate();
                response.sendRedirect("/Estanco_web/vista/Inicio.jsp");
                break;
                
            default:
                response.sendRedirect("/vista/Inicio.jsp");
                break;
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
