package com.example.tryandcheckproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextArea text;
    @FXML
    private TextArea text1;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText(text.getText()+"two side "+text1.getText());
    }
}