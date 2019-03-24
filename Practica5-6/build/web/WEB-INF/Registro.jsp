<%-- 
    Document   : Registro
    Created on : 23/03/2019, 09:41:32 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta charset="UTF-8"> 
      <title>Registro</title>
      <script type="text/javascript">
          function validar(){
              var not = " ";
              var contraseña = document.login.contraseña.value;
              var psw = document.login.psw.value;
              
              //se deben validar las contraseñas
              if(contraseña !== psw){
                  alert("Las contraseñas no coinciden");
                  return false;
              }
              else if(contraseña === not || psw === not){
                  alert("No se admiten espacios en blanco");
                  return false;
              }
              else{
                  return true;
              }
          }
      </script>
   </head>

       <h1>Registro</h1>
       <form action="Registro" method="POST" name="login" onSubmit="return validar()"<br> 
            <h1>Usuario<input type="text" name="usuario"/></h1>
            <h1>Contraseña<input type="password" name="contraseña"/></h1><br>  
            <h1>Repite la contraseña<input type="password" name="psw"/></h1><br>
            <input type="submit" name="Registrarse" value="Enviar"/>
       </form>
   </body>
</html>