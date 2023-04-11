
package calcular;

//definir clase hija Rectangulo
public class Rectangulo extends Figura {
    
    private double largo;
    private double ancho;
    
    public Rectangulo(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    
    
            
    @Override
    public void calcularArea(){
        area = largo*ancho;
    }
    
    @Override
    public void calcularPerimetro(){
        perimetro = (2*largo)+(2*ancho);
    }
    
}
