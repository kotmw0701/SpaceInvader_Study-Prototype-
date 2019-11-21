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
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Main.fxml")));
        scene.getRoot().requestFocus();
        stage.setTitle("Invader");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
