/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese su peso en kilogramos: ");
    double peso = scanner.nextDouble();

    System.out.print("Ingrese su altura en metros: ");
    double altura = scanner.nextDouble();

    double imc = peso / Math.pow(altura, 2);

    System.out.println("Su IMC es: " + String.format("%.2f", imc));

    if (imc < 18.5) {
      System.out.println("Usted tiene un peso bajo.");
    } else if (imc < 25) {
      System.out.println("Usted tiene un peso normal.");
    } else if (imc < 30) {
      System.out.println("Usted tiene sobrepeso.");
    } else {
      System.out.println("Usted tiene obesidad.");
    }
    }
    
}
