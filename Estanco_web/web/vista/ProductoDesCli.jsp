<%-- 
    Document   : ProductoDes
    Created on : 15/08/2024, 10:29:21 AM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>Producto Descripcion</title>
        <link href="../css/inicio.css" rel="stylesheet" type="text/css"/>
    </head>
    <%
        if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')){
            response.sendRedirect("../vista/Login.jsp");
        }
    %>
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
        <header
            <nav class="navbar navbar-dark bg-dark justify-content-between px-3">
                <a href="/EstancoCurrambero/vista/VentasCliente.jsp" class="navbar-brand">Inicio</a>
                <div class="d-flex align-items-center">
                    <a href="/EstancoCurrambero/vista/Carrito.jsp" class="nav-link"><i class="bi bi-cart3"></i> Carrito</a>
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
                                <li><a class="dropdown-item" href="#">Ciente</a></li>
                                <li><a class="dropdown-item" href="#">hola</a></li>
                            </ul>
                        </div>
                    </div>
                    
            </nav>
        </header>
     <div class="container mt-5">
        <div class="row">
            <!-- Product Image -->
            <div class="col-md-6">
                    <img src="${p.getFoto()}" alt="${p.getNombre()}">
            </div>

            <div class="col-md-6">
                <h1><c:out value="${p.getNombre()}"/></h1>
                 <div class="price">$<c:out value="${p.getPrecio()}"/></div>

                <ul class="product-features list-unstyled">
                    <li><i class="bi bi-check-circle-fill text-success"></i> Característica 1</li>
                    <li><i class="bi bi-check-circle-fill text-success"></i> Característica 2</li>
                    <li><i class="bi bi-check-circle-fill text-success"></i> Característica 3</li>
                </ul>

                <!-- Botones organizados en columna -->
                <div class="d-grid gap-2">
                    <button class="btn btn-primary btn-checkout">Método de pago</button>
                    <button class="btn btn-danger btn-checkout">Generar pedido</button>
                </div>
            </div>

        </div>

            <!-- Product Description -->
            <div class="row mt-5">
                <div class="col-12">
                    <h4>Descripción del Producto</h4>
                    <p><c:out value="${p.Descripcion()}"/></p>
                </div>
                
            </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
