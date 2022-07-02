package com.example.agro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class SunflowerController implements Initializable {
    @FXML
    private TextField NumOfSunflower;
    @FXML
    private Text SalaryOfSunflower;
    @FXML
    private Button SubmitSunflower;
    @FXML
    private Button back;
    @FXML
    private Text CleanerSalaryOfSunflower;

    private int numOfSunflower;

    // 1 га подсолнуха
    // Дисковка         8л        40 мин
    // Вспашка          22л       120 мин
    // Боронование      3л        20 мин
    // Две культивации  8+8=16л   80 мин
    // Посев            3 л       20 мин
    // Боронироввание   3 л       20 мин
    // 2 междурядки     4+4=8 л   40 мин
    // Гербицид         2 л       15 мин
    // Семена       350 грн
    // Уборка       400 грн       10 л топдива
    // Гербицид     350 грн
    // Аренда       1000 грн  + 100 грн налог
    // Амортизация  480 грн
    // Трудоемкость  6 часов *30 средняя зп = 180 грн
    // урожай +- 15 ц * цена подсолнуха +- 7,4 = +-11 100 грн
    // затрати 350 + 400

//    public String culcSunflowerCleaner(int numOfSunflower){
//        return String.valueOf((numOfSunflower *1.5*11100)- numOfSunflower*(350+400+350+1000+10+480+180+(8+22+3+16+3+3+8+2+10)*55));                       //55 цена 1 л соляры
//    }

    public void submitSunflower(ActionEvent event) {
        try {
            numOfSunflower = Integer.parseInt(NumOfSunflower.getText());
            Culc culcSunflower = new Culc();
            CulcCleaner cleaner = new CulcCleaner();
            SalaryOfSunflower.setText(cleaner.culc(numOfSunflower, 1.5, 11100.0));
            CleanerSalaryOfSunflower.setText(cleaner.culcCleaner(numOfSunflower, 1.5, 11100.0));
        } catch (Exception e){
            SalaryOfSunflower.setText("error");
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Back backing = new Back();
        backing.setBack(back);

    }
}

