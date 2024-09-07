<%-- 
    Document   : ListarUsuario
    Created on : 14/08/2024, 11:59:34 AM
    Author     : SENA
--%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>Usuarios</title>
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
                            <h3>Alejandra</h3>
                            <span>Administrador</span>
                        </div>
                    </div>
                </div>
            </aside>
            <main class="contentmain">
                <div class="container mt-5">
                    <div class="d-flex justify-content-between align-items-center mb-4">
                        <h1>Usuarios</h1>
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
                                <th class="text-center">Nombre</th>
                                <th class="text-center">Apellido</th>
                                <th class="text-center">Direcci�n</th>
                                <th class="text-center">Tel�fono</th>
                                <th class="text-center">Fecha Nacimiento</th>
                                <th class="text-center">Correo</th>
                                <th class="text-center">Usuario</th>
                                <th class="text-center">Tipo</th>
                                <th class="text-center">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td class="text-center">1</td>
                                <td class="text-center">Juan</td>
                                <td class="text-center">P�rez</td>
                                <td class="text-center">Calle Falsa 123</td>
                                <td class="text-center">555-1234</td>
                                <td class="text-center">01/01/1990</td>
                                <td class="text-center">juan@gmail.com</td>
                                <td class="text-center">juanp</td>
                                <td class="text-center">Admin</td>
                                <td class="text-center">
                                    <a class="btn btn-warning" href="#" data-bs-toggle="modal" data-bs-target="#editarUsuarioModal"><i class="bi bi-pencil-fill"></i></a>
                                    <a class="btn btn-danger" href="#"><i class="bi bi-trash-fill"></i></a>
                                </td>
                            </tr>
                        </tbody>
                    </table>
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
                                <form>
                                    <div class="mb-3">
                                        <label for="userId" class="form-label">Id</label>
                                        <input type="text" class="form-control" id="id" name="id" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="userName" class="form-label">Nombre</label>
                                        <input type="text" class="form-control" id="nombre" name="nombre" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="userLastName" class="form-label">Apellido</label>
                                        <input type="text" class="form-control" id="apellido" name="apellido" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="userAddress" class="form-label">Direcci�n</label>
                                        <input type="text" class="form-control" id="direccion" name="direccion" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="userPhone" class="form-label">Tel�fono</label>
                                        <input type="text" class="form-control" id="telefono" name="telefono" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="userBirthDate" class="form-label">Fecha Nacimiento</label>
                                        <input type="date" class="form-control" id="fechanaci" name="fechanaci" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="userEmail" class="form-label">Correo</label>
                                        <input type="email" class="form-control" id="correo" name="correo" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="userUsername" class="form-label">Usuario</label>
                                        <input type="text" class="form-control" id="usuario" name="usuario" required>
                                    </div>
                                    <div class="mb-3" id="grupo_tipo">
                                        <label for="id" class="formulario_label">Tipo</label> 
                                        <div class="formulario_grupo-input">
                                            <select class="form control formulario_input" name="tipo">
                                                <option value="Administrador">Administrador</option> 
                                                <option value="Usuario">Usuario</option> 
                                                <option value="Invitado">Invitado</option> 
                                                <option value="Cliente">Cliente</option> 
                                            </select><br>
                                        </div><br>
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-cancel" data-bs-dismiss="modal">Cancelar</button>
                                <button type="submit" class="btn btn-primary">Guardar</button>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Modal para editar usuario -->
                <div class="modal fade" id="editarUsuarioModal" tabindex="-1" aria-labelledby="editarUsuarioModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="editarUsuarioModalLabel">Editar Usuario</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <form>
                                    <div class="mb-3">
                                        <label for="editUserId" class="form-label">Id</label>
                                        <input type="text" class="form-control" id="editUserId" value="1" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="editUserName" class="form-label">Nombre</label>
                                        <input type="text" class="form-control" id="editUserName" value="Juan" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="editUserLastName" class="form-label">Apellido</label>
                                        <input type="text" class="form-control" id="editUserLastName" value="P�rez" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="editUserAddress" class="form-label">Direcci�n</label>
                                        <input type="text" class="form-control" id="editUserAddress" value="Calle Falsa 123" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="editUserPhone" class="form-label">Tel�fono</label>
                                        <input type="text" class="form-control" id="editUserPhone" value="555-1234" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="editUserBirthDate" class="form-label">Fecha Nacimiento</label>
                                        <input type="date" class="form-control" id="editUserBirthDate" value="1990-01-01" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="editUserEmail" class="form-label">Correo</label>
                                        <input type="email" class="form-control" id="editUserEmail" value="juan@gmail.com" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="editUserUsername" class="form-label">Usuario</label>
                                        <input type="text" class="form-control" id="editUserUsername" value="juanp" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="editUserType" class="form-label">Tipo</label>
                                        <input type="text" class="form-control" id="editUserType" value="Admin" required>
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-cancel" data-bs-dismiss="modal">Cancelar</button>
                                <button type="submit" class="btn btn-primary">Guardar Cambios</button>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-rbsA0bDhUn/TxU+0bD6I4BO15AVY8l+t9f/4coiTrTWGFj1PSJrAKFENIG+9j2N" crossorigin="anonymous"></script>
    </body>
</html>

