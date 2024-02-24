package programacion.java.CodigoFacilito;

public class condicionesAnidadas {
    public static void main(String[] args) {
        
        int promedio = 6;

        if (promedio >= 7) {

            if (promedio == 10) {
                System.out.println("Muchas Felicidades");
            }else{
                System.out.println("Felicidades");
            }
            
        }else{
            System.out.println("Es necesario repetir curso.");
        }
    }
}
