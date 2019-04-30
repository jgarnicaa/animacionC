/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_agregacion_composicion_CARRO;

/**
 *
 * @author ksequedam
 */
public class Rueda {
    private Motor eje;
    private String marca;
    private int diametro;

    public Rueda(String marca, int diametro) {
        this.marca = marca;
        this.diametro = diametro;
    }

    public Motor getEje() {
        return eje;
    }

    public void setEje(Motor eje) {
        this.eje = eje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Rueda{" + "eje=" + eje + ", marca=" + marca + ", diametro=" + diametro + '}';
    }
    
    
    
}
