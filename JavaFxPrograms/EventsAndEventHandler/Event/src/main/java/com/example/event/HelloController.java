package com.example.event;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
   private TextField textField;
    @FXML
    private Button Hello;
    @FXML
    private Button Bye;
    @FXML
    private CheckBox checkBox;
    @FXML
    private Label doLabel;
    @FXML
    public void initialize()
    {
        Hello.setDisable(true);
        Bye.setDisable(true);
    }
@FXML
   public void OnClickButton(ActionEvent event)
   {
      if(event.getSource().equals(Hello))
      {
          System.out.println("Hello, "+textField.getText());
      }
      if(event.getSource().equals(Bye))
      {
          System.out.println("Bye, "+textField.getText());
      }

       Runnable task = new Runnable() {
           @Override
           public void run() {
               try {
                   String s = Platform.isFxApplicationThread()?"UI Thread":"BackGround Thread";
                   System.out.println("I am going to Sleep on "+s);
                   Thread.sleep(10000);
                   Platform.runLater(new Runnable() {
                       @Override
                       public void run() {
                           String s = Platform.isFxApplicationThread()?"UI Thread":"BackGround Thread";
                           System.out.println("I am Updating the label on the  "+s);
                           doLabel.setText("We did Some thing");
                       }
                   });

               } catch (InterruptedException ignored) {

               }
           }
       };
       new Thread(task).start();
       if(checkBox.isSelected())
       {
           textField.clear();
           Hello.setDisable(true);
           Bye.setDisable(true);
       }
   }
   @FXML
   public void keyReleased()
 {

       String text = textField.getText();
       boolean disableButton = text.isEmpty() || text.trim().isEmpty();
       Hello.setDisable(disableButton);
       Bye.setDisable(disableButton);
   }
   @FXML
    public void clearText()
   {
       System.out.println("The checkBox is "+(checkBox.isSelected() ? "checked": "unchecked"));
   }
}