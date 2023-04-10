
package persona;

/**
 *
 * @author jovas
 */
public class persona {/*clase*/
        /*atributos de la clase*/
        private int idPersona;
        private String nombrePersona;
        private String fechaNacimiento;
        private String genero;
        private String telefono;
        private String mail;
        
        /*metodo constructor igual que la clase se encarga de inicializar con algun valor los atributos*/
        public persona(int idP, String nP,String fn, String g, String t,String m){
            this.idPersona=idP;
            this.nombrePersona=nP;
            this.fechaNacimiento=fn;
            this.genero=g;
            this.telefono = t;
            this.mail=m;
        }
        public persona(){
        }

        public void setidPersona(int idP){
            this.idPersona=idP;
        }
        public void setnombrePersona(String nP){
            this.nombrePersona=nP;
        }
        public void setfechaNacimiento(String fn){
            this.fechaNacimiento=fn;
        }
        public void setgenero(String g){
            this.genero=g;
        }
        public void settelefono(String t){
            this.telefono=t;
        }
        public void setmail(String m){
            this.mail=m;
        }
        
        public int getidPersona(){
            return this.idPersona;/*regresame el valor dado en id persona*/
        }
        public String idpersona(){
            return "\n Id: "+ getidPersona();
        }
        public String getnombrePersona(){
            return "\n Nombre:"+this.nombrePersona;
        }
        public String getfechaNacimient(){
            return "\n Fecha de nacimiento: "+ this.fechaNacimiento;
        }
        public String getgenero(){
            return "\n Genero: " + this.genero;
        }
        public String gettelefono(){
            return "\n Telefono: "+this.telefono;
        }
        public String getmail(){return "\n Correo: "+this.mail;
        }
        
}
