package ClasesyObjetos;
import java.util.Scanner;

public class Operacion {
    //atributos=caracteristicas
    int numero1;
    int numero2;//variables globales
    int suma;
    int resta;
    int multiplicacion;
    int division;
    Scanner sc = new Scanner(System.in);
    
    //metodos=acciones
    
    //metodo para pedir datos al usuario 2 numeros
    public void leerNumeros(){
        System.out.println("Ingresa el valor1");
        numero1 = sc.nextInt();
        System.out.println("Ingresa el valor2: ");
        numero2 = sc.nextInt();
    }
    //metodo para sumar
    public void sumar(int numero3,int numero4){
        suma = numero3+numero4; //variables locales
    }
    //metodo para resta
    public int restar(int numero3,int numero2){
       return resta= numero3-numero2;
//
    }
    //metodo para multiplicar
    public void multiplicar(){
        multiplicacion = numero1*numero2;
    }
    //metodo para dividir
    public void dividir(){
        division=numero1/numero2;
    }
    public void mostrarResultados(int numero3,int numero2){
        System.out.println("la suma es "+ suma);
        System.out.println("la resta es "+ resta);
        System.out.println("la multiplicacion es "+ multiplicacion);
        System.out.println("la division es "+ division);
    }
}
