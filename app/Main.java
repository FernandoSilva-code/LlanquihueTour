/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Fernando Marcelo
 */

import model.Direccion;
import model.GuiaTuristico;
import model.Persona;

public class Main {
    public static void main(String[] args) {
        // Instanciación de Direcciones (Composición)
        Direccion dir1 = new Direccion("Av. Las Rejas Sur", "965", "Estacion Central");
        Direccion dir2 = new Direccion("Calle San Martin", "456", "Puerto Varas");
        Direccion dir3 = new Direccion("Av. Diego Portales", "789", "Puerto Montt");

        // Instancia de Persona base
        Persona persona1 = new Persona("Fernando Silva", "19.904.533-4", "fem.silva@duocuc,cl", dir1);

        // Instancias de GuiaTuristico (Heredan de Persona)
        GuiaTuristico guia1 = new GuiaTuristico("Tours Gastronomicos", "Espanol e Ingles", "Maria Jose Silva", "16.890.123-K", "maria.silva@llanquihuetour.cl", dir2);
        GuiaTuristico guia2 = new GuiaTuristico("Excursiones Culturales", "Espanol y Aleman", "Roberto Gomez", "17.654.321-5", "roberto.gomez@llanquihuetour.cl", dir3);

        // Salida por consola
        System.out.println("==================================================");
        System.out.println("       SISTEMA DE GESTION LLANQUIHUE TOUR         ");
        System.out.println("==================================================");
        System.out.println("REGISTRO 1 (Persona Base):");
        System.out.println(persona1);
        System.out.println("\nREGISTRO 2 (Guia Turistico 1):");
        System.out.println(guia1);
        System.out.println("\nREGISTRO 3 (Guia Turistico 2):");
        System.out.println(guia2);
        System.out.println("==================================================");
    }
}