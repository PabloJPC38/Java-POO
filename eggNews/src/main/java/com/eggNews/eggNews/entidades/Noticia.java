
package com.eggNews.eggNews.entidades;

// @author Pablo



import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;


@Entity
public class Noticia {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String Id;
    private String titulo;
    private String cuerpo;
    @Lob @Basic(fetch = FetchType.LAZY)
    private byte[] foto;
    @OneToOne
    private Periodista creador;

    public Noticia() {
    }

    public String getId() {
        return Id;
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

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    

    public Periodista getCreador() {
        return creador;
    }

    public void setCreador(Periodista creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Noticia{" + "Id=" + Id + ", titulo=" + titulo + ", cuerpo=" + cuerpo + ", foto=" + foto + ", creador=" + creador + '}';
    }

    

    
    
    
    
}


