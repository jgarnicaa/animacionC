/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
DESCRIPCION

CARRO AGEGADO A 4 LLANTAS, 2 DELANTES, 2 TRASERASN Y COMPUESTO POR UN MOTOR; además con asociacion bidireccional entre motor y rueda
 */
package Ejercicio_agregacion_composicion_CARRO;

import java.util.Arrays;

/**
 *
 * @author ksequedam
 */
public class Carro {
 
 private Motor m;
 private Rueda[]frente;
 private Rueda[]atras;
 private String marca;


 
Carro(String marcaM, double potenciaM, String marcaC){
   Motor motor=new Motor (marcaM, potenciaM); //variable motor como objeto es una varible local y se remplaza por m para poder guardar
   m=motor;
   this.marca=marcaC;
}

    public Rueda[] getFrente() {
        return frente;
    }

    public void setFrente(Rueda[] frente) {
        this.frente = frente;
    }

    public Rueda[] getAtras() {
        return atras;
    }

    public void setAtras(Rueda[] atras) {
        this.atras = atras;
        //relacion bidireccional, rueda con motor
        for (int i=0;i<atras.length;i++){
        this.atras[i].setEje(this.m);
        }
        //motor con rueda
        this.m.setEje(atras);
}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" + "m=" + m + ", frente=" + Arrays.toString(frente) + ", atras=" + Arrays.toString(atras) + ", marca=" + marca + '}';
    }

   


    
}
