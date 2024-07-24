/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones4;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Funciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese una palabra o cadena de texto o espacio en blanco para salir: ");
            String texto = scanner.nextLine();

            if (texto.trim().isEmpty()) {
                break;
            }

            String textoMayusculas = texto.toUpperCase();
            System.out.println("Texto en mayusculas: " + textoMayusculas);
        }

        scanner.close();
    }
}
