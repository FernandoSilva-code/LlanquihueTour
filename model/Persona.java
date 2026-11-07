/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fernando Marcelo
 */
public class Persona {
    private String nombre;
    private String rut;
    private String email;
    private Direccion direccion;  //relacion de composicion
    
    //constructor vacio

    public Persona() {
    }
    
    
    //constructor privado

    public Persona(String nombre, String rut, String email, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.email = email;
        this.direccion = direccion;
        
//Getter y Setter
              
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", rut=" + rut + ", email=" + email + ", direccion=" + direccion + '}';
    }
    
    
}
