package com.example.tryandcheckproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ServerViewControler {

    @FXML
    private Label serverText;


    @FXML
    private TextArea text1;

    @FXML
    protected void onSrverButtonClick() {

        serverText.setText(text1.getText());
    }
}
