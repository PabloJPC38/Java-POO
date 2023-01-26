/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod_Libro;

/**
 *
 * @author pablo
 */
public class Libro {
    
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int num_pag; 


    public Libro(){

    }

    public Libro(int ISBN, String Titulo, String Autor, int num_pag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.num_pag = num_pag;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNum_pag(int num_pag) {
        this.num_pag = num_pag;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNum_pag() {
        return num_pag;
    }
   
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", num_pag=" + num_pag + '}';
    }

    


}
