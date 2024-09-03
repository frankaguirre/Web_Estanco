<%-- 
    Document   : Login
    Created on : 31/08/2024, 07:53:40 PM
    Author     : ALEANDRES RODRIGUEZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
        <style>
            body {

                background-image: url('https://cdn-3.expansion.mx/dims4/default/5b31df7/2147483647/strip/true/crop/1000x697+0+0/resize/1800x1255!/format/webp/quality/80/?url=https%3A%2F%2Fcdn-3.expansion.mx%2F34%2F3c%2Fca9a313849ddb6060b87cb6d5b85%2F2017-01-27t120000z-1783701375-rc1a6ec49670-rtrmadp-3-usa-trump-mexico-corona.JPG');
                background-size: cover;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
                font-family: Arial, sans-serif;
            }
            .login-container {

                background: rgba(355, 355, 355, 0.0);
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.0);
                width: 300px;
                text-align: center;
            }
            .login-container h2 {
                margin-bottom: 20px;
                color: #ffffff;
                border-radius: 1px;
            }
            .login-container input {
                background: rgba(355, 355, 355, 0.8);
                border-radius: 4px; 
                width: 100%;
                padding: 10px;
                margin-bottom: 20px;
                border: 1px solid #ccc;

            }
            .login-container button {

                width: 100%;
                padding: 10px;
                border: none;
                border-radius: 4px;
                background-color:darkorange;
                color: white;
                font-size: 16px;
                width: 200px;
            }
            .login-container a {
                padding-top: 9px;
                display: block;
                margin-top: 10px;
                color: #007bff; 
                text-decoration: none;

            }

            .usuario{

                color:black;
            }

            img{
                height: 50px;
                width: 60px 

            }

        </style>
    </head>
    <%String Mensaje = "";
    if (request.getParameter("ingreso")!= null){
        int i = Integer.parseInt(request.getParameter("ingreso"));
        if (i == 0){
            Mensaje = "Error: Datos Incorectos";
        }
    }
    %>
    <body>
        <div class="login-container">

            <img src="https://i.pinimg.com/236x/8d/59/9e/8d599e77e07f1d4a7f48a42926893e06.jpg" >
            <h2>BIENVENIDO</h2>
            <form action="/Estanco_web/CtrValidar" method="post">
                <input class="usuario" name="txtuser"type="text" placeholder="Usuario" required> 
                <input class="usuario" name="txtpass" type="password" placeholder="Contraseña" required>
                <button type="submit" name="accion" value="Ingresar">Iniciar Sesión</button>
                <p style="Color: red;"><%=Mensaje %></p>
                <a href="#">Registrarse</a>
            </form>
        </div>
    </body>
</html>