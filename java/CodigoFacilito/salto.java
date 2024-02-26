package programacion.java.CodigoFacilito;

public class salto {

    public static void main(String[] args) {
        
        
    // break

    int valor = 10;
    switch (valor) {
        case 10:
            System.out.println("Es 10");
            break;
    
        default:
        System.out.println("no es 10");
            break;
    }
    
    for(int x= 1; x < 101; x++){

        if(x == 50){
            break;
        }

        System.out.println(x);
    }

    System.out.println("Ciclo completado");

    for(int i = 0; i < 3 ; i++){

        System.out.print("Siguiente" + i + ": ");

        for (int j = 0; j < 100 ; j++){

            if(j == 10){
                break;
            }
            System.out.print(j + " ");
        }
        System.out.println();
    }

}

}

    

