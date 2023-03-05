module com.example.tryandcheckproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tryandcheckproject to javafx.fxml;
    exports com.example.tryandcheckproject;
}