package claseDos203;
/**
 *
 * @author jovas
 */
public class canino {
 private String raza;
 private String nombre;
 private String color;
 private String propietario;
 private int edad;
 public void canino(String raza,String nombre,String color, String propietario, int edad){
 this.raza=raza;
 this.nombre=nombre;
 this.color=color;
 this.propietario=propietario;
 this.edad=edad;
 }
 public void descripcionMascota(String raza,String nombre, String color, String propietario, int edad){
 System.out.println("Raza de la mascota--> "+raza);
 System.out.println("Nombre de la mascota->"+nombre);
 System.out.println("Color de la mascota->"+color);
 System.out.println("Dueño de la mascota->"+propietario);
 System.out.println("Edad de la mascota->"+edad);
 }
 
 public String peligrosidad(String raza){
 if("Malinois".equals(raza) || "Bul Dog".equals(raza) || "Rod Wiler".equals(raza)){
 return "Raza Peligrosa";
 }else{
 return "Raza No Peligrosa";
 }
 
 }
 
}