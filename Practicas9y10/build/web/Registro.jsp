<%-- 
    Document   : Registro
    Created on : 13/04/2019, 06:41:32 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta charset="UTF-8"> 
      <title>Registro</title>
   </head>

       <h1>Registro</h1>
       <form action="Redirect" method="POST"> 
           <label> Nombre </label> 
           <input type="text" name="nombre"/><br>
           <label> Apellido </label> 
           <input type="text" name="apellido"/><br>
           <label> Email </label> 
           <input type="text" name="usuario"/><br>
           <label> Contraseña </label> 
           <input type="password" name="password"/><br>  
           <label> Repite la contraseña </label> 
           <input type="password" name="password-repeat"/><br>
           <input type="submit" name="Registrarse" value="Registro"/>
           
           <select name="usertype">
                <option value="Invitado">Invitado</option>
                <option value="UsuarioNormal">Usuario</option>
                <option value="Admin">Administrador</option>
           </select>
            <input type="submit" value="Enviar">
       </form>
   </body>
</html>