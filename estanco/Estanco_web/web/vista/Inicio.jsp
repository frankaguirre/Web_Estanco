<%-- 
    Document   : newjs
    Created on : 12/08/2024, 07:03:31 PM
    Author     : ALEANDRES RODRIGUEZ
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>Estanco Currambero</title>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <link href="../css/inicio.css" rel="stylesheet" type="text/css"/>
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
                color: #ffffff; /* Asegura que los íconos también sean blancos */
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
                    <div>
                        <div class="dropdown d-flex align-items-center">
                            <a class="nav-link dropdown-toggle me-3" href="#" id="userDropdown" role="button" data-bs-toggle="modal" data-bs-target="#IniciarSesion" aria-expanded="false">
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


        <!-- Carousel -->
        <div class="carousel">
            <div class="list">
                <div class="item">
                    <img src="../imagenes/img1.jpg" alt=""/>
                    <div class="content">
                        <div class="title">TODO TIPO</div>
                        <div class="topic">DE CERVEZAS</div>
                        <div class="des">
                            Descubre nuestra amplia variedad de cervezas para satisfacer tus gustos y preferencias.
                            <br> Tenemos una selección de las mejores marcas y estilos de cervezas para disfrutar en cualquier momento.
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img src="../imagenes/img2.jpg" alt=""/>
                    <div class="content">
                        <div class="title">Licores</div>
                        <div class="topic">Y RON</div>
                        <div class="des">Descubre nuestra amplia variedad de licores para crear tus cócteles favoritos o disfrutar en su pureza. Tenemos una selección de las mejores marcas y tipos de licores para satisfacer tus gustos.
                            <br>Aguardiente: El clásico licor colombiano, perfecto para acompañar tus momentos con amigos.
                            <br>Ron Medellín: Un ron suave y afrutado, ideal para disfrutar solo o con tus cócteles favoritos.
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img src="../imagenes/img3.jpg" alt=""/>
                    <div class="content">
                        <div class="title">MECATOS</div>
                        <div class="topic">Y MÁS...</div>
                        <div class="des">
                            Disfruta de la mejor selección de mecatos para acompañar tus momentos especiales. <br>Encontrarás una variedad de marcas y sabores para satisfacer tus antojos. <br>Desde los clásicos mecatos hasta las opciones más exóticas, tenemos los mecatos perfectos para ti!!
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img src="../imagenes/img4.jpg" alt=""/>
                    <div class="content">
                        <div class="title">GASEOSAS</div>
                        <div class="topic">Y ENERGIZANTES</div>
                        <div class="des">Refresca y revitaliza con nuestra variedad de gaseosas y bebidas energizantes. <br>Encontrarás las mejores marcas y sabores para satisfacer tus antojos y necesidades.
                        </div>
                    </div>
                </div>
            </div>

            <div class="thumbnail">
                <div class="item">
                    <img src="../imagenes/img1.jpg" alt=""/>
                    <div class="content">
                        <div class="title">
                            Contamos con todo tipo de Cervezas.
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img src="../imagenes/img2.jpg" alt=""/>
                    <div class="content">
                        <div class="title">
                            ¡Los mejores licores y ron del mercado!!
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img src="../imagenes/img3.jpg" alt=""/>
                    <div class="content">
                        <div class="title">
                            ¡Mecatos y más!
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img src="../imagenes/img4.jpg" alt=""/>
                    <div class="content">
                        <div class="title">
                            Gaseosas y Energizantes!!
                        </div>
                    </div>
                </div>
            </div>

            <div class="arrows">
                <button id="prev"><</button>
                <button id="next">></button>
            </div>

            <div class="time"></div>
        </div>

        <!-- Tarjetas -->
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <a href="/Estanco_web/vista/ProductoDes.jsp" class="card">
                        <img src="https://www.portafolio.co/files/article_new_multimedia/uploads/2020/05/28/5ed01cd746444.jpeg" class="card-img-top" alt="Cerveza Águila">
                        <div class="card-body">
                            <h5 class="card-title">Águila</h5>
                            <p class="card-text">$ Precio</p>
                        </div>
                    </a>
                </div>
                <div class="col-md-4">
                    <a href="/Estanco_web/vista/ProductoDes.jsp" class="card">
                        <img src="https://www.clubcolombia.com.co/sites/g/files/seuoyk481/files/2023-05/InternaNegra.png.webp" class="card-img-top" alt="Cerveza Club Colombia">
                        <div class="card-body">
                            <h5 class="card-title">Club Colombia</h5>
                            <p class="card-text">$ Precio</p>
                        </div>
                    </a>
                </div>
                <div class="col-md-4">
                    <a href="/Estanco_web/vista/ProductoDes.jsp" class="card">
                        <img src="https://vaquitaexpress.com.co/media/catalog/product/cache/e89ece728e3939ca368b457071d3c0be/7/7/7702004004932_28.jpg" class="card-img-top" alt="Cerveza Costeña">
                        <div class="card-body">
                            <h5 class="card-title">Costeña</h5>
                            <p class="card-text">$ Precio</p>
                        </div>
                    </a>
                </div>
                <div class="col-md-4">
                    <a href="/Estanco_web/vista/ProductoDes.jsp" class="card">
                        <img src="https://jotajotafoods.com/wp-content/uploads/2021/12/CER00028-1.jpg" class="card-img-top" alt="Cerveza Poker">
                        <div class="card-body">
                            <h5 class="card-title">Poker</h5>
                            <p class="card-text">$ Precio</p>
                        </div>
                    </a>
                </div>
                <div class="col-md-4">
                    <a href="/Estanco_web/vista/ProductoDes.jsp"class="card">
                        <img src="https://m.media-amazon.com/images/I/71x0dGurW-L.jpg" class="card-img-top" alt="Cerveza Barrilito">
                        <div class="card-body">
                            <h5 class="card-title">Barrilito</h5>
                            <p class="card-text">$ Precio</p>
                        </div>
                    </a>
                </div>
                <div class="col-md-4">
                    <a href="/Estanco_web/vista/ProductoDes.jsp" class="card">
                        <img src="https://licorescasamoreno.com/wp-content/uploads/2023/07/Cerveza-Aguila-Light-330ml.png" class="card-img-top" alt="Cerveza Águila Light">
                        <div class="card-body">
                            <h5 class="card-title">Águila Light</h5>
                            <p class="card-text">$ Precio</p>
                        </div>
                    </a>
                </div>
            </div>
        </div>
        <div class="container-fluid" style="background-color: black; color: white; padding: 20px;">
            <div class="row">
                <div class="col-md-4">
                    <h5>Sobre Nosotros</h5>

                    <p>Estanco Currambero ofrece una amplia selección de cervezas, licores, mecatos y más. ¡Descubre nuestros productos y disfruta de una experiencia única!</p>
                    <a href="https://facebook.com" target="_blank" style="color: white; margin-right: 10px;">
                        <i class="bi bi-facebook"></i>
                    </a>
                    <a href="https://twitter.com" target="_blank" style="color: white; margin-right: 10px;">
                        <i class="bi bi-twitter"></i>
                    </a>
                    <a href="https://instagram.com" target="_blank" style="color: white; margin-right: 10px;">
                        <i class="bi bi-instagram"></i>
                    </a>
                    <a href="https://linkedin.com" target="_blank" style="color: white;">
                        <i class="bi bi-linkedin"></i>
                    </a>

                </div>
                <div class="col-md-4">
                    <h5>Enlaces Rápidos</h5>
                    <ul style="list-style-type: none; padding: 0;">
                        <li><a href="/Estanco_web/vista/Inicio.jsp" style="color: white;">Inicio</a></li>
                        <li><a href="#" style="color: white;">Ofertas</a></li>
                        <li><a href="#" style="color: white;">Categorías</a></li>
                        <li><a href="#" style="color: white;">Ayuda</a></li>
                    </ul>
                </div>
                <div class="col-md-4">
                    <h5>Contacto</h5>
                    <p>Email: contacto@estancocurrambero.com</p>
                    <p>Teléfono: +123 456 789</p>
                    <p>Dirección: Calle Ficticia 123, Ciudad, País</p>
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
        <script src="../js/app.js" type="text/javascript"></script>
    </body>
</html>
