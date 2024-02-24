package programacion.java.CodigoFacilito;

public class SecuanciasEscape {
    public static void main(String[] args) {
        /*
        \n. Salto de línea.
        \t. Tabulador.
        \\. Diagonal inversa.
        \". Comillas dobles.
        \'. Comillas simples.
         */

        System.out.print("Hola,\n agregamos un salto");
        System.out.print("\t agregamos un tab");
        System.out.println("");

        System.out.println("Mensaje con \\ diagonal inversa");
        System.out.println("Mensaje con \" comillas dobles");
        System.out.println("Mensaje con \'comillas simples");
    }
}
