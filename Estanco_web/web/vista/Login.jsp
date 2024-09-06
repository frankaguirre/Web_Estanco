<%-- 
    Document   : Login
    Created on : 31/08/2024, 07:53:40 PM
    Author     : ALEANDRES RODRIGUEZ
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
                                <input type="text" id="new-id" placeholder="Identificación">
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
                                <input type="password" id="new-password" placeholder="Contraseña">
                            </div>
                        </div>
                        <div class="input-group-row">
                            <div class="input-group">
                                <i class="fas fa-lock icon"></i>
                                <input type="password" id="new-password2" placeholder="Repetir Contraseña">
                            </div>
                            <div class="input-group">
                                <label for="new-terminos">
                                    <input type="checkbox" id="new-terminos">
                                    Acepto términos y condiciones
                                </label>
                            </div>
                        </div>
                        <div class="input-group-row">
                            <div class="input-group">
                                <select id="new-tipo">
                                    <option value="Cliente">Cliente</option>
                                </select>
                            </div>
                        </div>
                        <div class="col mt-2 mb-2 text-center formulario_grupo formulario_grupo-btn-enviar">
                                <button type="submit" class="btn btn-primary formulario_btn" name="accion" value="nuevo">Guardar <i class="bi bi-floppy"></i></button>
                                <a class="btn btn-danger formulario_btn" href="/Estanco_Web/CtrUsuario?accion=Listar" name="regresar"> <i class="bi bi-arrow-return-left"></i></a>
                             
                        </div>
                    </form>

                </div>
            </div>
        </div>

        <script src="../JS/login.js" type="text/javascript"></script>
    </body>
</html>