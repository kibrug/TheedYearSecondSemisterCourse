module com.example.chatappdivkibruclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatappdivkibruclient to javafx.fxml;
    exports com.example.chatappdivkibruclient;
}