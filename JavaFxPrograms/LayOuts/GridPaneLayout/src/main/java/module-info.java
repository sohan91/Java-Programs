module com.example.gridpanelayout {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.gridpanelayout to javafx.fxml;
    exports com.example.gridpanelayout;
}