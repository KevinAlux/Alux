<%-- 
    Document   : index
    Created on : 11/03/2019, 06:25:21 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Practica LDOO</title>
    </head>
    <body>
        <h1>Iniciar Sesion</h1>
        <form action=IniciarSesion.java" metho="post" >
            <div>
		<label for="nombre"><b>Nombre(s)</b></label>
		<input type="text" placeholder="¿Cual es tu nombre?" name="nombre" required><br>
					
		<label for="nacimiento"><b>Apellidos</b></label>
                <input type="text" placeholder="Apellidos" name="apellidos" required><br>

                <label for="email"><b>Email</b></label>
                <input type="text" placeholder="Email" name="usuario" required><br>
					
                <label for="psw"><b>Password</b></label>
                <input type="password" placeholder="Password" name="password" required><br>
					
                <label for="psw-repeat"><b>Repeat Password</b></label>
		<input type="password" placeholder="Repeat Password" name="password-repeat" required><br>
					
                <input type="submit" value="Iniciar Sesion">
            </div>
        </form>
        <br>
        Si no tienes una cuenta <a href="Registro.jsp">¡Registrate!</a>
    </body>
</html>
