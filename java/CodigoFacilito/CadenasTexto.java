package programacion.java.CodigoFacilito;

public class CadenasTexto {

    public static void main(String[] args) {
        
        //String 
        /*
         * Se colocan dentro de comillas dobles o sencillas.
         * El string es una clase
         */

        // Decalracion de variables tipo string
        String texto = "Hola soy un string";
        String texto2 = new String("Texto");

        System.out.println(texto);
        System.out.println(texto2);

        // Metodos de los string.

        String mensaje = "Este es un mesaje de tipo string en Java";
        // Numero de caracteres.
        int cantidad = mensaje.length();
        System.out.println(cantidad);

        // Saber si contiene string
        boolean contiene = mensaje.contains("tipo");
        System.out.println(contiene);

        // Saber si inicia con un string

        boolean iniciaCon = mensaje.startsWith("Este");
        System.out.println(iniciaCon);

        // Finaliza con un string
        boolean finalizaCon = mensaje.endsWith("Java");
        System.out.println(finalizaCon);

        // Concadenar 
        String nuevoString = mensaje.concat(", Estas estudiando Java");
        System.out.println(nuevoString);
    }
    
}
