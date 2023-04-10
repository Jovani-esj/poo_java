package clasesyobjetos;

public class coche {
    //modificador de acceso class nombre de la clase
    
    //atributos
    String color;
    String marca;
    int km;
    
    //metodos
    public static void main(String[] args) {
        //objetos de la clase coche
        coche coche1= new coche();
        //nombreClase nombreObjeto = new clase();
        
        coche1.color="Blanco";
        coche1.marca="Bugatti";
        coche1.km=0;
        System.out.println("El color del coche 1 es : "+coche1.color);
        System.out.println("La marc del coche 1 es: "+coche1.marca);
        System.out.println("El kilometraje es:"+coche1.km);
    }
}
