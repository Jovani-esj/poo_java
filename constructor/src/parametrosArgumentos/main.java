
package parametrosArgumentos;

public class main {
    public static void main(String[] args) {
        
  //creacion del objeto persona con los argumentos   
    persona p1 = new persona("jovani",20);
    
    int casit = p1.edades(34);
    
    
    p1.muestraDatos();//invocar el metodo muestra datos de clase persona
    p1.muestraDatos(casit,"sancejss");
    
    p1.imprimechanchito();
    
    }
    
}
