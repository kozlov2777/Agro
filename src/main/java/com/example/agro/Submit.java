package com.example.agro;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Submit {

    public void submit(Button submit, Text salary, Text cleanerSalary, TextField NumOfGa, double zbor, double price, double expenses){
        submit.setOnAction(event -> {
            int numOfGa = Integer.parseInt(NumOfGa.getText());
            CulcCleaner cleaner = new CulcCleaner(numOfGa, zbor,price,expenses);
            salary.setText(String.valueOf(cleaner.getCulcValue()));
            cleanerSalary.setText(String.valueOf(cleaner.culcCleaner(numOfGa, expenses)));
        });

    }


}
