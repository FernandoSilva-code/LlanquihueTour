/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fernando Marcelo
 */
public class Direccion {
    private String calle;
    private String numero;
    private String comuna;
    
    //Constructor vacio

    public Direccion() {
    }
    
    //Constructor privado

    public Direccion(String calle, String numero, String comuna) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
    }
    
    //Getter y Setter

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    
    //metodo ToString

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", comuna=" + comuna + '}';
    }
    
    
}
