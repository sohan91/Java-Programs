package com.example.cssusingfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Shadow;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class HelloController {
    @FXML
    private Button buttonFour;
@FXML
    private Label label;
@FXML
private GridPane gridPane;
  public void initialize()
  {
       buttonFour.setEffect(new DropShadow());
  }
  public void onMouseEntered()
  {
      label.setScaleX(2.0);
      label.setScaleY(2.0);
  }
  public void onMouseExit()
  {
      label.setScaleX(1.0);
      label.setScaleY(1.0);
  }
  public void fileChooser()
  {
      FileChooser chooser = new FileChooser();
     chooser.setTitle("Chosse the Application File");
     chooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text","*.txt"),
      new FileChooser.ExtensionFilter("PDF","*.pdf"),
             new FileChooser.ExtensionFilter("AllFiles","*.*"));

     List<File> file = chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());
     for(int i = 0;i<file.size();i++) {
         if (file != null) {
             System.out.println(file.get(i));
         } else {
             System.out.println("Chooser was Cancelled");
         }
     }
  }
  public void onClickLink()
  {

      try
      {
          Desktop.getDesktop().browse(new URI("https://www.geeksforgeeks.org/introduction-to-jdbc/"));
      }catch(IOException | URISyntaxException e)
      {
          System.out.println(e.getMessage());
      }
  }
}