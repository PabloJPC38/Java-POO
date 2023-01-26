
package com.eggNews.eggNews.entidades;

// @author Pablo

import com.eggNews.eggNews.enumeraciones.Rol;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Periodista extends Usuario {
    
   // @OneToMany(mappedBy ="periodista", cascade = CascadeType.ALL)
    ArrayList<Noticia> mis_noticias;
    Integer sueldo;        

    public ArrayList<Noticia> getMis_noticias() {
        return mis_noticias;
    }

    public void setMis_noticias(Noticia noticia) {
        this.mis_noticias.add(noticia);
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
            
    
    
    

   

    
    

}
