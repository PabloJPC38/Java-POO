package com.egg.noticias.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;


@Entity
public class Noticia {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String titulo;
    private String cuerpo;
    private String foto;

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    @Transient
    public String getRutaArchivo() {
        if (foto == null || id == null) return null;
//        System.out.println("C:/Users/nicoc/Documents/NetBeansProjects/noticias/fotos/" + foto);
        return "/fotos/" + foto;
    }
    
    
    
    
}
