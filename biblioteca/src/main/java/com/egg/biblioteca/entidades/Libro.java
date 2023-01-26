
package com.egg.biblioteca.entidades;
import java.util.Date;
import javax.persistence.*;

// @author Pablo
@Entity
public class Libro {
    
    @Id
    private Long isbn;
    private String titulo;
    private Integer ejemplar;
    
    @Temporal(TemporalType.DATE)
    private Date alta;

    @ManyToOne
    private Autor autor;
    @ManyToOne
    private Editorial editorial;

    public Libro() {
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Integer ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    
}
