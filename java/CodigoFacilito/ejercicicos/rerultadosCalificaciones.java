package programacion.java.CodigoFacilito.ejercicicos;

import java.util.Scanner;

public class rerultadosCalificaciones {

    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);

        System.out.print("Introduce la Calificacion: ");

        var calificacion = Integer.parseInt(consola.nextLine());



        if (calificacion >= 7){
            System.out.println("Aprobado");
        } else{
            System.out.println("Reprovado");
        }
    }
    
}
