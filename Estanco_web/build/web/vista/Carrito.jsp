<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <link href="../css/inicio.css" rel="stylesheet" type="text/css"/>
        <title>Estanco Currambero</title>
        <style>
            body {

                height: 100%;
                margin: 0;
                background-image: url('../imagenes/imagencarrito.jpg');
                background-size: cover; 
                background-position: center; 
                background-repeat: no-repeat; 
            }

            .cart-container {
                max-width: 1200px;
                margin: 20px auto;
                background-color:#ffffff; 
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); 
                display: flex; 
                gap: 20px; 
                align-items: flex-start; 
            }
            .cart-image {
                width: 60%;
            }
            .cart-image img {
                max-width: 160%;
                border-radius: 8px;
            }
            .product-list, .cart-summary {
                width: 70%;
            }
            .cart-summary {
                margin-top: 20px;
                font-size: 1.1rem;
            }
            .cart-summary div {
                margin-bottom: 15px;
            }
            .cart-total {
                font-size: 1.25rem;
                font-weight: bold;
            }
            .btn-checkout {
                margin-top: 20px;
                width: 48%; 
            }
            .product-list table {
                width: 100%;
                background-color: #e9ecef;
            }
            .product-list th, .product-list td {
                padding: 15px;
                text-align: left;
            }
            .product-list th {
                background-color: #e9ecef;
            }
        </style>
    </head>
    <%
        if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')) {
            response.sendRedirect("../vista/Login.jsp");
        }
    %>
    <body>
        <!-- Header -->
        <header>
            <nav class="navbar navbar-dark bg-dark justify-content-between px-3">
                <a href="/Estanco_web/vista/VentasCliente.jsp" class="navbar-brand">Inicio</a>
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
                    </div>
                </div>
            </nav>
        </header>

        <!-- Cart Container -->
        <div class="cart-container">
            <div class="cart-image">
                <img src="../imagenes/carrito.jpeg" alt="Carrito Image" class="img-fluid">
            </div>
            <div class="product-list">
                <table class="table">
                    <thead>
                        <tr>
                            <th>Productos</th>
                            <th>Precio</th>
                            <th>Cantidad</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="car" items="${carrito}">
                        <tr>
                            <td>${car.getNombre()}<img src="${car.getFoto()}" width="100" height="100"></td>
                            <td>${car.getPrecio()}</td>
                            <td><input type="hidden" id="idpro" value="${car.getIdproducto()}">
                                <input type="number" id="cantidad" value="${car.getCantidad()}" class="form-control text-center" min="1">
                            </td>
                            <td>${car.getSubtotal()}</td>
                            <td><input type="hidden" id="idp" value="${car.getIdproducto()}">
                                <a class="btn btn-outline-danger" href="#" id="btndelete"><i class="bi bi-trash"></i></a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>

            <div class="cart-summary">
                <center><h2>Carrito</h2></center>
                <div>
                    <label for="subtotal">Subtotal:</label>
                    <input type="text" id="subtotal" class="form-control" value="$24,500" readonly>
                </div>
                <div>
                    <label for="descuento">Descuento:</label>
                    <input type="text" id="descuento" class="form-control" value="20%" readonly>
                </div>
                <div>
                    <label for="total">Total:</label>
                    <input type="text" id="total" class="form-control cart-total" value="$19,600" readonly>
                </div>

                <div class="d-flex justify-content-between mt-3">
                    <button class="btn btn-primary btn-checkout">Método de pago</button>
                    <button class="btn btn-danger btn-checkout">Generar pedido</button>
                </div>
            </div>
        </div>

        <!-- Scripts -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
