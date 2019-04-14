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
public class UsuarioInvitado extends User{
    private String nombre;
    private String fechaDeRegistro;
    
    public UsuarioInvitado(){
        
    }
    
    public UsuarioInvitado(String usuario, String password, int id, String fechaDeNacimiento, String email, String nombre, String fechaDeRegistro){
        setNombreDeUsuario(usuario);
        setPassword(password);
        setId(id);
        setFechaDeNacimiento(fechaDeNacimiento);
        setEmail(email);
        setNombre(nombre);
        setFechaDeRegistro(fechaDeRegistro);
        setTipoDeUsuario("Invitado");
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechaDeRegistro
     */
    public String getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    /**
     * @param fechaDeRegistro the fechaDeRegistro to set
     */
    public void setFechaDeRegistro(String fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }
    
    @Override
    public void setTipoDeUsuario(String tipoDeUsuario){
        this.tipoDeUsuario = tipoDeUsuario;
    }
}
