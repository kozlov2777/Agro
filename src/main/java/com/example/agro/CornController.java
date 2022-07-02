package com.example.agro;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class CornController implements Initializable {
    @FXML
    private TextField NumOfCorn;
    @FXML
    private Text SalaryOfCorn;
    @FXML
    private Text CleanerSalaryOfCorn;
    @FXML
    private Button SubmitCorn;
    @FXML
    private Button back;
    private double zbor = 3.0;
    private double price = 6100.0;
    private  double expenses = 3370.0+4600.0+44.5*55;

// Дисковка           6л          250
// Пахота             21л         450
//Бороновка           1.5л        80 грн
//Культивация         6л          200 грн
//Посев               3л          220 грн
// доставкка удоб.                70 грн
// междурядка         3л          150 грн
// Гербицидная обр.   2л          200 грн
// Подкормка          2л          200 грн
// Уборка                         1100 грн
//Транспорт зерн                  450 грн
//                    44,5*цена дт            3370
// Посевной материал 2200
// удобрения         1050
// Гербицид          1000
// Подкормка         350
//                   4600
//
//
//
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
        submit.submit(SubmitCorn, SalaryOfCorn, CleanerSalaryOfCorn, NumOfCorn, zbor, price, expenses);
    }
}
