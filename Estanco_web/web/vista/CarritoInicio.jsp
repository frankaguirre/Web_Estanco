<%-- 
    Document   : CarritoInicio
    Created on : 19/08/2024, 09:40:45 PM
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
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <link href="../css/inicio.css" rel="stylesheet" type="text/css"/>
        <title>Inicia Sesíon para realizar tus compras</title>
        <style>
            body {
               height: 100%;
            margin: 0;
            background-image: url('../imagenes/imagencarrito.jpg');
            background-size: cover; 
            background-position: center; 
            background-repeat: no-repeat; 
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

            .container {
                background: #ffffff;
                padding: 20px;
                border-radius: 10px;
                box-shadow: 0 8px 16px rgba(0, 0, 0, 0.15);
                margin-top: 30px;
            }

            .empty-cart {
                display: flex;
                align-items: center;
                justify-content: center;
                height: 350px;
            }

            .empty-cart img {
                max-width: 350px;
                margin-right: 50px;
            }

            .empty-cart h2 {
                font-size: 2rem;
                color: #343a40;
                font-weight: 700;
            }

            .empty-cart a {
                color: #007bff;
                text-decoration: underline;
            }
        </style>
    </head>
    <body>
        <header>
            <nav class="navbar navbar-dark bg-dark justify-content-between px-3">
                <a href="/Estanco_web/vista/Inicio.jsp" class="navbar-brand">Inicio</a>
                <div class="d-flex align-items-center">
                    <a href="/Estanco_web/vista/CarritoInicio.jsp" class="nav-link"><i class="bi bi-cart3"></i> Carrito</a>
                    <a href="#" class="nav-link">Ofertas</a>
                    <div class="dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="categoriasDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Categorías
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="categoriasDropdown">
                            <li><a class="dropdown-item" href="#">Cervezas</a></li>
                            <li><a class="dropdown-item" href="#">Licores</a></li>
                            <li><a class="dropdown-item" href="#">Mecatos</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="#">Otras</a></li>
                        </ul>
                    </div>
                    <a href="#" class="nav-link">Ayuda</a>
                    <form class="d-flex ms-3" style="width: 340px;">
                        <input class="form-control me-2" type="search" placeholder="Buscar" aria-label="Buscar">
                        <button class="btn btn-outline-light" type="submit"><i class="bi bi-search"></i></button>
                    </form>
                    <div class="dropdown ms-3">
                        <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            <i class="bi bi-person"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="userDropdown">
                            <li><a class="dropdown-item" href="URL_DE_INICIO_SESION">Iniciar Sesión</a></li>
                            <li><a class="dropdown-item" href="URL_DE_CREAR_CUENTA">Crear Cuenta</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>

        <div class="container mt-4">
            <div class="empty-cart">
                <img src="../imagenes/carrito.jpeg" alt=""/>
                <div>
                    <h2>Inicia sesión para realizar tus compras</h2>
                    <a href="URL_DE_INICIO_SESION">Inicia sesión aquí</a> o <a href="URL_DE_CREAR_CUENTA">crea una cuenta</a>.
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
                        <h5 class="modal-title mb-4" id="registerModalLabel" style="color: black;">Crear Cuenta</h5>
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
                            <button type="submit" class="btn custom-btn w-75">Registrar</button>
                        </form>
                        <p class="mt-4" style="color: black;">¿Ya tienes una cuenta? <a href="#" data-bs-toggle="modal" data-bs-target="#IniciarSesion">Inicia Sesión</a></p>
                    </div>
                </div>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
