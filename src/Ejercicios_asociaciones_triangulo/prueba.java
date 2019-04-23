/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_asociaciones_triangulo;
import java.util.*;
/**
 *
 * @author usuario
 */
public class prueba {
    public static void main(String[]arg){
    color f = new color(10,10,30);
    color c = new color(20,20,10);
    vertices v1 = new vertices(10,10);
    vertices v2= new vertices (20,30);
    vertices v3 = new vertices (0, 5);
    
    triangulo t= new triangulo(v1,v2,v3,c,f);
    double area=t.calcularArea();
    System.out.println(area);
    
        
    }
    
}
