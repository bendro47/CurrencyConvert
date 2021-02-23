/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f2c;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;;

/**
 *
 * @author barni
 */
public class F2C extends Application {
    
    @Override
    public void start(Stage stage)throws Exception {
        
        Parent root= 
                FXMLLoader.load(getClass().getResource("F2C.fxml"));
         Scene scene = new Scene(root); // attach scene graph to scene
      stage.setTitle("Temp Converter"); // displayed in window's title bar
      stage.setScene(scene); // attach scene to stage
      stage.show(); // display the stage
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}



