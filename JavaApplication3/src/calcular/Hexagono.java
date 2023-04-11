
package calcular;

public class Hexagono extends Figura {
    private double L;
    private double ap;
    
    public Hexagono(double L,double ap){
        this.L=L;
        this.ap=ap;
    }
    
    @Override
    public void calcularArea(){
        area=(((L*6)*ap)/2);
    }
    @Override
    public void calcularPerimetro(){
        perimetro=(6*L);
    }
}
