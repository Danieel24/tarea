/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array4;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Array4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        System.out.println("Ingrese 6 números enteros:");
        for (int i = 0; i < 6; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Array original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Invertir el array
        int inicio = 0;
        int fin = numeros.length - 1;
        while (inicio < fin) {
            int temp = numeros[inicio];
            numeros[inicio] = numeros[fin];
            numeros[fin] = temp;
            inicio++;
            fin--;
        }

        System.out.println("Array invertido:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
