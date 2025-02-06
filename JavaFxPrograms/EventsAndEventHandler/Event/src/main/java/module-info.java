module com.example.event {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.event to javafx.fxml;
    exports com.example.event;
}