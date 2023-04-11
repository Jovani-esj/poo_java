
package calcular;

public class Rombo extends Figura{
    
    private double D;
    private double d;
    private double L;
    
    public Rombo(double D,double d,double L){
        this.D=D;
        this.d=d;
        this.L=L;
    }
    @Override
    public void calcularArea(){
        area = ((D*d)/2);
    }
    @Override
    public void calcularPerimetro(){
        perimetro=(L*4);
    }
    
    
}
