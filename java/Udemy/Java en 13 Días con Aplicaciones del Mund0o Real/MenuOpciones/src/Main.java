import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner opciones = new Scanner(System.in);
        System.out.println("*** Menu ***");
        System.out.println(" Escoja la opcion deseada.");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C#");

        var eleccion = Integer.parseInt(opciones.nextLine());

        if (eleccion == 1){
            System.out.println("Programacion en Java");
        } else if (eleccion == 2) {
            System.out.println("Programacion en Python");
        } else if (eleccion == 3) {
            System.out.println("Programacion en Java");
        }else {
            System.out.println("Opcion no valida.");
        }
    }
}