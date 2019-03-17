<%-- 
    Document   : nameView
    Created on : 14/03/2019, 10:23:46 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC</title>
    </head>
    <body>
        <h1>Introduzca su nombre</h1>
        <spring:nestedPath path="name">
            <form action="" method="post">
            Nombre:
                <spring:bind path="value">
                <input type="text" name="${status.expression}" value="${status.value}">
                </spring:bind>
                <input type="submit" value="OK">
            </form>
        .</spring:nestedPath>
    </body>
</html>
