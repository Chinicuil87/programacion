package programacion.java.CodigoFacilito;

public class OperadoresRelacionales {
    
    public static void main(String[] args) {

        /*
         * > mayor que
         * < menor que
         * >= mayor o igual que
         * <= menor o igual que
         * == igual que
         * != diferente que
         */
    
        int variable1 = 300;
        int variable2 = 200;
        boolean resultado;

        resultado = variable1 > variable2;
        System.out.println(resultado);

        resultado = variable2 < variable1;
        System.out.println(resultado);

        resultado = variable1 == variable2;
        System.out.println(resultado);

        resultado = variable1 != variable2;
        System.out.println(resultado);

    }

}
