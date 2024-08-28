<%-- 
    Document   : PedAdmin
    Created on : 15/08/2024, 11:28:44 PM
    Author     : Omar
--%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <title>Ordenes</title>
</head>
<body>
    <header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand mx-auto" href="/EstancoCurrambero/vista/VentasAdmin.jsp" style="color: white;">Inicio</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-around" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="#" style="color: white;"><i class="bi bi-cart3"></i> Carrito</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#" style="color: white;">Ofertas</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="categoriasDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false" style="color: white;">
                                Categorías
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="categoriasDropdown">
                                <li><a class="dropdown-item" href="#">Cervezas</a></li>
                                <li><a class="dropdown-item" href="#">Licores</a></li>
                                <li><a class="dropdown-item" href="#">Mecatos</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item" href="#">Otras</a></li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#" style="color: white;">Ayuda</a>
                        </li>
                    </ul>
                    <form class="d-flex" action="#" method="post">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="busqueda">
                        <button class="btn btn-outline-light" type="submit" value="buscar"><i class="bi bi-search"></i></button>
                    </form>
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false" style="color: white;">
                                <i class="bi bi-person"></i>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="userDropdown">
                                <li><a class="dropdown-item" href="URL_DE_INICIO_SESION">Administrador</a></li>
                                <li><a class="dropdown-item" href="URL_DE_CREAR_CUENTA">Pedidos</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <!-- Contenido principal -->
    <div class="container mt-4">
        <div class="row">
            <div class="col-sm-2">
                <h3>Ordenes</h3>
            </div>
            <div class="col-sm-5">
                <form class="d-flex" action="#" method="post">
                    <input class="form-control me-2" type="search" placeholder="idpedido" aria-label="Search" name="busqueda">
                    <button class="btn btn-outline-success" type="submit">Buscar</button>
                </form>
            </div>
            <div class="col-sm-5">
                <form class="d-flex" action="#" method="post">
                    <select class="form-control me-2" name="busest" aria-label="Search">
                        <option value="En Proceso">En Proceso</option>
                        <option value="Despachado">Despachado</option>
                        <option value="Entregado">Entregado</option>
                    </select>
                    <button class="btn btn-outline-success" type="submit">Buscar</button>
                </form>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-sm-7">
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
                                <button class="btn btn-outline-info text-center" data-bs-toggle="modal" data-bs-target="#verModal"><i class="bi bi-eye"></i> Ver</button>
                                <button class="btn btn-outline-warning text-center" data-bs-toggle="modal" data-bs-target="#editarModal"><i class="bi bi-pencil"></i> Editar</button>
                            </td>
                        </tr>
                        <tr>
                            <td class="text-center">2</td>
                            <td class="text-center">13/08/2024</td>
                            <td class="text-center">$200.000</td>
                            <td class="text-center">Despachado</td>
                            <td class="text-center">
                                <button class="btn btn-outline-info text-center" data-bs-toggle="modal" data-bs-target="#verModal"><i class="bi bi-eye"></i> Ver</button>
                                <button class="btn btn-outline-warning text-center" data-bs-toggle="modal" data-bs-target="#editarModal"><i class="bi bi-pencil"></i> Editar</button>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="col-sm-5">
                <div class="card">
                    <div class="card-header">
                        <h3 class="text-center">Datos del Administrador</h3>
                    </div>
                    <div class="card-body">
                        <label>Identificación: </label>
                        <h5>123456789</h5>
                        <label>Nombre: </label>
                        <h5>Omar Pérez</h5>
                        <label>Dirección: </label>
                        <h5>Calle Falsa 123</h5>
                        <label>Teléfono: </label>
                        <h5>3001234567</h5>
                        <label>Email: </label>
                        <h5>omar.perez@example.com</h5>
                    </div>
                    <div class="card-footer">
                        <a class="btn btn-outline-success btn-block" href="#" id="btnprint">Imprimir <i class="bi bi-printer"></i></a>
                    </div>
                </div>
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
                    <!-- Formulario de edición de pedido -->
                    <form>
                        <div class="mb-3">
                            <label for="idPedido" class="form-label">ID Pedido</label>
                            <input type="text" class="form-control" id="idPedido" value="1" disabled>
                        </div>
                        <div class="mb-3">
                            <label for="estadoPedido" class="form-label">Estado</label>
                            <select class="form-select" id="estadoPedido">
                                <option selected>En Proceso</option>
                                <option value="1">Despachado</option>
                                <option value="2">Entregado</option>
                            </select>
                        </div>
                        <!-- Otros campos del formulario de edición -->
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
                    <button type="button" class="btn btn-primary">Guardar cambios</button>
                </div>
            </div>
        </div>
    </div>

    <!-- Scripts de Bootstrap -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" crossorigin="anonymous"></script>
</body>
</html>


