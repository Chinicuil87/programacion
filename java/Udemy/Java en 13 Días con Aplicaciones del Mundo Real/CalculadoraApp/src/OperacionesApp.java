import java.util.Scanner;

public class OperacionesApp {
    public static void main(String[] args) {
        System.out.println("**** Operaciones con dos numeros****");
        System.out.print("Inserta el primer numero: ");

        Scanner consola = new Scanner(System.in);

        var operador1 = Integer.parseInt(consola.nextLine());
        System.out.print("Inserta el segundo numero: ");
        var operador2 = Integer.parseInt(consola.nextLine());

        var resultado = operador1 + operador2;

        System.out.println("La suma de los numeros es: " + resultado);

        resultado = operador1 - operador2;

        System.out.println("La resta de los numeros es: " + resultado);

        resultado = operador1 * operador2;

        System.out.println("La multiplicacion de los numeros es: " + resultado);

        resultado = operador1 / operador2;

        System.out.println("La la division del los numeros es: " + resultado);

    }
}
