import java.util.Scanner;
public class SaludarApp {
    public static void main(String[] args) {

        System.out.println("**** Saludar Usuario ****");

        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor ingresa tu nombre: ");

        var nombreUsuario = lectura.nextLine();

        System.out.print("Hola "+ nombreUsuario);
        System.out.println(", Bienvenido al curso de Java");
    }
}
