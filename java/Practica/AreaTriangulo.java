package programacion.java.Practica;
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            System.out.println("Introdiuce la altura: ");
            double b = s.nextDouble();

            System.out.println("Introduce la altura: ");
            double a = s.nextDouble();

        double area = (b*a)/2;
        System.out.println("El ara del triangulo es: " + area);
    }
}
