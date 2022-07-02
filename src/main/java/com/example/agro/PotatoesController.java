package com.example.agro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class PotatoesController implements Initializable {
    @FXML
    private TextField NumOfPotatoes;
    @FXML
    private Text SalaryOfPotatoes;
    @FXML
    private Text CleanerSalaryOfPotatoes;
    @FXML
    private Button SubmitPotatoes;
    @FXML
    private Button back;
    private int numOfPotatoes;


//    public String culcPotatoes(int numOfPotatoes) {
//        return String.valueOf(numOfPotatoes * 15.7 * 8000);
//    }
//
//    public void submitPotatoes(ActionEvent event) {
//        try {
//            numOfPotatoes = Integer.parseInt(NumOfPotatoes.getText());
//            SalaryOfPotatoes.setText(culcPotatoes(numOfPotatoes));
//        } catch (Exception e){
//            SalaryOfPotatoes.setText("error");
//        }
//    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Back backing = new Back();
        backing.setBack(back);
        Submit submit = new Submit();
        submit.submit(SubmitPotatoes, SalaryOfPotatoes, CleanerSalaryOfPotatoes, NumOfPotatoes);
    }
}
