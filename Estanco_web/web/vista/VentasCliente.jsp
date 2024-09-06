<%-- 
    Document   : VentasCliente
    Created on : 12/08/2024, 07:59:56 PM

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
        <title>Estanco Currambero</title>
    </head>
    <%
        if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')) {
            response.sendRedirect("../vista/Login.jsp");
        }
    %>
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
                            <li><a class="dropdown-item" href="#">Ciente</a></li>
                            <li><a class="dropdown-item" href="#">hola</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>

        <!-- Carrusel -->
        <div class="carousel">
            <div class="list">
                <div class="item">
                    <img src="../imagenes/img1.jpg" alt=""/>
                    <div class="content">
                        <div class="title">TODO TIPO</div>
                        <div class="topic">DE CERVEZAS</div>
                    </div>
                </div>
                <div class="item">
                    <img src="../imagenes/img2.jpg" alt=""/>
                    <div class="content">
                        <div class="title">Licores</div>
                        <div class="topic">Y RON</div>
                    </div>
                </div>
                <div class="item">
                    <img src="../imagenes/img3.jpg" alt=""/>
                    <div class="content">
                        <div class="title">MECATOS</div>
                        <div class="topic">Y MÁS...</div>
                    </div>
                </div>
                <div class="item">
                    <img src="../imagenes/img4.jpg" alt=""/>
                    <div class="content">
                        <div class="title">GASEOSAS</div>
                        <div class="topic">Y ENERGIZANTES</div>
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

        <!-- Product Cards -->
        <div class="product-card">
            <img src="https://via.placeholder.com/250" alt="Product Image">
            <h2>Morning Set</h2>
            <p>Set of coffee and chocolate cookies as a top tier among our customers and a perfect way to start your day.</p>
            <div class="price">$16</div>
            <a href="#" class="order-btn"><i class="bi bi-cart3"></i></a>
        </div>
        <footer>
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
                        <li><a href="/EstancoCurrambero/vista/VentasAdmin.jsp" style="color: white;">Inicio</a></li>
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
        </footer>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <script src="../JS/carrusel.js" type="text/javascript"></script>
    </body>
</html>

