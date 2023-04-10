
package persona;

/**
 *
 * @author jovas
 */
public class main {
    public static void main(String[] args) { /*psvm tab para agregar esto*/
        persona ASLA = new persona(1,"Alejo Santiago Luis Angel","31 feb 2002","H","7485938454","asla@gmail.com");
        persona AIM = new persona(2,"Andres Uribe Itzel Monserrath","26 mar 2002","M","654357456","asla@gmail.com");
        persona BMM = new persona(3,"Basurto Mateo Marlene","02 abr 2002","M","84568454","asla@gmail.com");
        persona JPB = new persona(4,"Jesus perez Becerril","04 sep 2005","H","5464543456","juan@gmail.com");
        persona ALSA = new persona(5,"Luis Angel Alejo Santiago ","31 feb 2002","H","7485938454","asla@gmail.com");
        persona MIUA = new persona(6,"Itzel Monserrath Andres Uribe ","16 feb 2002","M","654357456","asla@gmail.com");
        persona MMB = new persona(7,"Mateo Marlene Basurto ","25 jun 2002","M","84568454","asla@gmail.com");
        persona PBJ = new persona(8,"Perez Becerril Jesus ","15 ago 2005","H","5464543456","juan@gmail.com");
        System.out.println(ASLA.idpersona()+ASLA.getnombrePersona()+ASLA.getfechaNacimient()+ASLA.getgenero()+ASLA.gettelefono()+ASLA.getmail());
        System.out.println(AIM.idpersona()+AIM.getnombrePersona()+AIM.getfechaNacimient()+AIM.getgenero()+AIM.gettelefono()+AIM.getmail());
        System.out.println(BMM.idpersona()+BMM.getnombrePersona()+BMM.getfechaNacimient()+BMM.getgenero()+BMM.gettelefono()+BMM.getmail());
        System.out.println(JPB.idpersona()+JPB.getnombrePersona()+JPB.getfechaNacimient()+JPB.getgenero()+JPB.gettelefono()+JPB.getmail());
        System.out.println(MMB.idpersona()+MMB.getnombrePersona()+MMB.getfechaNacimient()+MMB.getgenero()+MMB.gettelefono()+MMB.getmail());
        System.out.println(ALSA.idpersona()+ALSA.getnombrePersona()+ALSA.getfechaNacimient()+ALSA.getgenero()+ALSA.gettelefono()+ALSA.getmail());
        System.out.println(MIUA.idpersona()+MIUA.getnombrePersona()+MIUA.getfechaNacimient()+MIUA.getgenero()+MIUA.gettelefono()+MIUA.getmail());
        System.out.println(PBJ.idpersona()+PBJ.getnombrePersona()+PBJ.getfechaNacimient()+PBJ.getgenero()+PBJ.gettelefono()+PBJ.getmail());
        
        persona p1 = new persona();
        
        p1.setidPersona(54);
        p1.setnombrePersona("juan garduno melquiades");
        System.out.println("\n \n \n El id es:" +p1.idpersona());
        System.out.println("El nombre de la persona es"+p1.getnombrePersona());
        p1.setfechaNacimiento("25 feb 2003");
        System.out.println("La fecha de nacimiento es "+p1.getfechaNacimient());
        p1.setgenero("H");
        System.out.println("El genero de la persona es "+ p1.getgenero());
        p1.settelefono("6542845325");
        System.out.println("El numero de telefono es : "+p1.gettelefono());
        p1.setmail("juan@gmail.com");
        System.out.println("El mail de la persona es : "+ p1.getmail());
        
        persona p2 = new persona();
        p2.setidPersona(965656);
        p2.setnombrePersona("Natanael cano ");
        System.out.println("\n \n \n El id es:" +p2.idpersona());
        System.out.println("El nombre de la persona es"+p2.getnombrePersona());
        p2.setfechaNacimiento("45 nov 2058");
        System.out.println("La fecha de nacimiento es "+p2.getfechaNacimient());
        p2.setgenero("H");
        System.out.println("El genero de la persona es "+ p2.getgenero());
        p2.settelefono("00545488771");
        System.out.println("El numero de telefono es : "+p2.gettelefono());
        p2.setmail("natanael@gmail.com");
        System.out.println("El mail de la persona es : "+ p2.getmail());
        
     
        
        
        
        
        
        
        
        
    }
    

}
