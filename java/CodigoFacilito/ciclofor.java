package programacion.java.CodigoFacilito;

public class ciclofor {
    public static void main(String[] args) {
        // Cilco for
        
        // for( inicializacion; condicion; iteracion) {}
        
        for (int numero = 9, x=1 ; x < 11 ; System.out.println(numero*x), x++ ){}// fin for

        for(int numero = 9, x=1 ; x < 11;){
            System.out.println(numero*x); 
            x++;
        }

        for(int numero = 9, x=1 ; x < 11;){

            int resultado = numero * x;
            String mensaje = numero + " * " + x + " = " + resultado; 
            System.out.println(mensaje); 
            x++;
        }

        
    }
}
