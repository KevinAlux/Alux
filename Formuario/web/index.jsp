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
        <title>Practica 3LDOO</title>
    </head>
    <body>
        <h1>Formulario</h1>
        <form action="formulario.jsp" metho="post" >
            <div>
		<label for="nombre"><b>Nombre</b></label>
		<input type="text" placeholder="¿Cual es tu nombre?" name="nombre" required><br>
					
		<label for="nacimiento"><b>Fecha de Nacimiento</b></label>
                <input type="text" placeholder="dd/mm/aa" name="nacimiento" required><br>

                <label for="email"><b>Email</b></label>
                <input type="text" placeholder="Enter Email" name="email" required><br>
					
                <label for="psw"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="psw" required><br>
					
                <label for="psw-repeat"><b>Repeat Password</b></label>
		<input type="password" placeholder="Repeat Password" name="psw-repeat" required><br>
					
                <button type="submit" class="registerbtn">Register</button>
            </div>
        </form>
    </body>
</html>
