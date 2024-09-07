<%-- 
    Document   : ProductoDes
    Created on : 15/08/2024, 10:29:21 AM
    Author     : ALEANDRES RODRIGUE
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>Producto Descripcion</title>
        <link href="/Estanco_web/css/inicio.css" rel="stylesheet" type="text/css"/>
    </head>
    <style>
        body {
            background: linear-gradient(120deg, #f0f4f8, #d9e2ec);
            font-family: 'Roboto', sans-serif;
            color: #343a40;
        }

        header {
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        .navbar-dark {
            background-color: #343a40;
        }

        .navbar-dark .navbar-brand, 
        .navbar-dark .nav-link {
            color: #ffffff;
            font-weight: bold;
        }

        .navbar-dark .nav-link:hover {
            color: #ffc107;
        }

        .navbar-dark .nav-link i {
            color: #ffffff; 
        }


        .container {
            background: #ffffff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.15);
            margin-top: 30px;
        }

        h1 {
            font-weight: 700;
            color: #495057;
            text-transform: uppercase;
            border-bottom: 3px solid #ffa500;
            display: inline-block;
            padding-bottom: 10px;
            margin-bottom: 30px;
        }

        .table-striped tbody tr:nth-of-type(odd) {
            background-color: rgba(0, 0, 0, 0.03);
        }

        .table thead {
            background-color: #007bff;
            color: #ffffff;
            text-transform: uppercase;
            font-weight: bold;
        }

        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
            transition: all 0.3s;
            font-weight: bold;
        }

        .btn-primary:hover {
            background-color: #0056b3;
            border-color: #004085;
        }

        .btn-warning {
            background-color: #ffcc00;
            border-color: #ffcc00;
            transition: all 0.3s;
            font-weight: bold;
        }

        .btn-warning:hover {
            background-color: #cc9900;
            border-color: #cc9900;
        }

        .btn-danger {
            background-color: #e60000;
            border-color: #e60000;
            transition: all 0.3s;
            font-weight: bold;
        }

        .btn-danger:hover {
            background-color: #cc0000;
            border-color: #cc0000;
        }

        .modal-content {
            border-radius: 10px;
            padding: 20px;
            background: #f8f9fa;
            box-shadow: 0 6px 12px rgba(0, 0, 0, 0.2);
        }

        .form-label {
            font-weight: 600;
        }

        .btn-close {
            background-color: #e60000;
            color: #ffffff;
        }

        .btn-close:hover {
            background-color: #cc0000;
        }

        .dropdown-menu {
            border-radius: 8px;
            background: #f8f9fa;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.15);
        }

        .dropdown-item:hover {
            background-color: #007bff;
            color: #ffffff;
        }

    </style>
    <body>
        <header>
            <nav class="navbar navbar-dark bg-dark justify-content-between px-3">
                <a href="/Estanco_web/CtrProducto?accion=inicio" class="navbar-brand">Inicio</a>
                <div class="d-flex align-items-center">
                    <a href="/Estanco_web/vista/Carrito.jsp" class="nav-link"><i class="bi bi-cart3"></i> Carrito</a>
                    <a href="#" class="nav-link">Ofertas</a>
                    <div class="dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="categoriasDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Categorías
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="categoriasDropdown">
                            <c:forEach var="c" items="${categorias}">
                                <li><a class="dropdown-item" href="/Estanco_web/CtrProducto?accion=buscarcat&catid=${c.getId()}">${c.getNombre()}</a></li>
                                <input type="hidden" value="${c.getId()}" name="catid" id="catid">
                            </c:forEach>
                        </ul>
                    </div>
                    <a href="#" class="nav-link">Ayuda</a>
                    <form class="d-flex ms-3" style="width: 340px;">
                        <input class="form-control me-2" type="search" placeholder="Buscar" aria-label="Buscar">
                        <button class="btn btn-outline-light" type="submit"><i class="bi bi-search"></i></button>
                    </form>
                    <a href="/Estanco_web/vista/Login.jsp" class="nav-link">Iniciar Sesión</a>
                    <a href="#" class="nav-link">Crear Cuenta</a>
                </div>
            </nav>
        </header>
        <div class="container mt-5">
            <div class="row">
                <!-- Product Image -->
                <div class="col-md-6">
                    <img src="ruta-de-imagen.jpg" class="img-fluid" alt="Nombre del Producto">
                </div>

                <div class="col-md-6">
                    <h1 class="product-title">Nombre del Producto</h1>
                    <p class="product-price text-success" style="font-size: 1.5rem;">$ Precio</p>

                    <ul class="product-features list-unstyled">
                        <li><i class="bi bi-check-circle-fill text-success"></i> Característica 1</li>
                        <li><i class="bi bi-check-circle-fill text-success"></i> Característica 2</li>
                        <li><i class="bi bi-check-circle-fill text-success"></i> Característica 3</li>
                    </ul>

                    <!-- Botones organizados en columna -->
                    <div class="d-grid gap-2">
                        <button class="btn btn-outline-danger btn-sm">Comprar Ahora</button>
                        <button class="btn btn-outline-primary btn-sm">Agregar al Carrito</button>
                    </div>
                </div>

            </div>

            <!-- Product Description -->
            <div class="row mt-5">
                <div class="col-12">
                    <h4>Descripción del Producto</h4>
                    <p>Este producto ofrece las siguientes ventajas...</p>
                </div>
            </div>
        </div>

        <!-- Modal de Iniciar Sesión -->
        <div class="modal fade" id="IniciarSesion" tabindex="-1" aria-labelledby="loginModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content" style="border-radius: 10px; background-color: rgba(255, 255, 255, 0.8);">
                    <div class="modal-body d-flex flex-column align-items-center text-center">
                        <h5 class="modal-title mb-4" id="loginModalLabel" style="color: black;">Iniciar Sesión</h5>
                        <form action="#" class="w-100 d-flex flex-column align-items-center">
                            <div class="mb-3 w-75">
                                <input type="text" id="username" class="form-control" placeholder="Usuario" required style="border-radius: 5px;">
                            </div>
                            <div class="mb-3 w-75">
                                <input type="password" id="password" class="form-control" placeholder="Contraseña" required style="border-radius: 5px;">
                            </div>
                            <button type="submit" class="btn custom-btn w-75">Ingresar</button>
                        </form>
                        <p class="mt-4" style="color: black;">¿No tienes una cuenta? <a href="#" data-bs-toggle="modal" data-bs-target="#CrearCuenta">Regístrate</a></p>
                    </div>
                </div>
            </div>
        </div>



        <!-- Modal de Crear Cuenta -->
        <div class="modal fade" id="CrearCuenta" tabindex="-1" aria-labelledby="registerModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content" style="border-radius: 10px; background-color: rgba(255, 255, 255, 0.8);">
                    <div class="modal-body d-flex flex-column align-items-center text-center">
                        <h5 class="modal-title mb-4" id="registerModalLabel" style="color: black;">Crea tu Cuenta</h5>
                        <form action="#" class="w-100 d-flex flex-column align-items-center">
                            <div class="mb-3 w-75">
                                <input type="text" id="newUser" class="form-control" placeholder="Usuario" required style="border-radius: 5px;">
                            </div>
                            <div class="mb-3 w-75">
                                <input type="email" id="email" class="form-control" placeholder="Correo Electrónico" required style="border-radius: 5px;">
                            </div>
                            <div class="mb-3 w-75">
                                <input type="password" id="newPassword" class="form-control" placeholder="Contraseña" required style="border-radius: 5px;">
                            </div>
                            <button type="submit" class="btn custom-btn w-75">Crear Cuenta</button>
                        </form>
                        <p class="mt-4" style="color: black;">¿Ya tienes una cuenta? <a href="#" data-bs-toggle="modal" data-bs-target="#IniciarSesion">Inicia Sesión</a></p>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
