<%-- 
    Document   : Invitado
    Created on : 13/04/2019, 06:00:24 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="js/main.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Invitado</title>
    </head>
    <body>
        <form action="RegistrarUsuarios" method="post">
            Usuario
            <input type="text" name="user"><br>
            Contraseña
            <input type="password" name="password"><br>
            Fecha de nacimiento 
            <input type="date" name="nacimiento"><br>
            Email
            <input type="text" name="email"><br>
            <input type="hidden" name="usertype" value="Invitado">
            <input  id="hora" type="hidden" name="registerdate" value="">
            ID
            <input type="text" name="userid"><br>
            Nombre
            <input type="text" name="nombre"><br>
            <input type="submit" value="Registrar" onclick="getDate()">
        </form>
    </body>
</html>
