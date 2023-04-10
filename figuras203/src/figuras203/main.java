
package figuras203;
import java.util.Scanner;
public class main {
    public static void main (String[] args){
        
    /*vamos a instanciar */  /*objeto es la f*/
    figuras f = new figuras();  
    /*llamar este metodo*/
        Scanner sc = new Scanner(System.in);// Leer datos del teclado
        System.out.println("ingresa el nombre del caballo: ");
        String caballo = sc.nextLine();
        System.out.println("El nombre del caballo es "+ f.nombreCaballo(caballo));
        System.out.println("Ingrese la medida del lado L del cuadrado: ");
        double L = sc.nextDouble(); /*almacenar en variable L*/
        System.out.println("Area del Cuadrado: "+f.areaCuadrado(L));
        System.out.println("Perimetro del Cuadrado: "+f.perimetroCuadrado(L)+"\n\n");
        
        System.out.println("Ingrese la medida del largo del rectangulo: ");
        L = sc.nextDouble();
        System.out.println("Ingrese la medida del ancho del rectangulo");
        double Lm = sc.nextDouble();
        System.out.println("Area del Rectangulo: "+ f.areaRectangulo(L, Lm));
        System.out.println("Perimetro del Rectangulo: "+f.perimetroRectangulo(L, Lm)+"\n\n");
        
        System.out.println("Ingresa la medida de la base y la altura del triangulo; ");
        double Base = sc.nextDouble();
        double Altura = sc.nextDouble();
        System.out.println("Ingresa las medidas de los lados del triangulo: ");
        L=sc.nextDouble();
        Lm=sc.nextDouble();
        System.out.println("Area del Triangulo: "+f.areaTriangulo(Base, Altura));
        System.out.println("Perimetro del Triangulo: "+f.perimetroTriangulo(Base, L, Lm)+"\n\n");
        
        System.out.println("Ingresa las medidas del rombo D , d: ");
        double D= sc.nextDouble();
        double d=sc.nextDouble();
        System.out.println("ingresa la medida del lado del rombo: ");
        L=sc.nextDouble();
        System.out.println("Area del Rombo: "+f.areaRombo(D, d));
        System.out.println("Perimetro del Rombo: "+f.perimetroRombo(L)+"\n\n");
        
        System.out.println("Ingresa el appotema y el lado del pentagono: ");
        double ap = sc.nextDouble();
        double Lp = sc.nextDouble();
        System.out.println("Area del Pentagono: "+f.areaPentagono(ap, Lp));
        System.out.println("Perimetro del Pentagono: "+f.perimetroPentagono(Lp)+"\n\n");
        
        
        System.out.println("Ingresa el appotema y el lado del hexagono: ");
        double ah = sc.nextDouble();
        double Lh = sc.nextDouble();
        System.out.println("Area del Hexagono: "+f.areaHexagono(Lh, ah));
        System.out.println("Perimetro del hexagono: "+f.perimetroHexagono(Lh)+"\n\n");
        
        System.out.println("Ingresa la medida del radio: ");
        double r = sc.nextDouble();
        System.out.println("Area del Circulo: "+f.areaCirculo(r));
        System.out.println("Perimetro del Circulo: "+f.perimetroCirculo(r)+"\n\n");
        
        System.out.println("Ingresa la medida de la base mayor, base menor, altura, y lado del trapecio: ");
        double  bM= sc.nextDouble();
        double  bm= sc.nextDouble();
        double  atra= sc.nextDouble();
        double  ltra= sc.nextDouble();
        System.out.println("Area del Trapecio: "+f.areaTrapecio(bM, bm, atra));
        System.out.println("Perimetro del Trapecio: "+f.perimetroTrapecio(bM, bm, ltra)+"\n\n");
        
        System.out.println("INgresa la Base, la altura y el lado del palalelogramo: ");
        double bpala= sc.nextDouble();
        double apala = sc.nextDouble();
        double lpala = sc.nextDouble();
        System.out.println("Area del Palalelogramo: "+f.areaPalalelogramo(bpala, apala));
        System.out.println("Perimetro del Palalelogramo: "+f.perimetroPalalelogramo(bpala, lpala)+"\n\n");
    }
}
