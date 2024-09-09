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
        <title>Estanco Currambero</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
        <link href="/Estanco_web/css/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="left-side">
                <img src="/Estanco_web/imagenes/logine.jpeg" alt="" class="shoe-image"/>
            </div>
            <div class="right-side">
                <div id="form-container">
                    <!-- Formulario de inicio de sesión -->
                    <form id="login-form" class="form active" action="/Estanco_web/CtrValidar" method="post">
                        <h1> ¡Bienvenido! </h1>
                        
                        <div class="input-group">
                            
                            <i class="fas fa-user icon"></i>
                            <input type="text" name="txtuser" id="usuario" placeholder="Usuario">
                        </div>
                        <div class="input-group">
                            <i class="fas fa-lock icon"></i>
                            <input type="password" name="txtpass" id="password" placeholder="Contraseña">
                        </div>
                        <div class="mt-6">
                            <a href="/Estanco_web/vista/Login.jsp?signup=true" class="registro">No tienes cuenta? Registrate</a> 
                            <a href="#" class="forgot-password">¿Se te olvidó la contraseña?</a>
                        </div>
                        
                        <button type="submit" name="accion" value="Ingresar" class="login-btn-form">Iniciar Sesión</button>
                    </form>

                    <!-- Formulario de registro -->
                    <form id="signup-form" class="form" action="/Estanco_web/CtrUsuario?accion=nuevo" method="post">
                        
                        <h1>Crear tu cuenta:</h1>
                        <div class="input-group-row">
                            <div class="input-group">
                                <i class="fas fa-user icon"></i>
                                <input type="text" class="formulario_input" name="nombre" id="nombre" placeholder="Nombre" required>
                            </div>
                            <div class="input-group">
                                <i class="fas fa-user icon"></i>
                                <input type="text" class="formulario_input" name="apellido" id="apellido" placeholder="Apellido" required>
                            </div>
                        </div>
                        <div class="input-group-row">
                            <div class="input-group">
                                <i class="fas fa-home icon"></i>
                                <input type="text" class="formulario_input" name="direccion" id="direccion" placeholder="Dirección" required>
                            </div>
                            <div class="input-group">
                                <i class="fas fa-phone icon"></i>
                                <input type="text" class="formulario_input" name="telefono" id="telefono" placeholder="Teléfono" required>
                            </div>
                        </div>
                        
                        <div class="input-group-row">
                            <div class="input-group">
                                <i class="fas fa-envelope icon"></i>
                                <input type="email" class="formulario_input" name="correo" id="correo" placeholder="Correo" required>
                            </div>
                            <div class="input-group">
                                <i class="fas fa-calendar icon"></i>
                                <input type="date" class="formulario_input" name="fechanaci" id="fechanaci" required>
                            </div>
                        </div>
                        <div class="input-group-row">
                            <div class="input-group">
                                <i class="fas fa-user icon"></i>
                                <input type="text" class="formulario_input" name="usuario" id="usuario_registro" placeholder="Usuario" required>
                            </div>
                            <div class="input-group">
                                <i class="fas fa-lock icon"></i>
                                <input type="password" class="formulario_input" name="contrasena" id="contrasena" placeholder="Contraseña" required>
                            </div>
                        </div>
                        <div class="input-group-row">
                            <div class="input-group">
                                <i class="fas fa-lock icon"></i>
                                <input type="password" class="formulario_input" name="contrasena_repetir" id="contrasena_repetir" placeholder="Repite Contraseña" required>
                            </div>
                        </div>
                        <div class="input">
                            <label for="terminos" class="formulario_label">
                                <input type="checkbox" class="formulario_checkbox" name="terminos" id="terminos" required>
                                Acepto los términos y condiciones
                            </label> 
                        </div>
                        
                        <div class="formulario_mensaje" id="formulario_mensaje"></div>
                        <button type="submit" class="login-btn-form" name="accion" value="nuevo">Crear Cuenta<i class="bi bi-floppy"></i></button>
                    </form>
                </div>
            </div>
            
        </div>
        
        <script src="/Estanco_web/JS/login.js" type="text/javascript"></script>
    </body>
    
</html>
