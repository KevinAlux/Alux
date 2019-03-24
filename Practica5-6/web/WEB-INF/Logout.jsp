<%-- 
    Document   : Logout
    Created on : 23/03/2019, 10:50:43 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        HttpSession sesion = request.getSession(false);
        session.invalidate();
        
        response.sendRedirect("index.jsp");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sesion cerrada</title>
    </head>
    <body>
        <h1>Su sesion se ha cerrado correctamente</h1>
    </body>
</html>
