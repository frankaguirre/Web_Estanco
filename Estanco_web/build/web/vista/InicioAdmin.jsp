<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Panel de Administración</title>
    <link href="../css/admin.css" rel="stylesheet" type="text/css" />
    <style>
        .wrapper {
            display: flex;
            min-height: 100vh;
            transition: margin-left 0.3s;
        }
        .sidebar {
            width: 60px;
            background-color: #000; /* Menú negro */
            color: #fff;
            height: 100vh;
            position: fixed;
            top: 0;
            left: 0;
            overflow: hidden;
            transition: width 0.3s;
            display: flex;
            flex-direction: column;
        }
        .sidebar.open {
            width: 250px;
        }
        .sidebar-header {
            text-align: center;
            padding: 10px;
            border-bottom: 1px solid #333; /* Línea de separación en gris oscuro */
        }
        .sidebar-header img {
            max-width: 40px;
            transition: max-width 0.3s;
        }
        .sidebar.open .sidebar-header img {
            max-width: 100px;
        }
        .sidebar-header h2 {
            font-size: 18px;
            display: none;
        }
        .sidebar.open .sidebar-header h2 {
            display: block;
        }
        .sidebar-links {
            list-style: none;
            padding: 0;
            margin: 0;
        }
        .sidebar-links li {
            padding: 10px 20px;
        }
        .sidebar-links a {
            color: #fff;
            text-decoration: none;
            display: flex;
            align-items: center;
            white-space: nowrap;
            transition: background-color 0.3s;
        }
        .sidebar-links a:hover {
            background-color: #333; /* Color de fondo en hover */
        }
        .sidebar-links i {
            margin-right: 10px;
        }
        .user-account {
            margin-top: auto;
            padding: 10px;
            border-top: 1px solid #333; /* Línea de separación en gris oscuro */
        }
        .user-profile {
            display: flex;
            align-items: center;
            padding: 10px;
        }
        .user-profile img {
            border-radius: 50%;
            width: 50px;
            height: 50px;
            margin-right: 10px;
        }
        .user-detail h3 {
            margin: 0;
            font-size: 16px;
        }
        .user-detail span {
            font-size: 14px;
            color: #adb5bd;
        }
        .content {
            margin-left: 60px;
            padding: 20px;
            flex: 1;
            transition: margin-left 0.3s;
        }
        .sidebar.open + .content {
            margin-left: 250px;
        }
        .contentmain {
            padding: 20px;
            background-color: #f8f9fa;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .contentmain h1 {
            border-bottom: 4px solid #ff5722; /* Naranja para el borde del título */
            padding-bottom: 10px;
            margin-bottom: 20px;
        }
        .alert-custom {
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            margin-bottom: 20px;
            background-color: #ff5722; /* Color del rectángulo debajo del título */
            color: #fff; /* Texto blanco para el contraste */
            padding: 20px;
            border-left: 5px solid #ff5722; /* Color naranja para el borde izquierdo */
        }
        .alert-custom h4 {
            color: #fff; /* Texto blanco en el encabezado */
        }
        .card-group {
            display: flex;
            flex-wrap: wrap;
            gap: 15px;
        }
        .card {
            flex: 1 1 calc(25% - 15px); /* Cuatro tarjetas por fila con espacio */
            border: none;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
            padding: 15px;
            color: #fff;
            min-height: 150px; /* Altura mínima ajustada para que las tarjetas sean iguales */
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }
        .card-icon {
            font-size: 2rem; /* Tamaño de icono ajustado */
            margin-bottom: 15px;
        }
        .bg-primary { background-color: #ff5722; } /* Color naranja */
        .bg-secondary { background-color: #ff5722; } /* Color naranja */
        .bg-success { background-color: #ff5722; } /* Color naranja */
        .bg-danger { background-color: #ff5722; } /* Color naranja */
        .bg-info { background-color: #ff5722; } /* Color naranja */
        @media (max-width: 768px) {
            .card-group .card {
                flex: 1 1 calc(50% - 15px); /* Dos tarjetas por fila en pantallas más pequeñas */
            }
        }
        @media (max-width: 576px) {
            .card-group .card {
                flex: 1 1 100%; /* Una tarjeta por fila en pantallas muy pequeñas */
            }
        }
    </style>
</head>

<body>
    <div class="wrapper">
        <aside class="sidebar" id="sidebar">
            <div class="sidebar-header">
                <img src="imagenes/logo.png" alt="CodingLab Logo" />
                <h2>Estanco<br>Currambero</h2>
            </div>
            <ul class="sidebar-links">
                <div class="menu-separator"></div>
                <li><a href="/Estanco_web/vista/VentasAdmin.jsp"><i class="bi bi-house-door"></i> Inicio</a></li>
                <li><a href="/EstancoCurrambero/vista/ListarProductos.jsp"><i class="bi bi-beer"></i> Productos</a></li>
                <li><a href="/EstancoCurrambero/vista/ListarUsuario.jsp"><i class="bi bi-people"></i> Usuarios</a></li>
                <li><a href="/EstancoCurrambero/vista/PedidosAdmin.jsp"><i class="bi bi-box-seam"></i> Pedidos</a></li>
                <li><a href="/EstancoCurrambero/vista/ListarProveedor.jsp"><i class="bi bi-folder"></i> Proveedores</a></li>
                <li><a href="/EstancoCurrambero/vista/Categorias.jsp"><i class="bi bi-tags"></i> Categorías</a></li>
                <li><a href="#"><i class="bi bi-bar-chart"></i> Reportes</a></li>
                <li><a href="#"><i class="bi bi-question-circle"></i> Ayuda</a></li>
                <li><a href="/Estanco_web/CtrProducto?accion=salir"><i class="bi bi-box-arrow-left"></i> Salir</a></li>
            </ul>
            <div class="user-account">
                <div class="user-profile">
                    <img src="images/profile-img.jpg" alt="Profile Image" />
                    <div class="user-detail">
                        <h3><%= request.getAttribute("adminName") != null ? request.getAttribute("adminName") : "Administrador" %></h3>
                        <span>Administrador</span>
                    </div>
                </div>
            </div>
        </aside>
        <div class="content">
            <div class="contentmain">
                <div class="alert alert-custom">
                    <h4 class="alert-heading">¡Hola, Administrador!</h4>
                    <p class="mb-0">Aquí puedes gestionar los productos, usuarios, pedidos y más.</p>
                    <p class="mb-0">Navega usando el menú lateral para acceder a las diferentes opciones.</p>
                    <p class="mb-0">Si necesitas asistencia, por favor contacta al soporte o consulta la sección de <a href="#" class="text-light">Ayuda</a>.</p>
                </div>
                <div class="card-group">
                    <div class="card bg-primary">
                        <div class="card-body">
                            <i class="bi bi-beer card-icon"></i>
                            <h5 class="card-title">Productos</h5>
                            <p class="card-text">Gestiona los productos disponibles en el estanco, incluyendo agregar, editar y eliminar productos.</p>
                        </div>
                    </div>
                    <div class="card bg-secondary">
                        <div class="card-body">
                            <i class="bi bi-person-circle card-icon"></i>
                            <h5 class="card-title">Usuarios</h5>
                            <p class="card-text">Gestiona la información de los usuarios, incluyendo la asignación de roles y permisos.</p>
                        </div>
                    </div>
                    <div class="card bg-success">
                        <div class="card-body">
                            <i class="bi bi-truck card-icon"></i>
                            <h5 class="card-title">Pedidos</h5>
                            <p class="card-text">Revisa y gestiona los pedidos realizados por los clientes. Asegúrate de seguir el estado de los pedidos.</p>
                        </div>
                    </div>
                    <div class="card bg-danger">
                        <div class="card-body">
                            <i class="bi bi-people card-icon"></i>
                            <h5 class="card-title">Proveedores</h5>
                            <p class="card-text">Mantén actualizada la información de tus proveedores para una gestión eficiente.</p>
                        </div>
                    </div>
                </div>
                <div class="mt-4">
                    <div class="card bg-info">
                        <div class="card-body">
                            <i class="bi bi-info-circle card-icon"></i>
                            <h5 class="card-title">Información Adicional</h5>
                            <p class="card-text">Para asistencia adicional, consulta la sección de <a href="#" class="text-dark">Ayuda</a> o contacta a soporte. Revisa los reportes para obtener información detallada sobre el desempeño del negocio.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script>
        const sidebar = document.getElementById('sidebar');

        sidebar.addEventListener('mouseover', () => {
            sidebar.classList.add('open');
        });

        sidebar.addEventListener('mouseout', () => {
            sidebar.classList.remove('open');
        });
    </script>
</body>

</html>
