/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones3;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Funciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();
        scanner.close();

        if (palindromo(texto)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }

    public static boolean palindromo(String texto) {
        texto = texto.replaceAll("\\s+", "").toLowerCase();
        String textoReverso = new StringBuilder(texto).reverse().toString();
        return texto.equals(textoReverso);
    }
}
