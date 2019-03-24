<%-- 
    Document   : Index
    Created on : 23/03/2019, 09:36:07 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta charset="UTF-8">
     
      <title>Inicio</title>
   </head>
   <body>
  
       <h1>Iniciar Sesion</h1>
       <form action="Process.java" method="POST">
                <tr>
                    <h1>Usuario<input type="text" name="usuario"/></h1>
                    <h1>Contraseña<input type="password" name="contraseña"/> </h1>
                    <h1> <input type="submit" name="Iniciar Sesion" value="Sesion"/> </h1><br>
                    <h1>  <a href="registro.jsp">Si no tienes una cuenta registrate aqui</a> </h1> 
       </form>
   </body>
</html>
