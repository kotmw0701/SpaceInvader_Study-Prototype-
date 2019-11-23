/*
  @Author kotmw0701
 */
package com.kotmw.invader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Main.fxml")), 1120, 630);
        scene.getRoot().requestFocus();
        stage.setTitle("Invader");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
