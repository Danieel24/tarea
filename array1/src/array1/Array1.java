/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);

        scanner.close();
    }
}