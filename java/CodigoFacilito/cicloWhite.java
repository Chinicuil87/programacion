package programacion.java.CodigoFacilito;

import javax.sound.midi.Soundbank;

public class cicloWhite {
    public static void main(String[] args) {
        // while 

        int contador = 0;

        while (contador < 11) {
          System.out.println("Hola mundo");
           contador ++;
       }// fin while


        int incremento = 0;
        int numero = 1234567891;

        while (numero > 0) {
            numero = numero / 10;
            incremento ++;
        }

        System.out.println("El numero posee " + incremento + " digitos" );

        
    }// fin main
    
}  // fin clase
