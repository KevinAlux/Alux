<%-- 
    Document   : Admin
    Created on : 13/04/2019, 06:11:25 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Administrador</title>
    </head>
    <body>
        <h1> Formulario </h1>
        <form action="RegistrarUsuarios" method="post">
            Usuario
            <input type="text" name="user"><br>
            Contraseña
            <input type="password" name="password"><br>
            Fecha de nacimiento
            <input type="date" name="nacimiento"><br>
            Email
            <input type="text" name="email"><br>
            <input type="hidden" name="usertype" value="Admin">
            ID
            <input type="text" name="userid"><br>
            Número de empleado
            <input type="text" name="employeenumber"><br>
            <input type="submit" value="Regístrate">
        </form>
    </body>
</html>
