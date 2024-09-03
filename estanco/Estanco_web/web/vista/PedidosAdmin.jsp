<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- 
    Document   : PedAdmin
    Created on : 15/08/2024, 11:28:44 PM
    Author     : Omar
--%>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <title>Pedidos</title>
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
                background-color: #ffffff; /* Cambiar el color de fondo del encabezado a blanco */
                color: #000000; /* Cambiar el color del texto a negro para un mejor contraste */
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
                <div class="container mt-4">
                    <div class="col-sm-2">
                            <h1>Pedidos</h1>
                        </div>
                    <div class="row">
                        <div class="col-sm-6">
                            <form class="d-flex" action="#" method="post">
                                <input class="form-control me-2" type="search" placeholder="idpedido" aria-label="Search" name="busqueda">
                                <button class="btn btn-success" type="submit">Buscar</button>
                            </form>
                        </div>
                        <div class="col-sm-6">
                            <form class="d-flex" action="#" method="post">
                                <select class="form-control me-2" name="busest" aria-label="Search">
                                    <option value="En Proceso">En Proceso</option>
                                    <option value="Despachado">Despachado</option>
                                    <option value="Entregado">Entregado</option>
                                </select>
                                <button class="btn btn-success" type="submit">Buscar</button>
                            </form>
                        </div>
                    </div>
                    <div class="row mt-3">
                        <div class="col-sm">
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th class="text-center">Pedido</th>
                                        <th class="text-center">Fecha</th>
                                        <th class="text-center">Valor</th>
                                        <th class="text-center">Estado</th>
                                        <th class="text-center">Detalle</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td class="text-center">1</td>
                                        <td class="text-center">12/08/2024</td>
                                        <td class="text-center">$100.000</td>
                                        <td class="text-center">En Proceso</td>
                                        <td class="text-center">
                                            <button class="btn btn-info text-center" data-bs-toggle="modal" data-bs-target="#verModal"><i class="bi bi-eye"></i> Ver</button>
                                            <button class="btn btn-warning text-center" data-bs-toggle="modal" data-bs-target="#editarModal"><i class="bi bi-pencil"></i> Editar</button>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center">2</td>
                                        <td class="text-center">13/08/2024</td>
                                        <td class="text-center">$200.000</td>
                                        <td class="text-center">Despachado</td>
                                        <td class="text-center">
                                            <button class="btn btn-info text-center" data-bs-toggle="modal" data-bs-target="#verModal"><i class="bi bi-eye"></i> Ver</button>
                                            <button class="btn btn-warning text-center" data-bs-toggle="modal" data-bs-target="#editarModal"><i class="bi bi-pencil"></i> Editar</button>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>

                <!-- Modales para Ver y Editar -->
                <!-- Modal Ver -->
                <div class="modal fade" id="verModal" tabindex="-1" aria-labelledby="verModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="verModalLabel">Detalles del Pedido</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <!-- Contenido de los detalles del pedido -->
                                <p>Pedido: 1</p>
                                <p>Fecha: 12/08/2024</p>
                                <p>Valor: $100.000</p>
                                <p>Estado: En Proceso</p>
                                <!-- Otros detalles del pedido -->
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Modal Editar -->
                <div class="modal fade" id="editarModal" tabindex="-1" aria-labelledby="editarModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="editarModalLabel">Editar Pedido</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <!-- Formulario para editar los detalles del pedido -->
                                <form>
                                    <div class="mb-3">
                                        <label for="pedidoId" class="form-label">ID Pedido</label>
                                        <input type="text" class="form-control" id="pedidoId" value="1" readonly>
                                    </div>
                                    <div class="mb-3">
                                        <label for="pedidoFecha" class="form-label">Fecha</label>
                                        <input type="date" class="form-control" id="pedidoFecha" value="2024-08-12">
                                    </div>
                                    <div class="mb-3">
                                        <label for="pedidoValor" class="form-label">Valor</label>
                                        <input type="text" class="form-control" id="pedidoValor" value="$100.000">
                                    </div>
                                    <div class="mb-3">
                                        <label for="pedidoEstado" class="form-label">Estado</label>
                                        <select class="form-control" id="pedidoEstado">
                                            <option value="En Proceso" selected>En Proceso</option>
                                            <option value="Despachado">Despachado</option>
                                            <option value="Entregado">Entregado</option>
                                        </select>
                                    </div>
                                    <!-- Otros campos de edición -->
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary btn-cancel" data-bs-dismiss="modal">Cancelar</button>
                                <button type="button" class="btn btn-primary">Guardar Cambios</button>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" crossorigin="anonymous"></script>
    </body>
</html>
