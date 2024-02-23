package src;

public class NumerosPrimitivos {
    public static void main(String[] args) {
        // Boolean 
        // Solo puedne ser de dos tipos true o false.
        // true y false son palabras reservadas.
        boolean a = true;
        boolean b = false;

        // Char
        // es un solo caracter y ocupa 16 bits
        char c = 'a';
        char d = '1';
        char e = '\u0021'; // puede tener mas de un caracter cuendo es un elemento unicode
                           // \b retroceso
                           // \n nueva linea
                           // \r retorno al carro
                           // \t tabulador
                           // \\ Diagona invertida
                           // \" comillas dobles

        // Enteros
        byte enteroByte = 127;  // entre -128 a 127
        short enteroShort = 32767; // entre -32768 a 32767
        int enteroInt = 2147483647; // entre -2147483648 a 2147483647
        long enteroLong = 9223372036854775807L; //entre -922337203685475808 a 9223372036854775807
        
        // Reales
        float realFloat= 3.1416f; // entre -1.4E-45 a 3.4028235E38
        double realBouble =4.7029235E3; // entre -4.9E-324 a 1.797693134862357E308
    }
}
