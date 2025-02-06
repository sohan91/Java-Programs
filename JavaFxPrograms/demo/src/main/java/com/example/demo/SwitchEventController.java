package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;
import java.util.SplittableRandom;

public class SwitchEventController {
    private Stage stage;
    private Parent root;
    private Scene scene;

    public void scene1(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene1 = new Scene(root, 500, 350);
            stage.setScene(scene1);
            stage.setTitle("Scene1");
            stage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void scene2(ActionEvent event)
    {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene2.fxml")));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root,500,350);
            stage.setScene(scene);
            stage.setTitle("Scene2");
            stage.show();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
