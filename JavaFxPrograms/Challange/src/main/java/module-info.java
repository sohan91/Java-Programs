module com.example.challange {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.challenge to javafx.fxml;
    exports com.example.challenge;
}