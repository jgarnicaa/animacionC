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
public class Motor {
    private Rueda[]eje;
    private String marca;
    private double potencia;

    public Motor(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }


    
    public Rueda[] getEje() {
        return eje;
    }

    public void setEje(Rueda[] eje) {
        this.eje = eje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor{" + "eje=" + eje + ", marca=" + marca + ", potencia=" + potencia + '}';
    }

  
    
    
}
