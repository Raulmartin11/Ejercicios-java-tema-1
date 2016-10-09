/*
 * Horario Escolar Coloreado
 *
 *@author Raul Martin
 */
public class Ejercicio05 {
  public static void main (String[] args) {

    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    String celeste = "\033[36m";
    String vo = "\033[30m";

    System.out.println(azul + "Lunes      Martes      Miercoles      Jueves      Viernes");
    System.out.println("------------------------------------------------------------");
    System.out.printf("%-5s      %-5s       %-5s          %-5s       %-5s\n", morado + "S.Inf", verde + "Prog", "Prog", naranja + "B.D", blanco + "L.M");
    System.out.printf("%-5s      %-5s       %-5s          %-5s       %-5s\n", morado + "S.Inf", verde + "Prog", "Prog", naranja + "B.D", blanco + "L.M");
    System.out.printf("%-5s      %-5s       %-5s            %-5s       %-5s\n\n", morado + "S.Inf", verde + "Prog", blanco + "L.M",   naranja + "B.D", vo + "E.D");
    System.out.printf("%-5s        %-5s        %-5s            %-5s      %-5s\n",rojo + "FOL",naranja + "B.D",blanco + "L.M",verde + "Prog",morado + "S.Inf");
    System.out.printf("%-5s        %-5s        %-5s            %-5s      %-5s\n",rojo + "FOL",naranja + "B.D",vo + "E.D",verde + "Prog",morado + "S.Inf");
    System.out.printf("%-5s        %-5s        %-5s            %-5s      %-5s\n",rojo + "FOL",naranja + "B.D",vo + "E.D",verde + "Prog",morado + "S.Inf");
  }
}
