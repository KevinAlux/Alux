<%-- 
    Document   : Bienvenido
    Created on : 23/03/2019, 10:50:34 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.User"%>
<%
        HttpSession sesion = request.getSession();
        String usuario,contraseña;
        usuario = sesion.getAttribute("username").toString();
        contraseña = sesion.getAttribute("password").toString();
        User u = new User(usuario,contraseña);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>¡Bienvenido!</title>
    </head>
    <body>
        <h1>¡Bienvenido!</h1>
        <h2> <b>Su Nombre de Usuario es: <%=u.getValue()%>! </b> </h2>
        <h2>Su contraseña es:<b> <%= u.getPsw()%> </b> </h2>
        <form action="cerrarSesion.jsp">
            <input type="submit" name="CERRAR SESIÓN" value="CERRAR LA SESION"/>
        </form>
    </body>
</html>
