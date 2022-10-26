package com.example.parcialpractico;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Stage stage;
    private Scene scene;
   // private Parent root;
    @Override
    public void start(Stage viewStage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation((getClass().getResource("client.fxml")));
            Scene scene = new Scene(fxmlLoader.load());
            viewStage.setScene(scene);
            viewStage.setResizable(false);
            com.example.parcialparctico.controller.ClientViewController controller = fxmlLoader.getController();
            controller.setStage(viewStage);

            viewStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}