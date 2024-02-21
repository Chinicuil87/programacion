package src;

public class ReglasVariables {
    public static void main(String[] args) {

        int numero = 3;
        System.out.println(numero);
        String nombre; // Se puede asignar un tipo de variable sin darle un valor.
        nombre = "Cesar";  // Se le asigna el valor a la variable.
        System.out.println(nombre);

        if (numero<10){
            nombre = "Juan";
        }
        System.out.println(nombre);

        // int class X no se puede usar palabras reservadas como nombre de variable.
        // int 1edad X no se puede iniciar el nombre de una variable con un numero
        // evita asentos y la letra ñ 
        
    }    
}
