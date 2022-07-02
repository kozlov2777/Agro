package com.example.agro;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SetWindow {
    public void setWindow(String name, Button button){
        button.setOnAction(event -> {
            button.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(name));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage  = new Stage();
            stage.setTitle(name);
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }
}
