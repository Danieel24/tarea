/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area_rectangulo;

import java.util.Scanner;

/**
 *
 * @author ABC
 */
public class Area_rectangulo {

    /**
     * @param args the command line arguments
     */
    
/**
 *
 * @author ABC
     * @param args
 */

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese la base del rectangulo: ");
    double base = scanner.nextDouble();

    System.out.print("Ingrese la altura del rectangulo: ");
    double altura = scanner.nextDouble();

    double area = base * altura;

    System.out.println("El area del rectángulo es: " + area);
    }
    
}
