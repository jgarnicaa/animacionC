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
public class main {
    public static void main(String []args){
    Rueda[] frente=new Rueda[2];
    Rueda[] atras=new Rueda[2];
    
    frente [0]=new Rueda("G",20);
    frente [1]=new Rueda("G",20);
    atras [0]= new Rueda("S",20);
    atras[1]=new Rueda ("S",20);
    
    Carro carro=new Carro("Tapita", 10000, "Mazeratti");
    carro.setFrente(frente);
    carro.setAtras(atras);
        
    System.out.println (carro); //esta linea muestra codigos en memoria
    //ahora para ver la informacion completa insertamos toString en todas las clases
    
    
    }

    @Override
    public String toString() {
        return "main{" + '}';
    }
}
