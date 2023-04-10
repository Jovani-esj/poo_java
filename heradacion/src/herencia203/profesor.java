package herencia203;
/**
 *
 * @author juang
 */
public class profesor extends persona{
    private String idProfesor;
    private String cedulaProfecional;
    public profesor (String c, String n, String fN){
       super (c,n,fN);
       this.idProfesor="no se pa";
       this.cedulaProfecional="no se pa";
       this.CURP="no se pa";
    }
    public String getIdProfesor() {
        return idProfesor;
    }
    public void setIdProfesor(String idP) {
        this.idProfesor = idP;
    }
    public String getCedulaProfesor() {
        return cedulaProfecional;
    }
    public void setCedulaProfesor(String ce) {
        this.cedulaProfecional = ce;
    }
}
