/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package brindar_informacion;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Brindar_informacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el nombre de un artista, película, serie o algo de tu preferencia: ");
    String opcion = scanner.nextLine();

    switch (opcion) {
      case "Adam Sandler":
        System.out.println("Adam Richard Sandler, es un comediante, actor, escritor, cantante y productor estadounidense.");
        break;
      case "Son como niños":
        System.out.println("Un grupo de amigos y excompañeros descubren que envejecer no siempre significa madurar cuando se reúnen para honrar la memoria de su entrenador de baloncesto.");
        break;
      case "drive to survive":
        System.out.println("Los pilotos, representantes y dueños de equipos viven a máxima velocidad, tanto dentro como fuera de la pista, durante una temporada despiadada en la Fórmula 1.");
        break;
      case "Natanael Cano":
        System.out.println("Nathanahel Rubén Cano Monge es un cantante y compositor mexicano dedicado principalmente al género musical corridos tumbados, además de ser acreditado como precursor del mismo.");
        break;
      case "samurai":
        System.out.println("La palabra samurái  o samuray generalmente se utiliza para designar una gran variedad de guerreros del antiguo Japón, aunque su verdadero significado es el de una élite militar que gobernó el país durante cientos de años.");
        break;
      default:
        System.out.println("Lo siento, no tengo la información sobre " + opcion + ".");
    }
  }
}

