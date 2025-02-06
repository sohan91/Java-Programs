package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.util.Locale;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(root, 800, 500, Color.BLACK);
        Image icon = new Image("C:\\Users\\Sohan\\OneDrive\\Pictures\\Black-Screen-Wallpaper-6.jpg");
        stage.getIcons().add(icon);
        stage.setX(150);
        stage.setY(150);
        stage.setResizable(true);
        stage.setFullScreen(true);
        stage.setTitle("JavaFx Application");
        stage.setFullScreenExitHint("Press E to Exit form the Window".toLowerCase(Locale.ROOT));
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("E"));
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}