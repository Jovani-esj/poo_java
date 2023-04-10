
package herencia203;

/**

 * @author jovani
 */
public class main {
    public static void main (String[]args){
    profesor marcial=new profesor ("MABM030766HMCRLC2", "Marcial Jesús", "03/07/1960");
    marcial.setIdProfesor("D09206111");
    marcial.setCedulaProfesor("12345");
    System.out.println("Id profesor:"+marcial.getIdProfesor());
    System.out.println("Cedula profesional:"+marcial.getCedulaProfesor());
    System.out.println("Nombtre profesor:"+marcial.getNombre());
    System.out.println("Curp profesor:"+marcial.getCURP());
    System.out.println("Fecha nacimiento profesor:"+marcial.getFechaNacimiento());
    }
}