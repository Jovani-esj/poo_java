package claseDos203;
/**
 *
 * @author jovas
 */
import java.util.Scanner;
public class main {
 
 public static void main(String[] args) {
 Scanner leer= new Scanner(System.in);
 String raza,nombre,color,propietario,peligrosidad;
 int edad;
 System.out.println("Dame la raza de tu mascota->");
 raza=leer.nextLine();
 System.out.println("Dame el nombre de tu mascota->");
 nombre=leer.nextLine();
 System.out.println("Dame el color de tu mascota->");
 color=leer.nextLine();
 System.out.println("Dame el nombre del propietario de la mascota->");
 propietario=leer.nextLine();
 System.out.println("Dame la edad de la mascota->");
 edad=leer.nextInt();
 leer.nextLine();
 canino mimascota = new canino();
 mimascota.descripcionMascota(raza, nombre, color, propietario, edad);
 System.out.println("valor de raza-->"+raza);
 peligrosidad=mimascota.peligrosidad(raza);
 System.out.println(peligrosidad);
 
 
 }
 
}
