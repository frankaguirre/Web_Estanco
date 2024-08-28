<%-- 
    Document   : ListarProveedor
    Created on : 19/08/2024, 08:55:30 PM
    Author     : ALEANDRES RODRIGUEZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <title>Proveedor</title>
        <link href="../css/admin.css" rel="stylesheet" type="text/css"/>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <style>
            .contentmain h1 {
                border-bottom: 4px solid orange;
                padding-bottom: 10px;
                margin-bottom: 20px;
            }
            .table {
                background-color: #f8f9fa;
                border-radius: 8px;
                overflow: hidden;
            }
            .table thead {
                background-color: #343a40;
                color: white;
            }
            .table tbody tr:nth-child(even) {
                background-color: #f2f2f2;
            }
            .table tbody tr:hover {
                background-color: #e9ecef;
            }
            .table th, .table td {
                vertical-align: middle;
            }
            .btn-warning, .btn-danger {
                margin-right: 5px;
            }
            .modal-content {
                border-radius: 8px;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            }
            .modal-header {
                border-bottom: 2px solid #dee2e6;
                background-color: #f8f9fa;
            }
            .modal-title {
                font-size: 1.25rem;
                font-weight: 500;
            }
            .btn-close {
                display: none;
            }
            .btn-cancel {
                background-color: #6c757d;
                border-color: #6c757d;
            }
            .btn-cancel:hover {
                background-color: #5a6268;
                border-color: #545b62;
            }
            .modal-body {
                padding: 2rem;
            }
            .modal-footer {
                border-top: 2px solid #dee2e6;
                padding: 1rem;
                display: flex;
                justify-content: flex-end;
            }
            .modal-footer .btn {
                margin-left: 0.5rem;
            }
        </style>
    </head>
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
                        <a href="/EstancoCurrambero/vista/VentasAdmin.jsp">
                            <i class="bi bi-house-door"></i> Inicio
                        </a>
                    </li>
                    <li>
                        <a href="/EstancoCurrambero/vista/ListarProductos.jsp">
                            <i class="bi bi-grid"></i> Productos
                        </a>
                    </li>
                    <li>
                        <a href="/EstancoCurrambero/vista/ListarUsuario.jsp">
                            <i class="bi bi-people"></i> Usuarios
                        </a>
                    </li>
                    <li>
                        <a href="/EstancoCurrambero/vista/PedidosAdmin.jsp">
                            <i class="bi bi-box-seam"></i> Pedidos
                        </a>
                    </li>
                    <li>
                        <a href="/EstancoCurrambero/vista/ListarProveedor.jsp">
                            <i class="bi bi-folder"></i> Proveedores
                        </a>
                    </li>
                    <li>
                        <a href="/EstancoCurrambero/vista/Categorias.jsp">
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
                </ul>
                <div class="user-account">
                    <div class="user-profile">
                        <img src="images/profile-img.jpg" alt="Profile Image" />
                        <div class="user-detail">
                            <h3>Alejandra</h3>
                            <span>Administrador</span>
                        </div>
                    </div>
                </div>
            </aside>
            <main class="contentmain">
                <div class="container mt-5">
                    <div class="d-flex justify-content-between align-items-center mb-4">
                        <h1>Proveedores</h1>
                        <form class="form-inline mt-4 mb-4" action="#">
                            <div class="input-group">
                                <input type="text" class="form-control form-control-sm" name="txtbuscar" placeholder="Digite nombre">
                                <button type="submit" class="btn btn-success" name="accion" value="buscar">
                                    <i class="bi bi-search"></i> Buscar
                                </button>
                            </div>
                        </form>
                        <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#agregarUsuarioModal">
                            <i class="bi bi-plus-square"></i>
                        </button>
                    </div>

                    <table class="table table-bordered table-striped">
                        <thead>
                            <tr>
                                <th class="text-center">Id</th>
                                <th class="text-center">Ciudad</th>
                                <th class="text-center">Correo</th>
                                <th class="text-center">Nombre</th>
                                <th class="text-center">Tipo</th>
                                <th class="text-center">Telefono</th>
                                <th class="text-center">Nombre_Contacto</th>
                                <th class="text-center">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td class="text-center">1</td>
                                <td class="text-center">Juan</td>
                                <td class="text-center">Pérez</td>
                                <td class="text-center">Calle Falsa 123</td>
                                <td class="text-center">555-1234</td>
                                <td class="text-center">01/01/1990</td>
                                <td class="text-center">juan@gmail.com</td>
                                <td class="text-center">juanp</td>
                                <td class="text-center">Admin</td>
                                <td class="text-center">
                                    <a class="btn btn-warning" href="#"><i class="bi bi-pencil-fill"></i></a>
                                    <a class="btn btn-danger" href="#"><i class="bi bi-trash-fill"></i></a>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>

                
            </main>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-rbsA0bDhUn/TxU+0bD6I4BO15AVY8l+t9f/4coiTrTWGFj1PSJrAKFENIG+9j2N" crossorigin="anonymous"></script>
    </body>
</html>


