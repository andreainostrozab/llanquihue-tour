package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

/**
 * Ejecución del programa.
 */

public class Main {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> listaTours = gestor.cargarTours("resources/tours.txt");

        System.out.println("--- TODOS LOS TOURS ---");
        for (Tour tour : listaTours) {
            System.out.println(tour);
        }

        System.out.println("\n--- TOURS DE TIPO NATURAL ---");
        for (Tour tour : listaTours){
            if (tour.getTipo().equalsIgnoreCase("Natural")){
                System.out.println(tour);
            }
        }
    }
}
