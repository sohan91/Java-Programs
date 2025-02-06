module com.example.cssusingfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.web;


    opens com.example.cssusingfx to javafx.fxml;
    exports com.example.cssusingfx;
}