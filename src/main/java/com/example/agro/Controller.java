package com.example.agro;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button windowWheat;
    @FXML
    private Button windowSunflower;
    @FXML
    private Button windowPotatoes;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setWindowWheat();
        setWindowSunflower();
        setWindowPotatoes();

    }

    public void setWindowWheat() {
        SetWindow window = new SetWindow();
        window.setWindow("Wheat.fxml", windowWheat);
//        windowWheat.setOnAction(event -> {
//            windowWheat.getScene().getWindow().hide();
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(getClass().getResource("Wheat.fxml"));
//            try {
//                loader.load();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            Parent root = loader.getRoot();
//            Stage stage  = new Stage();
//            stage.setTitle("Wheat");
//            stage.setScene(new Scene(root));
//            stage.showAndWait();
//        });
    }

    public void setWindowSunflower() {
        SetWindow window = new SetWindow();
        window.setWindow("Sunflower.fxml", windowSunflower);
//        windowSunflower.setOnAction(event -> {
//            windowSunflower.getScene().getWindow().hide();
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(getClass().getResource("Sunflower.fxml"));
//            try {
//                loader.load();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            Parent root = loader.getRoot();
//            Stage stage  = new Stage();
//            stage.setTitle("Sunflower");
//            stage.setScene(new Scene(root));
//            stage.showAndWait();
//        });
    }

    public void setWindowPotatoes() {
        SetWindow window = new SetWindow();
        window.setWindow("Potatoes.fxml", windowPotatoes);
//        windowPotatoes.setOnAction(event -> {
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(getClass().getResource("Potatoes.fxml"));
//            try {
//                loader.load();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            Parent root = loader.getRoot();
//            Stage stage  = new Stage();
//            stage.setTitle("Potatoes");
//            stage.setScene(new Scene(root));
//            stage.showAndWait();
//        });
//    }
    }
}