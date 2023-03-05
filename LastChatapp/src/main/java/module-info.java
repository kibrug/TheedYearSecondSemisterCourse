module com.example.lastchatapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lastchatapp to javafx.fxml;
    exports com.example.lastchatapp;
}