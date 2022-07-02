package com.example.agro;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;



public class Back {

    public void setBack(Button back){
        back.setOnAction(event -> {
                    back.getScene().getWindow().hide();
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("hello-view.fxml"));
                    try {
                        loader.load();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Parent root = loader.getRoot();
                    Stage stage = new Stage();
                    stage.setTitle("Agro");
                    stage.setScene(new Scene(root));
                    stage.showAndWait();
                }


        );}
}
