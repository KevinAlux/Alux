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
public abstract class User {
    protected String nombreDeUsuario;
    protected String password;
    protected int id;
    protected String fechaDeNacimiento;
    protected String email;
    protected String tipoDeUsuario;
    
    public User(){
    }
    
    public User(String usuario, String password, int id, String fechaDeNacimiento, String email){
        setNombreDeUsuario(usuario);
        setPassword(password);
        setId(id);
        setFechaDeNacimiento(fechaDeNacimiento);
        setEmail(email);
    }

    
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    
    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    
    public abstract void setTipoDeUsuario(String tipoDeUsuario);
}