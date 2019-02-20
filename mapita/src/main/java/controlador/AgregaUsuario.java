/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import mapitaModelo.Usuario;
import mapitaModelo.UsuarioDAO; 

/**
 *
 * @author alex22
 */

@ManagedBean  
public class AgregaUsuario {
 
    private String nombre;
    private String contrasenia;
    private String correo;
    private Date fechanacimiento;

    public String getNombre() {
        return nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public Date getFecha() {
        return fechanacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFecha(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    
    public void agregaUsuario(){
        Usuario u = new Usuario();
        u.setNombre(nombre);
        u.setCorreo(correo);
        u.setContrasenia(contrasenia);
        u.setFecha(fechanacimiento);
        UsuarioDAO udb = new UsuarioDAO();
        udb.save(u);
        }
    }

