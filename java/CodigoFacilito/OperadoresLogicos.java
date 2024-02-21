package programacion.java.CodigoFacilito;

public class OperadoresLogicos {

    public static void main(String[] args) {
        /*
         * and (y), or (o) y not(no)
         * 
         * and &&
         * 
         * or ||
         * 
         * not !true = false 
         *     !false = true
         */ 

        boolean resultado;

        resultado = 5 >= 5 && true; // todas deben de ser verdaderas
        System.out.println(resultado);

        resultado = 5 >= 5 || false; // al menos una debe de ser verdadera
        System.out.println(resultado);
    }
    
}
