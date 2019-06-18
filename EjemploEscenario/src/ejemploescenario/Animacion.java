/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploescenario;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;
import modelo.Carro;
import modelo.Obstaculo;

/**
 *
 * @author Estudiante
 */
public class Animacion extends AnimationTimer{
    private Carro carro;
    private ArrayList<Obstaculo> obstaculos;
    private int nivelVida;  
    private GraphicsContext lapiz;
    private Image fondo = null;
    private Image ufo = null;
    private int secuencia = 0; //Debe ir en objeto, solo ejemplo
    private double cambio=0.0;
    private Image gato=null;
    
    public Animacion(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.carro = new Carro(0, 100);
        this.nivelVida = 3;
        this.fondo = 
            new Image("imagenes/fondo.png");
        this.gato=new Image("imagenes/cats.gif");
        this.obstaculos = new ArrayList<>();
        
        Obstaculo o1 = new Obstaculo(20, 100);
        Obstaculo o2 = new Obstaculo(80, 100);
        Obstaculo o3 = new Obstaculo(150, 100);
        obstaculos.add(o1);
        obstaculos.add(o2);
        obstaculos.add(o3);
    }
    
    @Override
    public void handle(long l) {
        
        lapiz.clearRect(0, 0, 1024, 512);
        

        lapiz.drawImage(fondo, (-carro.getX()), 0);
        lapiz.drawImage(fondo, (-carro.getX())+1024, 0);
        
        this.ufo = 
                new Image("imagenes/ufo_" + this.secuencia + ".png");
        
        
        lapiz.setFill(Color.RED);
        
        //Carro
        
        lapiz.drawImage(this.ufo,this.carro.getX(), this.carro.getY());
        if(this.secuencia==5) secuencia = 0;
        else secuencia++;
        
        this.carro.mover();
        Shape carro = 
                new Rectangle(this.carro.getX(), this.carro.getY(), 30, 30);
        
      lapiz.drawImage(gato,(132*(this.secuencia)),0,132,80,400,380,132,80);
      
        //Dibujando obstaculos
        for (Obstaculo obstaculo : obstaculos) {
           this.lapiz.fillOval(obstaculo.getX(), obstaculo.getY(), 30, 30);  
        }
       
        //Revisnado colisiones
        for (Obstaculo obstaculo : obstaculos) {
           Shape _obstaculo = 
                   new Rectangle(obstaculo.getX(), obstaculo.getY(), 30, 30);
        
            Shape intercepcion = 
                    SVGPath.intersect(carro, _obstaculo);
            if(obstaculo.isActivo() && intercepcion.getLayoutBounds().getWidth()!=-1){
                this.nivelVida--; 
                obstaculo.setActivo(false);
            }
            
            //Parando la ejec                                  ucion
           // if(this.nivelVida ==0)
               // stop();
        }

        //Dibujando nivel de vida
        this.lapiz.strokeRect(50, 50, 100, 30);
        this.lapiz.fillRect(50, 50, this.nivelVida*33, 30);
    }
    
}
