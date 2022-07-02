package com.example.agro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PotatoesController {
    @FXML
    private TextField NumOfPotatoes;
    @FXML
    private Text SalaryOfPotatoes;
    @FXML
    private Button SubmitPotatoes;
    private int numOfPotatoes;


    public String culcPotatoes(int numOfPotatoes) {
        return String.valueOf(numOfPotatoes * 15.7 * 8000);
    }

    public void submitPotatoes(ActionEvent event) {
        try {
            numOfPotatoes = Integer.parseInt(NumOfPotatoes.getText());
            SalaryOfPotatoes.setText(culcPotatoes(numOfPotatoes));
        } catch (Exception e){
            SalaryOfPotatoes.setText("error");
        }
    }
}
