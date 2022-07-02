package com.example.agro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class WheatController implements Initializable {
    @FXML
    private TextField NumOfWheat;
    @FXML
    private Text SalaryOfWheat;
    @FXML
    private Button SubmitWheat;
    @FXML
    private Text CleanerSalaryOfWheat;
    @FXML
    private Button back;

    private int numOfWheat;

    // Дисковка 450 гр
    // Посев 350 грн
    // Подкормка 300 грн
    // Опрыскивание 250
    // Уборка урожая 1000 грн
    // Найм техники + ДТ 2350 грн
    // Семена 750 грн
    // Химия для опрыскивания 550 грн
    // Удобрения 1300  130кг селитры
    // Налог 140
    // Урожай 3.3 т
    // Цена 3100
    //
    //
    //
    public void submitWheat(ActionEvent event){
        try {
            numOfWheat = Integer.parseInt(NumOfWheat.getText());
            Culc culcWheat = new Culc();
            SalaryOfWheat.setText(culcWheat.culc(numOfWheat, 3.3, 3100));
            CulcCleaner cleaner = new CulcCleaner();
            CleanerSalaryOfWheat.setText(cleaner.culcCleaner(numOfWheat,3.3,3100));
        } catch (Exception e){
            SalaryOfWheat.setText("error");
        }

    }
//    public String culcWheatCleaner(int numOfWheat){
//        return String.valueOf((numOfWheat * 3.3 * 3100)-numOfWheat*(450+350+300+250+1000+2350+750+550+1300+140));
//    }


//    public String culcWheat(int numOfWheat){
//        return String.valueOf(numOfWheat * 3.3 * 3100);
//    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Back backing = new Back();
        backing.setBack(back);
    }
}
