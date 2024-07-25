/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays2_;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Arrays2_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        System.out.println("Ingrese 5 números enteros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        System.out.println("La suma de los elementos es: " + suma);

        scanner.close();
    }
}

