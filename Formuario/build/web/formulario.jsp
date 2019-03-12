<%-- 
    Document   : formulariojsp
    Created on : 11/03/2019, 06:24:40 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario resultados</h1>
        <%
            String name=request.getParameter("nombre");
            String nacmt=request.getParameter("nacimiento");
            String email=request.getParameter("email");
            String psw=request.getParameter("psw");
            %>
            
            nombre: <%=name%><br>
            Fecha de nacimiento: <%=nacmt%><br>
            email: <%=email%><br>
            Contraseña: <%=psw%><br>
            
            <a href="index.jsp">
                Volver a llenar
            </a>
    </body>
</html>
