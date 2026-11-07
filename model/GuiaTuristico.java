/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fernando Marcelo
 */
public class GuiaTuristico extends Persona {
    private String especialidad;
    private String idiomaprincipal;
    
    //Constructor vacio

    public GuiaTuristico() {
        super();
    }

    public GuiaTuristico(String especialidad, String idiomaprincipal, String nombre, String rut, String email, Direccion direccion) {
        super(nombre, rut, email, direccion);
        this.especialidad = especialidad;
        this.idiomaprincipal = idiomaprincipal;
    }
    //Getter y Setter 

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getIdiomaprincipal() {
        return idiomaprincipal;
    }

    public void setIdiomaprincipal(String idiomaprincipal) {
        this.idiomaprincipal = idiomaprincipal;
    }
    
    //metodo ToString

    @Override
    public String toString() {
        return super.toString() + " | Especialidad: " + especialidad + " | Idioma: " + idiomaprincipal;}
    }