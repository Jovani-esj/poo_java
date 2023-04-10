
package paquete1;

public class clase2 {
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();
//        objeto1.edad=10;
        
        objeto1.setEdad(10);
        System.out.println("la edad es"+ objeto1.getEdad());
        
        objeto1.setNombre("Gran jovani");//establece el nombre
        System.out.println("el nombre es: "+ objeto1.getNombre());//muestra el nombre
        
        
        String cachalote=objeto1.asignacion("chanchito feliz");
        
        System.out.println("el nombre es de "+cachalote);
    }
}
