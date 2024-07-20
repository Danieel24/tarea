/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedio;

import java.util.Scanner;
/**
 *
 * @author ABC
  *


 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el primer número: ");
    double num1 = scanner.nextDouble();

    System.out.print("Ingrese el segundo número: ");
    double num2 = scanner.nextDouble();

    System.out.print("Ingrese el tercer número: ");
    double num3 = scanner.nextDouble();

    double promedio = (num1 + num2 + num3) / 3.0;

    System.out.println("El promedio es: " + promedio);
    }
    
}
