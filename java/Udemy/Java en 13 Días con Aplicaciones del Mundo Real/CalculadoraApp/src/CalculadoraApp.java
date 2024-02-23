import java.util.Scanner;
public class CalculadoraApp {
    public static void main(String[] args) {

        Scanner digitos = new Scanner(System.in);
        // Mostrar el nombre de la aplicacion.
        while (true) {
            System.out.println("**** Aplicacion calculadora ****");
            // Muestra el menu de opciones.
            System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
            // Solicita al usuario escoja una opcion.
            System.out.print("Seleccione la opcion deseada: ");
            try {

                var seleccion = Integer.parseInt(digitos.nextLine());
                // Validamos que el usuario ingreso una opcion valida.
                if (seleccion >= 1 && seleccion <= 4) {

                    System.out.print("Ingresa el primer numero: ");
                    var numero1 = Integer.parseInt(digitos.nextLine());
                    System.out.print("Ingresa el primer numero: ");
                    var numero2 = Integer.parseInt(digitos.nextLine());

                    int resultado;

                    switch (seleccion) {
                        case 1 -> { // suma
                            resultado = numero1 + numero2;
                            System.out.println("La suma de los numeros es igual a: " + +resultado);
                        }
                        case 2 -> { // resta
                            resultado = numero1 - numero2;
                            System.out.println("La resta de los numeros es igual a: " + resultado);
                        }
                        case 3 -> { // multiplicacion
                            resultado = numero1 * numero2;
                            System.out.println("La multiplicacion de los numeros es igual a: " + resultado);
                        }
                        case 4 -> { // division
                            resultado = numero1 / numero2;
                            System.out.println("La division de los numero es igual a: " + resultado);
                        }
                        default -> {
                            System.out.println("Opcion no valida: " + seleccion);
                        }
                    } // fin switch
                } // fin if
                else if (seleccion == 5) { // salir
                    System.out.println("Fin de la aplicacion");
                    break;
                } else {
                    System.out.println("Opcion no valida: " + seleccion);
                }
                System.out.println();

            } // fin try
            catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }// fin catch

        }// fin while

    }// fin main

} // fin class
