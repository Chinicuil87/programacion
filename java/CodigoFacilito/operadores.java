package programacion.java.CodigoFacilito;

public class operadores {

    public static void main(String[] args) {
        
        int variableX = 50;
        int variableY = 10;
        int resultado;

        // Suma
        resultado = variableX + variableY;
        System.out.println(resultado);

        // Resta
        resultado = variableX - variableY;
        System.out.println(resultado);

        //  Multiplicacion
        resultado = variableX * variableY;
        System.out.println(resultado);

        // Division
        resultado = variableX / variableY;
        System.out.println(resultado);

        // Incremento
        //variableX = variableX + 1;
        variableX++;
        System.out.println(variableX);

        // Decrecer
        variableX--;
        System.out.println(variableX);

        // Incremento por cantidad.
        variableX += 100;
        System.out.println(variableX);

        // Decremento por cantidad.
        variableX -= 100;
        System.out.println(variableX);

        variableX *=3; // variableX = variableX * 3
        System.out.println(variableX);
    }
    
}
