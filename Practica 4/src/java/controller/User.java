/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Kevin
 */
class User {
    private String value;
    private String edad;
    private String email;
    
    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the name
     */
    public String getValue() {
        return value;
    }

    /**
     * @param name the name to set
     */
    public void setValue(String name) {
        this.value = name;
    }
}
