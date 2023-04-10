
package parametrosArgumentos;


public class persona {
    int edad;
    String nombre;
    String apellido;
    
    
    //metodo constructor no se le pone valor de retorno;
    public persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
   //sobrecarga de constructores dif parametros  
    public persona(String apellido){
        this.apellido=apellido;
    }
    public void chanchito(String name,String semestre){
        this.nombre=name;
    }
    //metodo normal
    
    public void imprimechanchito(){
        System.out.println("el nombre de chancnito es: "+nombre);
    }
    public void muestraDatos(){
        System.out.println("el nombre es "+ nombre);
        System.out.println("La edad es "+ edad);
    }
    //sobrecarga de metodos
    public int edades(int edad){
        return edad;
        
    }
    
    public void muestraDatos(int edad,String apellido){
        System.out.println("edad: "+ edad);
        System.out.println("bienvenido: "+ nombre + apellido);
        
    }
}
