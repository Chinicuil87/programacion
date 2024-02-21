package programacion.java.CodigoFacilito;

public class MetodosString {

    public static void main(String[] args) {
        // Metodos.

        String mensaje = "Hola, soy un String";
        System.out.println(mensaje);

        // Convertir a mayusculas.
        String mayusculas = mensaje.toUpperCase();
        System.out.println(mayusculas);

        // Convestir a minisculas.
        String minusculas = mensaje.toLowerCase();
        System.out.println(minusculas);

        // Quitar los espacios al inicio y alfinal
        String mensaje2 = "    Espacios    ";
        String quitarEspacios = mensaje2.trim();
        System.out.println(quitarEspacios);

        // Formato

        String nuevoMensaje =String.format("Bienvenido al curso %s", "Java");
        System.out.println(nuevoMensaje);

        float valor = 10.872040f;
        nuevoMensaje = String.format("%.2f", valor);
        System.out.println(nuevoMensaje);

    }
    
}
