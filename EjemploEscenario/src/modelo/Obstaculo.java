/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Profesor
 */
public class Obstaculo extends Objeto{

    private boolean activo;
    
    public Obstaculo(int x, int y) {
        super(x, y);
        this.activo = true;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }
    

    @Override
    public void mover() {
        
    }
    
}
