package programacion.java.CodigoFacilito;

public class elseif {
    public static void main(String[] args) {
               // Condicional if else if

               String colorLuz = "Verde";

               if (colorLuz.equals("Verde")){
                   System.out.println("Puede continuar");
               } else if (colorLuz.equals("Amarillo")){
                    System.out.println("Alto parcial");
                } else if(colorLuz.equals("Rojo")){
                   System.out.println("Alto total");
               } else{ 
                    System.out.println("Semaforo no sirve");
               }// fin else
        }// fin main
}

