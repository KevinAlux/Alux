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
public class UsuarioNormal extends User{
    private String nombre;
    private String tipoDeSuscripcion;
    private String direccion;
    
    public UsuarioNormal(){
        
    }
    
    public UsuarioNormal(String usuario, String password, int id, String fechaDeNacimiento, String email, String nombre, String tipoDeSuscripcion, String direccion){
        setNombreDeUsuario(usuario);
        setPassword(password);
        setId(id);
        setFechaDeNacimiento(fechaDeNacimiento);
        setEmail(email);
        setNombre(nombre);
        setTipoDeSuscripcion(tipoDeSuscripcion);
        setDireccion(direccion);
        setTipoDeUsuario("Normal");
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     
    public String getTipoDeSuscripcion() {
        return tipoDeSuscripcion;
    }

    
    public void setTipoDeSuscripcion(String tipoDeSuscripcion) {
        this.tipoDeSuscripcion = tipoDeSuscripcion;
    }

    
    public String getDireccion() {
        return direccion;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    @Override
    public void setTipoDeUsuario(String tipoDeUsuario){
        this.tipoDeUsuario = tipoDeUsuario;
    }
}
