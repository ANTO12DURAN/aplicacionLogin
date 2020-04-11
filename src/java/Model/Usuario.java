/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author antonieta
 */
public class Usuario {
     private String cuenta;   
     private String  nombre;    
     private String  clave;    
     private String  mail;      
    
public Usuario(String cuenta, String nombre, String clave, String mail){       
     this.cuenta = cuenta;
     this.nombre = nombre;     
     this.clave = clave;        
     this.mail = mail; 
     }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
     
}
