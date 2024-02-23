package src;

public class FlotantesPrimitivos {
    public static void main(String[] args) {

        float realFloat = 3.4028235E38f;
        System.out.println(realFloat);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("el valor maximo de un float: " + Float.MAX_VALUE );
        System.out.println("el valor minimo de un float: " + Float.MIN_VALUE);

        double realDouble = 1.7976931348623157E308d;
        System.out.println(realDouble);
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("el valor maximo de un double: " + Double.MAX_VALUE );
        System.out.println("el valor minimo de un double: " + Double.MIN_VALUE);
        
    }
}
