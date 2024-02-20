package src;

public class TiposDatos {

    // psvm = public static void main(String[] args)
    public static void main(String[] args) {

        String saludar = "Hola Java"; // declarar variable
        System.out.println(saludar); // imprimir variable

        // sout = System.out.println
        System.out.println("Saludar. = " + saludar); // concadenar texto con variable

        System.out.println(saludar.toUpperCase()); // todo a mayusculas.

        System.out.println(saludar.toLowerCase()); // todo a minusculas

        int numero = 10; // int primitivo no contiene metodos
        System.out.println(numero);

        Integer numero1 = 20; // declaracion de variable numero que si contiene metodos.
        System.out.println(numero1.floatValue());
        

    }
}
