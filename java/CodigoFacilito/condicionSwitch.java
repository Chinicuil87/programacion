package programacion.java.CodigoFacilito;

public class condicionSwitch {
    public static void main(String[] args) {

        String colorLuz = "Rosa";

        switch(colorLuz) {
            case "Verde":
                System.out.println("Puede continuar");
                break;
            case "Amarillo":
                System.out.println("Alto parcial");
                break;
            case "Rojo":
                System.out.println("Alto total");
                break;
            default:
                System.out.println("Color no valido");
        }
        
    } // fin main
} // fin class
