package com.example.tryandcheckproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class CleintControler {

    @FXML
    private Label cleintText;


    @FXML
    private TextArea text2;

    @FXML
    protected void onCleintButtonClick() {

        cleintText.setText(text2.getText());
    }
}
