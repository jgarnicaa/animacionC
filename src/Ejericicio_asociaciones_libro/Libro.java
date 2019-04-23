/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejericicio_asociaciones_libro;

/**
 *
 * @author usuario
 */
public class Libro {
  private String titulo;
  private int npag;
  private int cal;
  private Autor nombre;
  private Autor apellido;

    public Libro(String titulo, int npag, int cal, Autor nombre, Autor apellido) {
        this.titulo = titulo;
        this.npag = npag;
        this.cal = cal;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNpag() {
        return npag;
    }

    public void setNpag(int npag) {
        this.npag = npag;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public Autor getNombre() {
        return nombre;
    }

    public void setNombre(Autor nombre) {
        this.nombre = nombre;
    }

    public Autor getApellido() {
        return apellido;
    }

    public void setApellido(Autor apellido) {
        this.apellido = apellido;
    }
 
  
 
}
