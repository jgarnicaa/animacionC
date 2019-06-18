/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploescenario;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class EjemploEscenario extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      Pane panel = new Pane();
      Canvas tablero = new Canvas(1024, 512);
      panel.getChildren().add(tablero);
      Scene escena = new Scene(panel, 1024, 512,Color.WHITESMOKE);
      GraphicsContext lapiz = 
              tablero.getGraphicsContext2D();
            
      Animacion animacion = new Animacion(lapiz);
      animacion.start();
      
      
      primaryStage.setScene(escena);
      primaryStage.setTitle("Escenario Inte");
      primaryStage.show();
      
      
    }
    
}
