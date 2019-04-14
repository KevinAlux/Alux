/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoriadeUsuarios;
import java.util.HashMap;

/**
 *
 * @author Kevin
 */
public class FactoriaUsuarios {
     private static FactoriaUsuarios factoria;
    private HashMap<String, User> listaDeUsuarios = new HashMap();
    
    public FactoriaUsuarios(){        
    }
    
    public static FactoriaUsuarios getFactoria(){
        if (factoria == null){
            factoria = new FactoriaUsuarios();
        }
        return factoria;
    }
    
    public void agregarUsuario(String user, String password, String nacimiento,String email, String usertype, int userid, int employeenumber, String nombre, String suscriptiontype, String address, String registerdate){
        listaDeUsuarios.put(user, crearUsuario(user, password, nacimiento, email, usertype, userid, employeenumber, nombre, suscriptiontype, address, registerdate));
    }
    
    public User obtenerUsuario(String user){
        return listaDeUsuarios.get(user);
    }
    
    public static User crearUsuario(String user, String password, String nacimiento,String email, String usertype, int userid, int employeenumber, String nombre, String suscriptiontype, String address, String registerdate){
        if (usertype.equals("Normal")){
            return new UsuarioNormal(user, password, userid, nacimiento, email, nombre, suscriptiontype, address);
        }else if(usertype.equals("Admin")){
            return new UsuarioAdministrador(user, password, userid, nacimiento, email, employeenumber);
        }else if(usertype.equals("Invitado")){
            return new UsuarioInvitado(user, password, userid, nacimiento, email, nombre, registerdate);
        }
        
        return new UsuarioNormal("admin", "admin", 0, "0", "admin", "admin", "free", "null");
    }
    
}
