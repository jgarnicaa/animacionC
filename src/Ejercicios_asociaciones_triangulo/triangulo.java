/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_asociaciones_triangulo;

/**
 *
 * @author usuario
 */
public class triangulo {
    private vertices v1;
    private vertices v2;
    private vertices v3;
    private color linea;
    private color fondo;

    public triangulo(vertices v1, vertices v2, vertices v3, color linea, color fondo) {
        this.v1 = v1;
        this.v3 = v3;
        this.v2 = v2;
        this.linea = linea;
        this.fondo = fondo;
    }
 
   public double calcularArea(){    
  double L1= Math.sqrt(((v2.getX()-v1.getX())^2)+((v2.getY()-v1.getY())^2));
   double L2= Math.sqrt(((v3.getX()-v2.getX())^2)+((v3.getY()-v2.getY())^2));
  double L3=Math.sqrt(((v1.getX()-v3.getX())^2)+((v1.getY()-v3.getY())^2));
   double sp = (L1+L2+L3)/2;
 double area = Math.sqrt(sp*(sp-L1)*(sp-L2)*(sp-L3));
 return area;
          
   }
    
}

