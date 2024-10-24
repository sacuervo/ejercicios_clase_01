/*

 Pida tres palabras por parte del usuario y la salida de las tres palabras en la pantalla. Por ejemplo,

 Introduzca palabra 1: Adiós
 Introduzca palabra 2: y
 Introduzca palabra 3: Hola
 Adiós y Hola

 */

import java.util.Scanner;

public class ImprimirEntradaUsuario {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.print("Introduzca palabra 1: ");
        var palabra1 = sc.nextLine();

        System.out.print("Introduzca palabra 2: ");
        var palabra2 = sc.nextLine();

        System.out.print("Introduzca palabra 3: ");
        var palabra3 = sc.nextLine();

        System.out.printf("%s %s %s", palabra1, palabra2, palabra3);

        sc.close();

    }

}