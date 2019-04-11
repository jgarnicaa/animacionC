/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Estudiante
*/

public class Perro {
    private String nombre;
    private int edad;
    private String color;
    private float peso;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }

    public float getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
 
public Perro (String nombre){
this.nombre=nombre;
}
public Perro (String nombre, int edad){
this.nombre=nombre;
this.edad=edad;
}

}
