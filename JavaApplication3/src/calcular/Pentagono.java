
package calcular;

public class Pentagono extends Figura{
    private double apotema;
    private double L;
    
    public Pentagono(double apotema,double L){
        this.apotema= apotema;
        this.L = L;
    }
    
    @Override
    public void calcularArea(){
        area=(((5*L)*apotema)/2);
    }
    @Override
    public void calcularPerimetro(){
        perimetro=(5*L);
    }
}
