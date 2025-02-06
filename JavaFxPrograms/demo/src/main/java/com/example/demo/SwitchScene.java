package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SwitchScene extends Application{
    public void start(Stage stage)
    {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
            Scene scene = new Scene(root);
            stage.setTitle("Scene1");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
