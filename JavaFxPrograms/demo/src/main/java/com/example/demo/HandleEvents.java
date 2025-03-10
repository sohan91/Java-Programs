package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HandleEvents extends Application {

    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("handleEvents.fxml")));
        Scene scene = new Scene(root,700,500);
        stage.setTitle("EventHandling");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
launch(args);
    }
}
