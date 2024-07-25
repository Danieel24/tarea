/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array3;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Ingrese 8 números enteros:");
        for (int i = 0; i < 8; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        scanner.close();
    }
}
