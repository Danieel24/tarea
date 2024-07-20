/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador_de_digitos;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Contador_de_digitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese un número entero: ");
    int numero = scanner.nextInt();

    int contadorDigitos = contarDigitos(numero);

    System.out.println("El número tiene " + contadorDigitos + " dígitos.");
  }

  public static int contarDigitos(int numero) {
    int contador = 0;
    while (numero != 0) {
      numero /= 10;
      contador++;
    }
    return contador;
  }
}