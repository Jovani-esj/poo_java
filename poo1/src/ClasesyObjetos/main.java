
package ClasesyObjetos;
import java.util.Scanner;
public class main {
     public static void main(String[] args) {
    //creacion de objeto de la clase operacion llamado op;
    Operacion op=new Operacion();
    Scanner sc= new Scanner(System.in);
    
    int numero3,numero4;
    numero3=sc.nextInt();
    numero4=sc.nextInt();
    op.leerNumeros();//metodo leer
    op.sumar(numero3,numero4);//metodo sumar
    op.restar(numero3,numero4);
    op.multiplicar();
    op.dividir();//metodo dividir
    op.mostrarResultados(numero3,numero4);
    op.restar(numero3, numero4);
    System.out.println("la restada es "+ op.restar(numero3, numero4));
//metodo para dar resultados;
    }
}
