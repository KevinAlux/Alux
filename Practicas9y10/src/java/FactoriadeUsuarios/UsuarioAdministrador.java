/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoriadeUsuarios;

/**
 *
 * @author Kevin
 */
public class UsuarioAdministrador extends User{
    private int numTrabajador;
    
    public UsuarioAdministrador(){
        
    }
    
    public UsuarioAdministrador(String usuario, String password, int id, String fechaDeNacimiento, String email, int numTrabajador){
        setNombreDeUsuario(usuario);
        setPassword(password);
        setId(id);
        setFechaDeNacimiento(fechaDeNacimiento);
        setEmail(email);
        setNumTrabajador(numTrabajador);
        setTipoDeUsuario("Admin");
    }

    /**
     * @return the numTrabajador
     */
    public int getNumTrabajador() {
        return numTrabajador;
    }

    /**
     * @param numTrabajador the numTrabajador to set
     */
    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }
    
    /**
     *
     */
    @Override
    public void setTipoDeUsuario(String tipoDeUsuario){
        this.tipoDeUsuario = tipoDeUsuario;
    }
}
