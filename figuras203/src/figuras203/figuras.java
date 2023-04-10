
package figuras203;


public class figuras {
    public double L; /*lado */
    public double Lm;/*lado menor*/
    public double base;
    public double Base;
    public double Altura;
    public double radio;
    public double D;
    public double d;
    public double apotema;
    
    /*metodos o procedimientos*/
    
    public double areaCuadrado(double L){
     return(L*L);
    }
    /*metodo para perimetro cuadrado*/
    public double perimetroCuadrado(double L){
        return(4*L);
    }
    /*metodos del rectangulo*/
    public double areaRectangulo(double L,double Lm){
        return (L*Lm);
    }
    public double perimetroRectangulo(double L,double Lm){
        return(L+L+Lm+Lm);
    }
    /*metodos del triangulo*/
    public double areaTriangulo(double Base ,double Altura){
        return((Base*Altura)/2);
    }
    public double perimetroTriangulo(double Base, double L,double Lm){
        return(Base+L+Lm);
    }
    /*metodos rombo*/
    public double areaRombo(double D,double d){
        return((D*d)/2);
    }
    public double perimetroRombo(double L){
        return(L*4);
    }
    /*metodos pentagono*/
    public double areaPentagono(double apotema,double L){
        return(((5*L)*apotema)/2);
    }
    public double perimetroPentagono(double L){
        return(5*L);
    }
    /*metodos hexagono*/
    public double areaHexagono(double L,double apotema){
        return(((L*6)*apotema)/2);
    }
    public double perimetroHexagono(double L){
        return(6*L);
    }
    /*metodos circulo*/
    public double areaCirculo(double radio){
        return(3.1416*(radio*radio));
    }
    public double perimetroCirculo(double radio){
        return(2*3.1416*radio);
    }
    /*metodos trapecio*/
    public double areaTrapecio(double Base,double base,double Altura){
        return(((Base+base)/2)*Altura);
    }
    public double perimetroTrapecio(double Base,double base,double L){
        return(Base+base+L+L);
    }
    /*metodo Palalelogramo */
    public double areaPalalelogramo(double Base,double Altura){
        return (Base*Altura);
    }
    public double perimetroPalalelogramo(double Base,double L){
        return(2*(Base+L));
    }
    public  String nombreCaballo(String caballo){
        return("hola mundo "+ caballo);
    }
}

/*oracle academy*/