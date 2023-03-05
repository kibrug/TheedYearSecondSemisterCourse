module com.example.chatappdivkibruserver {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatappdivkibruserver to javafx.fxml;
    exports com.example.chatappdivkibruserver;
}