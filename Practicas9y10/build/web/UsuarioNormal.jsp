<%-- 
    Document   : UsuarioNormal
    Created on : 13/04/2019, 06:07:22 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuario</title>
    </head>
    <body>
        <h1> Formulario </h1>
        <form action="" method="post">
            Usuario
            <input type="text" name="user"><br>
            Contraseña
            <input type="password" name="password"><br>
            Fecha de nacimiento
            <input type="date" name="nacimiento"><br>
            Email
            <input type="text" name="email"><br>
            <input type="hidden" name="usertype" value="UsuarioNormal">
            ID
            <input type="text" name="userid"><br>
            Nombre
            <input type="text" name="nombre"><br>
            Suscripción
            <input type="radio" name="suscriptiontype" value="Gratis">
            <input type="radio" name="suscriptiontype" value="De pago"><br>
            Dirección
            <input type="text" name="address">
            <input type="submit" value="Registrar" onclick="getDate()">
        </form>
    </body>
</html>
