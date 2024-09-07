<%-- 
    Document   : Login
    Created on : 31/08/2024, 07:53:40 PM
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login/Sign Up</title>
        <!-- Vincula a Font Awesome para usar íconos -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
        <link href="../css/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <%String Mensaje = "";
        if (request.getParameter("ingreso") != null) {
            int i = Integer.parseInt(request.getParameter("ingreso"));
            if (i == 0) {
                Mensaje = "Usuario o Contraseña Incorrectos";
            }
        }
    %>
    <body>
        <div class="container">
            <div class="left-side">
                <img src="../imagenes/logoestancoo.jpg" alt="" class="shoe-image"/>
                <div class="buttons">
                    <button class="login-btn" onclick="showLogin()">Iniciar Sesion</button>
                    <button class="signup-btn" onclick="showSignUp()">Crear Cuenta</button>
                </div>
            </div>
            <div class="right-side">
                <div id="form-container">
                    <form id="login-form" class="form active" action="/Estanco_web/CtrValidar" method="post">
                        <h1> ¡Bienvenido! </h1>
                        <div class="input-group">
                            <i class="fas fa-user icon"></i>
                            <input type="text" name="txtuser" id="usuario" placeholder="Usuario">
                        </div>
                        <div class="input-group">
                            <i class="fas fa-lock icon"></i>
                            <input type="password"  name="txtpass" id="password" placeholder="Contraseña">
                        </div>
                        <a href="#" class="forgot-password">¿Se te olvidó la contraseña?</a>
                        <button type="submit" name="accion" value="Ingresar" class="login-btn-form">Iniciar Sesión</button>
                        <p style="Color: red;"><%=Mensaje%></p>
                    </form>

                    <form id="signup-form" class="form">
                        <h5>Completa los datos para crear tu cuenta:</h5>
                        <div class="input-group-row">
                            <div class="input-group">
                                <i class="fas fa-user icon"></i>
                                <input type="text" id="new-nombre" placeholder="Nombre">
                            </div>
                            <div class="input-group">
                                <i class="fas fa-user icon"></i>
                                <input type="text" id="new-apellido" placeholder="Apellido">
                            </div>
                        </div>
                        <div class="input-group-row">
                            <div class="input-group">
                                <i class="fas fa-map-marker-alt icon"></i>
                                <input type="text" id="new-direccion" placeholder="Dirección">
                            </div>
                            <div class="input-group">
                                <i class="fas fa-phone icon"></i>
                                <input type="text" id="new-telefono" placeholder="Teléfono">
                            </div>
                        </div>
                        <div class="input-group-row">
                            <div class="input-group">
                                <input type="date" id="new-fecha" placeholder="Fecha de Nacimiento"> <!-- Eliminado icono -->
                            </div>
                            <div class="input-group">
                                <i class="fas fa-envelope icon"></i>
                                <input type="email" id="new-email" placeholder="Email">
                            </div>
                        </div>
                        <div class="input-group-row">
                            <div class="input-group">
                                <i class="fas fa-user icon"></i>
                                <input type="text" id="new-username" placeholder="Usuario">
                            </div>
                            <div class="input-group">
                                <i class="fas fa-lock icon"></i>
                                <input type="password" id="new-password" placeholder="Password">
                            </div>
                        </div>
                        <button type="submit" class="login-btn-form">Crear Cuenta</button>
                    </form>
                </div>
            </div>
        </div>

        <script src="../JS/login.js" type="text/javascript"></script>
    </body>
</html>