package src;

import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Primer numero: ");
        var numero1 = Integer.parseInt(consola.nextLine());

        System.out.println("Segundo numero: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        var resultado = numero1 + numero2;

        System.out.println(resultado);

    }

    static int Suma(numero1, numero2){
        return numero1 + numero2;
    }
}
