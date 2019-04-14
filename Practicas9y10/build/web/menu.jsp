<%-- 
    Document   : menu
    Created on : 8/04/2019, 09:00:20 PM
    Author     : Kevin
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="FactoriadeUsuarios.FactoriaUsuarios"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <%
            FactoriaUsuarios factoria = FactoriaUsuarios.getFactoria();
            String user = (String)session.getAttribute("user");
        %>
        <h1><%=factoria.obtenerUsuario(user).getNombreDeUsuario()%> ¡Bienvenido!</h1>
            <form action="CerrarSesion" method="post">
                <input type="submit" value="Cerrar sesión">
            </form>
    </body>
</html>
