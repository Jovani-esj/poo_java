//modificadores de acceso ----- encapsulamiento
package paquete1;

public class Clase1 {
    private int edad; //atributo edad
    private String nombre;
    //privado solo metodos de la misma clase clase 1
    //publico metodos incluso de otros paquetes
    //defecto metodos del mismo paquete 
    //encapsulamiento = ocultar datos para evitar su modificacion
    
     //getter and setter  = metodos accesores
    
    public void setEdad(int edad){ //set = establecer edad
        this.edad=edad;
    }
    
    public int getEdad(){//metodo getter motrar edad
        return edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() { 
        return nombre;
    }
    
    public String asignacion(String casa){
        this.nombre=casa;
        return casa;
    }

    
}
