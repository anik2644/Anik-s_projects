package com.example.myproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceiptController {

    /*@FXML
    void BackButtonPressed(ActionEvent event) {

    }
*/

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void BackButtonPressed(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("CashierDashboard.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}