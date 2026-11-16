package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Tour;

/**
 * Lee los datos desde el archivo de texto y los convierte en objetos.
 */

public class GestorDatos {
    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> listaTours = new ArrayList<>();

        try {
            File archivo = new File(rutaArchivo);
            Scanner sc = new Scanner(archivo);

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] datos = linea.split(";");

                if (datos.length == 4) {
                    String nombre = datos[0];
                    String tipo = datos[1];
                    String destino = datos[2];
                    double precio = Double.parseDouble(datos[3]);

                    Tour tour = new Tour(nombre, tipo, destino, precio);
                    listaTours.add(tour);
                }
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo " + rutaArchivo);
        }

        return listaTours;
    }
}
