package src;

public class PrimitivosEnteros {
    public static void main(String[] args) {
        
        byte numeroByte = 127;
        System.out.println(numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("el valor maximo de un byte: " + Byte.MAX_VALUE );
        System.out.println("el valor minimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println(numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo Short corresponde en bites a " + Short.SIZE);
        System.out.println("el valor maximo de un short: " + Short.MAX_VALUE );
        System.out.println("el valor minimo de un short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println(numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("el valor maximo de un int: " + Integer.MAX_VALUE );
        System.out.println("el valor minimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println(numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("el valor maximo de un long: " + Long.MAX_VALUE );
        System.out.println("el valor minimo de un long: " + Long.MIN_VALUE);

        var numeroVar = 127;
        
    }
    
}
