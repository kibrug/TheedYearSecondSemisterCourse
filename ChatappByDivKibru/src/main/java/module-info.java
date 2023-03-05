module com.example.chatappbydivkibru {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatappbydivkibru to javafx.fxml;
    exports com.example.chatappbydivkibru;
}