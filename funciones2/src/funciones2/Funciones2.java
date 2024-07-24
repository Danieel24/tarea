/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones2;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Funciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();
        scanner.close();

        int mcd = maximocomundivisor(numero1, numero2);
        System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es: " + mcd);
    }

    public static int maximocomundivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return maximocomundivisor(b, a % b);
        }
    }
}
