package programacion.java.CodigoFacilito;

public class doWhile {
    public static void main(String[] args) {
        // Do while Se usa siempre que queramos que el codigo se ejecute una vez por lo menos.
        
        int contador = 0;
        
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }
        do {
            System.out.println(contador);
            contador++;
        } while (contador < 10);
    }
}
