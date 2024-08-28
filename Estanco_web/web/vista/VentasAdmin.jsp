<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <title>Inicio Administrador</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
        <link href="../css/admin.css" rel="stylesheet" type="text/css"/>
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
                <!-- Carrusel -->
                <div class="carousel">
                    <div class="list">
                        <div class="item">
                            <img src="../image/img1.jpg" alt=""/>
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
                            <img src="../image/img2.jpg" alt=""/>
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
                            <img src="../image/img3.jpg" alt=""/>
                            <div class="content">
                                <div class="title">MECATOS</div>
                                <div class="topic">Y MÁS...</div>
                                <div class="des">
                                    Disfruta de la mejor selección de mecatos para acompañar tus momentos especiales. <br>Encontrarás una variedad de marcas y sabores para satisfacer tus antojos. <br>Desde los clásicos mecatos hasta las opciones más exóticas, tenemos los mecatos perfectos para ti!!
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <img src="../image/img4.jpg" alt=""/>
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
                            <img src="../image/img1.jpg" alt=""/>
                            <div class="content">
                                <div class="title">
                                    Contamos con todo tipo de Cervezas.
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <img src="../image/img2.jpg" alt=""/>
                            <div class="content">
                                <div class="title">
                                    ¡Los mejores licores y ron del mercado!!
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <img src="../image/img3.jpg" alt=""/>
                            <div class="content">
                                <div class="title">
                                    ¡Mecatos y más!
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <img src="../image/img4.jpg" alt=""/>
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
                                <a href="/EstancoCurrambero/vista/ProductoDesAdmin.jsp" class="card">
                                    <img src="https://www.portafolio.co/files/article_new_multimedia/uploads/2020/05/28/5ed01cd746444.jpeg" class="card-img-top" alt="Cerveza Águila">
                                    <div class="card-body">
                                        <h5 class="card-title">Águila</h5>
                                        <p class="card-text">$ Precio</p>
                                    </div>
                                </a>
                            </div>
                            <div class="col-md-4">
                                <a href="/EstancoCurrambero/vista/ProductoDesAdmin.jsp" class="card">
                                    <img src="https://vaquitaexpress.com.co/media/catalog/product/cache/e89ece728e3939ca368b457071d3c0be/7/7/7702004004932_28.jpg" class="card-img-top" alt="Cerveza Costeña">
                                    <div class="card-body">
                                        <h5 class="card-title">Costeña</h5>
                                        <p class="card-text">$ Precio</p>
                                    </div>
                                </a>
                            </div>
                            <div class="col-md-4">
                                <a href="/EstancoCurrambero/vista/ProductoDesAdmin.jsp" class="card">
                                    <img src="https://jotajotafoods.com/wp-content/uploads/2021/12/CER00028-1.jpg" class="card-img-top" alt="Cerveza Poker">
                                    <div class="card-body">
                                        <h5 class="card-title">Poker</h5>
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
            </main>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <script src="../js/app.js" type="text/javascript"></script>
    </body>
</html>
