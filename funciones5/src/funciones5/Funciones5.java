/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones5;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Funciones5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        System.out.println("Ingrese el caracter a reemplazar: ");
        char caracterAntiguo = scanner.next().charAt(0);

        System.out.println("Ingrese el caracter nuevo: ");
        char caracterNuevo = scanner.next().charAt(0);

        String textoReemplazado = texto.replace(caracterAntiguo, caracterNuevo);

        System.out.println("Texto reemplazado: " + textoReemplazado);

        scanner.close();
    }
}