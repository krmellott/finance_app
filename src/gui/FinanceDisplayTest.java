/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Kyle Mellott
 */
public class FinanceDisplayTest extends Application{
    @Override
    public void start(Stage primaryStage){
        FinanceDisplay fd = new FinanceDisplay();
        fd.setPadding(new Insets(10));
        Scene scene = new Scene(fd);
        primaryStage.setTitle("Finance Display Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
        
}

    public static void main(String[] args) {
        launch(args);
    }
}
