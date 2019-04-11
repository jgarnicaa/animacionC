/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class main {
     public static void main (String arg[]){
         Scanner nclave=new Scanner(System.in);
     cuenta Magdalena =new cuenta(1012, "Magdalena Sanchez", 1234);
     cuenta Joselito =new cuenta(1013,"Joselito Perez",9876);
     System.out.println(Magdalena.consultarSaldo());
     Magdalena.consignar(100000.0);
     System.out.println(Magdalena.consultarSaldo());
      System.out.println(Joselito.consultarSaldo());
     
      Joselito.consignar(500000.0);
      System.out.println( Joselito.consultarSaldo());
    System.out.println( "Ingrese la nueva clave: ");
     int nc=nclave.nextInt();
     Joselito.cambiarClave(nc);
     System.out.println(Joselito.consultarClave());
    
     }   
}
