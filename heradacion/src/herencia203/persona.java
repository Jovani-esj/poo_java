
package herencia203;

/**
 *
 * @author juang
 */
public class persona {
    String CURP;
    private String Nombre;
    private String fechaNacimiento;
    public persona(String c, String n, String fN){
       this.CURP=c;
       this.fechaNacimiento=fN;
       this.Nombre=n;
}

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
