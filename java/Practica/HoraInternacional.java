package programacion.java.Practica;

import java.text.*;
import java.util.*;

public class HoraInternacional {

    public static void main(String args[]) {
 
     // Obtener la fecha
     Date now = new Date();
 
     // Obtener los formateadores de fecha de los entornos nacionales
     // predeterminados, alemán y francés
     DateFormat theDate = DateFormat.getDateInstance(DateFormat.LONG);
     DateFormat germanDate = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMANY);
     DateFormat frenchDate = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
 
     // Formatear e imprimir las fechas
     System.out.println("Fecha en el entorno nacional predeterminado: " + theDate.format(now));
     System.out.println("Fecha en el entorno nacional alemán: " + germanDate.format(now));
     System.out.println("Fecha en el entorno nacional francés: " + frenchDate.format(now));  
   } 
    
}
