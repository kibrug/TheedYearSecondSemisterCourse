module com.example.chatbymy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatbymy to javafx.fxml;
    exports com.example.chatbymy;
}