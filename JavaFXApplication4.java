/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author nrafs
 */
public class JavaFXApplication4 extends Application {
    Stage window;
    Stage stage1, stage2;
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        Label label = new Label("welcome to scene 1");
        Button button1 = new Button("go to scene 2");
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label, button1);
        Scene scene1 = new Scene(layout1, 200, 200);
        Button button2 = new Button("go to back to scene 1");
        button2.setOnAction(e-> window.setScene(scene1));
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        Scene scene2 = new Scene(layout2, 600, 500);
        button1.setOnAction(e-> window.setScene(scene2));
        
        window.setScene(scene1);
        window.setTitle("me");
        window.show();
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
