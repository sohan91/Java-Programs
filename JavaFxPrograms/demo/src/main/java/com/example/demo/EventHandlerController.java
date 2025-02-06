package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;


public class EventHandlerController {
    @FXML
    public Circle circle;
    int x;
    int y;
    @FXML
    private void top(ActionEvent event) {
        circle.setCenterY(y-=10);
        System.out.println("TOP Clicked...");
    }

    @FXML
    private void left(ActionEvent event) {
        circle.setCenterX(x-=10);
        System.out.println("LEFT Clicked...");
    }

    @FXML
    private void down(ActionEvent event) {
        circle.setCenterY(y+=10);
        System.out.println("DOWN Clicked...");
    }

    @FXML
    private void right(ActionEvent event) {
        circle.setCenterX(x+=10);
        System.out.println("RIGHT CLicked...");
    }
}
