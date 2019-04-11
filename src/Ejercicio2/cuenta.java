/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Estudiante
 */
public class cuenta {
 private int numero;
 private int clave;
 private String dueno;
 private double saldo;

    public cuenta(int numero, String dueno, int clave) {
        this.numero = numero;
        this.dueno = dueno;
        this.clave=clave;
    }
 public double consultarSaldo(){
 return this.saldo;
 }
 public void consignar (double valor) {
 if (valor>0)
 this.saldo=this.saldo + valor;    
 }
 public void retirar (double retiro) {
 if (retiro>0)
 this.saldo=this.saldo -retiro; 
 }
 public void cambiarClave (int nclave) {
 this.clave=nclave;    
 }
 public int consultarClave(){
 return this.clave;
 }
}
