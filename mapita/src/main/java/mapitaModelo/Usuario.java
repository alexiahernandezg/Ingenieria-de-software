package mapitaModelo;
// Generated 8/02/2019 04:58:59 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idusuario;
     private String nombre;
     private String correo;
     private String contrasenia;
     private Date fechanacimiento;
     private Set marcadors = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int idusuario, String nombre, String correo, String contrasenia, Date fechanacimiento) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.fechanacimiento = fechanacimiento;
    }
    public Usuario(int idusuario, String nombre, String correo, String contrasenia, Date fechanacimiento, Set marcadors) {
       this.idusuario = idusuario;
       this.nombre = nombre;
       this.correo = correo;
       this.contrasenia = contrasenia;
       this.fechanacimiento = fechanacimiento;
       this.marcadors = marcadors;
    }
   
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public Date getFechanacimiento() {
        return this.fechanacimiento;
    }
    
    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    public Set getMarcadors() {
        return this.marcadors;
    }
    
    public void setMarcadors(Set marcadors) {
        this.marcadors = marcadors;
    }
    public void setFecha(Date fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }





}


