package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextBoundsType;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.FocusListener;
import java.io.File;
import java.util.Collection;
import java.util.Scanner;

public class BasicDrawingJavaFx extends Application {
    public void start(Stage stage)
    {
        Group root = new Group();
        Scene scene = new Scene(root,800,500, Color.LIGHTBLUE);
        Text text = new Text();
        text.setText("Hello Drawing World!!!");
        text.setX(20);
        text.setUnderline(true);
        text.setY(50);
        text.setFill(Color.RED);
        text.setFont(Font.font("Time of New Roman",30));

        Text text1 = new Text();
        System.out.println("\n");
        text1.setText("Different Drawings");
        text1.setUnderline(true);
        text1.setX(30);
        text1.setY(180);
        text1.setFill(Color.GREEN);
        text1.setFont(Font.font("Time of New Roman",30));

        root.getChildren().add(text);
        root.getChildren().add(text1);

        //Line
        Text text2 = new Text();
        text2.setX(50);
        text2.setY(220);
        text2.setText("Line");
        text2.setUnderline(true);
        text2.setFill(Color.GRAY);
        text2.setFont(Font.font("Time of New Roman",30));
        root.getChildren().add(text2);
         Line line = new Line();
        line.setStartX(250);
        line.setStartY(250);
        line.setEndY(400);
        line.setEndX(400);
        line.setFill(Color.BLACK);
        line.setStrokeWidth(3);
       line.setRotate(135);
        root.getChildren().add(line);

        //Rectange

        Text text3 = new Text();
        text3.setText("Rectangle");
        text3.setUnderline(true);
        text3.setX(50);
        text3.setY(440);
        text3.setFill(Color.BLACK);
        text3.setFont(Font.font("Tims of New Roman",30));
        root.getChildren().add(text3);
        Rectangle rectangle = new Rectangle();
        rectangle.setX(30);
        rectangle.setY(480);
        rectangle.setHeight(200);
        rectangle.setWidth(350);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.GREEN);
        root.getChildren().add(rectangle);


        Text text4 = new Text();
        text4.setText("Polygon -> Triangle");
        text4.setX(50);
        text4.setY(750);
        text4.setFont(Font.font("Times of New Roman",30));
        text4.setUnderline(true);
        text4.setFill(Color.BLACK);
        root.getChildren().add(text4);
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(
                1000.0, 1000.0,  // First point (x, y)
                1050.0, 1200.0,  // Second point (x, y)
                750.0, 1200.0 );
        triangle.setFill(Color.BLACK);
        root.getChildren().add(triangle);

        Circle circle = new Circle();
        circle.setCenterX(520);
        circle.setCenterY(570);
        circle.setRadius(100);
        circle.setFill(Color.GREEN);
        circle.setStrokeWidth(4);
        circle.setStroke(Color.BLACK);
        root.getChildren().add(circle);
        stage.setTitle("Drawing");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
