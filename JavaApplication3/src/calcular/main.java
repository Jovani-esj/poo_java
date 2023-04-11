package calcular;

// main de uso
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones;
        do{
            
            System.out.println("\nIngresa una opcion: \n1._ Cuadrado\n2._Rectangulo\n3._Triangulo:\n4._Rombo\n5._Pentagono\n6._Hexagono");
            System.out.println("presiona 0 para salir...");
            opciones = sc.nextInt();
            switch (opciones){
            case 0:
                break;
            case 1:
                System.out.println("Ingresa el lado del cuadrado:");
                double lado = sc.nextDouble();
                Cuadrado c = new Cuadrado(lado);
                c.calcularArea();
                c.calcularPerimetro();
                c.imprimirResultados();
                break;
            case 2:
                System.out.println("Ingresa el largo del Rectangulo:");
                double largo = sc.nextDouble();
                System.out.println("Ingresa el ancho del Rectangulo: ");
                double ancho = sc.nextDouble();
                Rectangulo r = new Rectangulo(largo,ancho);
                r.calcularArea();
                r.calcularPerimetro();
                r.imprimirResultados();
                break;
            case 3:
                System.out.println("Ingresa la base del Triangulo");
                double base = sc.nextDouble();
                System.out.println("Ingresa la altura del Triangulo");
                double altura = sc.nextDouble();
                System.out.println("Ingresa el lado 1, lado2, y lado 3 del Triangulo");
                double lado1,lado2,lado3;
                lado1 = sc.nextDouble();
                lado2 = sc.nextDouble();
                lado3 = sc.nextDouble();
                Triangulo t = new Triangulo(base, altura, lado1, lado2, lado3);
                t.calcularArea();
                t.calcularPerimetro();
                t.imprimirResultados();  
                break;
            case 4:
                System.out.println("ingresa el Diametro mayor y menor del Rombo");
                double D,d,L;
                D=sc.nextDouble();
                d=sc.nextDouble();
                System.out.println("Ingresa la medida del lado del Rombo:");
                L = sc.nextDouble();
                Rombo R = new Rombo(D,d,L);
                R.calcularArea();
                R.calcularPerimetro();
                R.imprimirResultados();
                break;
            case 5:
                System.out.println("Ingresa el appotema y el lado del pentagono: ");
                double ap = sc.nextDouble();
                double Lp = sc.nextDouble();
                Pentagono P = new Pentagono(ap,Lp);
                P.calcularArea();
                P.calcularPerimetro();
                P.imprimirResultados();
                System.out.println("del Pentagono");
                break;
            case 6:
                System.out.println("Ingresa el appotema y el lado del hexagono: ");
                double ah = sc.nextDouble();
                double Lh = sc.nextDouble();
                Hexagono H = new Hexagono(Lh,ah);
                H.calcularArea();
                H.calcularPerimetro();
                H.imprimirResultados();
                System.out.println("del Hexagono");
                break;
            case 7:
                System.out.println("del Circulo");
                break;
            case 8:
                System.out.println("del Trapecio");
                break;
            case 9:
                System.out.println("del Palalelogramo");
                break;
            default:
                System.out.println("el numero seleccionado no es una opcion");
                break;
        }
        }while(opciones!=0);
        
    }
}