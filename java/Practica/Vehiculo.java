package programacion.java.Practica;ng

public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double precio = 0.0;
    private boolean disponible = false;

    public String getAtributos(){
        return "Matricula: " + this.matricula +
                "Modelo: " + this.modelo +
                "Color: " + this.color +
                "Precio: " + this.precio +
                "Disponible: " + this.disponible;
    }
    
}

public double getPrecio(){
    return this.precio;
}

public void setPrecio(double tarifa){
    this.precio = precio;
}


