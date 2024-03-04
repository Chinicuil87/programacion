package programacion.java.Practica;

import  java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

            System.out.println("Ingresa el radio: ");
            double r = s.nextDouble();
            double area = (22*r*r)/7;
            System.out.println("El area del circulo es : " + area);
    }
}
