/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Kevin
 */
public class consultas extends Conexion{
    
    public boolean autenticacion(String usuario, String contraseña){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String consulta = "Select * from usuarios where Usuario = ? and Password = ? ";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
        } catch (Exception e){
            System.err.println("ERROR" + e);
    }finally {
         try {
             if(getConexion() != null) getConexion().close();
             if(pst != null) pst.close();
             if(rs != null) rs.close();
        } catch (Exception e) {
           System.err.println("ERROR" + e);
            }
        }
        
        return false;
    }
    
    public boolean registrar(String nombre, String apellido, String usuario, String password){
        
        PreparedStatement pst = null;
        try{
            String consulta = "insert into usuarios (Nombre, Apellido, Usuario, Password) value (?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, usuario);
            pst.setString(4, password);
            
            if(pst.executeUpdate() == 1){
                return true;
            }
        }catch (Exception ex){
            System.err.println("ERROR" + ex);
        } finally{
            try{
            if(getConexion() != null) getConexion().close();
            if(pst != null) pst.close();
            } catch (Exception e){
                System.err.println("ERROR" + e);
            } 
        }
        return false;
    }
}
