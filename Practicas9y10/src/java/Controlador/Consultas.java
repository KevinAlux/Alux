/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import FactoriadeUsuarios.FactoriaUsuarios;

/**
 *
 * @author Kevin
 */
public class Consultas extends Conexion {

    public boolean autenticacion(String user, String password) {
        FactoriaUsuarios factoria = FactoriaUsuarios.getFactoria();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = null;
            if (factoria.obtenerUsuario(user).getTipoDeUsuario().equals("Invitado")) {
                consulta = "select * from invitado where user = ? and password = ?";
            }else if (factoria.obtenerUsuario(user).getTipoDeUsuario().equals("Normal")) {
                consulta = "select * from normal where user = ? and password = ?";
            }else if (factoria.obtenerUsuario(user).getTipoDeUsuario().equals("Admin")) {
                consulta = "select * from admin where user = ? and password = ?";
            }
            
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, user);
            pst.setString(2, password);
            rs = pst.executeQuery();

            if (rs.absolute(1)) {
                return true;
            }

        } catch (Exception e) {
            System.err.println("Error" + e);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                System.err.println("Error" + e);
            }

        }
        return false;
    }

    public boolean registrar(String user, String password, String nacimiento, String email, String usertype, int userid, int employeenumber, String nombre, String suscriptiontype, String address, String registerdate) {

        PreparedStatement pst = null;
        try {
        if(usertype.equals("Admin")){
            String consulta = "insert into admin (user, password, nacimiento, email, usertype, userid, employeenumber) values(?,?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, user);
            pst.setString(2, password);
            pst.setString(3, nacimiento);
            pst.setString(4, email);
            pst.setString(5, usertype);
            pst.setInt(6, userid);
            pst.setInt(7, employeenumber);
        }else if(usertype.equals("Normal")){
            String consulta = "insert into normal (user, password, nacimiento, email, usertype, userid, nombre, suscriptiontype, address) values(?,?,?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, user);
            pst.setString(2, password);
            pst.setString(3, nacimiento);
            pst.setString(4, email);
            pst.setString(5, usertype);
            pst.setInt(6, userid);
            pst.setString(7, nombre);
            pst.setString(7, suscriptiontype);
            pst.setString(8, address);
        }else if(usertype.equals("Invitado")){
            String consulta = "insert into invitado (user, password, nacimiento, email, usertype, userid, nombre, registerdate) values(?,?,?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, user);
            pst.setString(2, password);
            pst.setString(3, nacimiento);
            pst.setString(4, email);
            pst.setString(5, usertype);
            pst.setInt(6, userid);
            pst.setString(7, nombre);
            pst.setString(8, registerdate);
        }

            if (pst.executeUpdate() == 1) {
                return true;
            }

        } catch (Exception ex) {
            System.err.println("Error" + ex);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.err.println("Error" + e);
            }

        }

        return false;
    }
    
}
