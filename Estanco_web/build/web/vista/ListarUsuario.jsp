<%-- 
    Document   : ListarUsuario
    Created on : 14/08/2024, 11:59:34 AM
    Author     : SENA
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>Usuarios</title>
        <link href="/Estanco_web/css/admin.css" rel="stylesheet" type="text/css"/>
    </head>
    <%
        if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')) {
            response.sendRedirect("../vista/Login.jsp");
        }
    %>
    <body>
        <div class="wrapper">
            <aside class="sidebar">
                <div class="sidebar-header">
                    <img src="images/logo.png" alt="CodingLab Logo" />
                    <h2>Estanco<br>Currambero</h2>
                </div>
                <ul class="sidebar-links">
                    <div class="menu-separator"></div>
                    <li>
                        <a href="/Estanco_web/vista/VentasAdmin.jsp">
                            <i class="bi bi-house-door"></i> Inicio
                        </a>
                    </li>
                    <li>
                        <a href="/Estanco_web/vista/ListarProductos.jsp">
                            <i class="bi bi-grid"></i> Productos
                        </a>
                    </li>
                    <li>
                        <a href="/Estanco_web/vista/ListarUsuario.jsp">
                            <i class="bi bi-people"></i> Usuarios
                        </a>
                    </li>
                    <li>
                        <a href="/Estanco_web/vista/PedidosAdmin.jsp">
                            <i class="bi bi-box-seam"></i> Pedidos
                        </a>
                    </li>
                    <li>
                        <a href="/Estanco_web/vista/ListarProveedor.jsp">
                            <i class="bi bi-folder"></i> Proveedores
                        </a>
                    </li>
                    <li>
                        <a href="/Estanco_web/vista/Categorias.jsp">
                            <i class="bi bi-tags"></i> Categorias
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <i class="bi bi-bar-chart"></i> Reportes
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <i class="bi bi-question-circle"></i> Ayuda
                        </a>
                    </li>
                    <li>
                        <a href="/Estanco_web/CtrProducto?accion=salir">
                            <i class="bi bi-box-arrow-left"></i> Salir
                        </a>
                    </li>
                </ul>
                <div class="user-account">
                    <div class="user-profile">
                        <img src="images/profile-img.jpg" alt="Profile Image" />
                        <div class="user-detail">
                            <h3>${usuario.getUsuario()}</h3>
                            <span>${usuario.getTipo()}</span>
                        </div>
                    </div>
                </div>
            </aside>
            <main class="contentmain">
                <div class="container mt-5">
                    <div class="d-flex justify-content-between align-items-center mb-4">
                        <h1>Usuarios</h1>
                        <!-- Formulario de búsqueda -->
                        <form class="form-inline mt-4 mb-4" action="/Estanco_web/CtrUsuario?accion=buscar" method="get">
                            <div class="input-group">
                                <input type="text" class="form-control form-control-sm" name="txtbuscar" placeholder="Digite nombre">
                                <button type="submit" class="btn btn-success" name="accion" value="buscar">
                                    <i class="bi bi-search"></i> Buscar
                                </button>
                            </div>
                        </form>
                        <!-- Botón para agregar usuario (abrir modal) -->
                        <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#agregarUsuarioModal">
                            <i class="bi bi-plus-square"></i> Agregar Usuario
                        </button>
                    </div>

                    <!-- Tabla de usuarios -->
                    <div class="row mt-3">
                        <div class="col-sm">
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th class="text-center">Id</th>
                                        <th class="text-center">Nombre</th>
                                        <th class="text-center">Apellido</th>
                                        <th class="text-center">Fecha de Nacimiento</th>
                                        <th class="text-center">Dirección</th>
                                        <th class="text-center">Telefono</th>
                                        <th class="text-center">Correo</th>
                                        <th class="text-center">Usuario</th>
                                        <th class="text-center">Tipo</th>
                                        <th class="text-center">Acciones</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <!-- Iteración sobre la lista de usuarios -->
                                    <c:forEach var="usu" items="${usuarios}">
                                        <tr>
                                            <td class="text-center">${usu.getId()}</td>
                                            <td class="text-center">${usu.getNombre()}</td>
                                            <td class="text-center">${usu.getApellido()}</td>
                                            <td class="text-center">${usu.getFecha_nacimiento()}</td>
                                       
                                            <td class="text-center">${usu.getTelefono()}</td>
                                            <td class="text-center">${usu.getCorreo()}</td>
                                            <td class="text-center">${usu.getUsuario()}</td>
                                            <td class="text-center">${usu.getTipo()}</td>
                                            <td class="text-center">
                                                <!-- Botón Editar -->
                                                <a class="btn btn-warning" href="#" data-bs-toggle="modal" data-bs-target="#editarUsuarioModal${usu.getId()}">
                                                    <i class="bi bi-pencil-fill"></i>
                                                </a>

                                                <!-- Botón Eliminar -->
                                                <a class="btn btn-danger" href="/Estanco_web/CtrUsuario?accion=eliminar&id=${usu.getId()}">
                                                    <i class="bi bi-trash-fill"></i>
                                                </a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    <c:forEach var="usu" items="${usuarios}">
                                        <!-- Modal para editar todos los campos del usuario -->
                                    <div class="modal fade" id="editarUsuarioModal${usu.getId()}" tabindex="-1" aria-labelledby="editarUsuarioModalLabel" aria-hidden="true">
                                        <div class="modal-dialog">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <h5 class="modal-title" id="editarUsuarioModalLabel">Editar Usuario</h5>
                                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                </div>
                                                <div class="modal-body">
                                                    <form action="/Estanco_web/CtrUsuario?accion=editar" method="post">
                                                        <input type="hidden" name="accion" value="actualizar">
                                                        <input type="hidden" name="id" value="${usu.getId()}">

                                                        <!-- Campo Nombre -->
                                                        <div class="mb-3">
                                                            <label for="nombre${usu.getId()}" class="form-label">Nombre</label>
                                                            <input type="text" class="form-control" name="nombre" id="nombre${usu.getId()}" value="${usu.getNombre()}" required>
                                                        </div>

                                                        <!-- Campo Apellido -->
                                                        <div class="mb-3">
                                                            <label for="apellido${usu.getId()}" class="form-label">Apellido</label>
                                                            <input type="text" class="form-control" name="apellido" id="apellido${usu.getId()}" value="${usu.getApellido()}" required>
                                                        </div>

                                                        <!-- Campo Fecha de Nacimiento -->
                                                        <div class="mb-3">
                                                            <label for="fecha_nacimiento${usu.getId()}" class="form-label">Fecha de Nacimiento</label>
                                                            <input type="date" class="form-control" name="fecha_nacimiento" id="fecha_nacimiento${usu.getId()}" value="${usu.getFecha_nacimiento()}" required>
                                                        </div>

                                                    
                                                      

                                                        <!-- Campo Teléfono -->
                                                        <div class="mb-3">
                                                            <label for="telefono${usu.getId()}" class="form-label">Teléfono</label>
                                                            <input type="text" class="form-control" name="telefono" id="telefono${usu.getId()}" value="${usu.getTelefono()}" required>
                                                        </div>

                                                        <!-- Campo Correo -->
                                                        <div class="mb-3">
                                                            <label for="correo${usu.getId()}" class="form-label">Correo</label>
                                                            <input type="email" class="form-control" name="correo" id="correo${usu.getId()}" value="${usu.getCorreo()}" required>
                                                        </div>

                                                        <!-- Campo Usuario -->
                                                        <div class="mb-3">
                                                            <label for="usuario${usu.getId()}" class="form-label">Usuario</label>
                                                            <input type="text" class="form-control" name="usuario" id="usuario${usu.getId()}" value="${usu.getUsuario()}" required>
                                                        </div>

                                                        <!-- Campo Tipo -->
                                                        <div class="mb-3">
                                                            <label for="tipo${usu.getId()}" class="form-label">Tipo</label>
                                                            <select class="form-control" name="tipo" id="tipo${usu.getId()}" required>
                                                                <option value="Administrador" ${usu.getTipo() eq 'Administrador' ? 'selected' : ''}>Administrador</option>
                                                                <option value="Cliente" ${usu.getTipo() eq 'Cliente' ? 'selected' : ''}>Cliente</option>
                                                            </select>
                                                        </div>

                                                        <div class="modal-footer">
                                                            <button type="submit" class="btn btn-primary">Guardar cambios</button>
                                                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                                        </div>
                                                    </form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>




                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>

                <!-- Modal para agregar usuario -->
                <div class="modal fade" id="agregarUsuarioModal" tabindex="-1" aria-labelledby="agregarUsuarioModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="agregarUsuarioModalLabel">Agregar Usuario</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <form action="/Estanco_web/CtrUsuario?accion=nuevo" method="post">
                                    <input type="hidden" name="accion" value="agregar">

                                    <div class="mb-3">
                                        <label for="nombre" class="form-label">Nombre</label>
                                        <input type="text" class="form-control" name="nombre" id="nombre" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="apellido" class="form-label">Apellido</label>
                                        <input type="text" class="form-control" name="apellido" id="apellido" required>
                                    </div>
                                    
                                    <div class="mb-3">
                                        <label for="telefono" class="form-label">Teléfono</label>
                                        <input type="text" class="form-control" name="telefono" id="telefono" required>
                                    </div>
                                    <div class="input-group">
                                        <label for="correo" class="form-label">Fecha_nacimiento</label>
                                        <div class="input-group">
                                            <i class="fas fa-calendar icon"></i>
                                            <input type="date" class="formulario_input" name="fechanaci" id="fechanaci" required>
                                        </div>
                                        <input type="date" class="formulario_input" name="fechanaci" id="fechanaci" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="correo" class="form-label">Correo</label>
                                        <input type="email" class="form-control" name="correo" id="correo" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="usuario" class="form-label">Usuario</label>
                                        <input type="text" class="form-control" name="usuario" id="usuario" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="contrasena" class="form-label">contraseña</label>
                                        <input type="text" class="form-control" name="contrasena" id="contrasena" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="tipo" class="form-label">Tipo</label>
                                        <select class="form-control" name="tipo" id="tipo" required>
                                            <option value="Administrador">Administrador</option>
                                            <option value="Cliente">Cliente</option>
                                        </select>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" hrf="/Estanco_web/vista/ListarUsuario.jsp" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                        <button type="submit" hrf="/Estanco_web/vista/ListarUsuario.jsp" class="btn btn-primary">Agregar Usuario</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </main>

        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>                        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>  
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-rbsA0bDhUn/TxU+0bD6I4BO15AVY8l+t9f/4coiTrTWGFj1PSJrAKFENIG+9j2N" crossorigin="anonymous"></script>
    </body>
</html>

