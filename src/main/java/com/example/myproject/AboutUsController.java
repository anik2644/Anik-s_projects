package com.example.myproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AboutUsController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextArea textarea;

    @FXML
    private Label l;

    @FXML
    void backButtonPresed(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("startingwindow.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    void MouseEntered(MouseEvent event) {
       // System.out.println("i am");
       // l.setVisible(true);

    }

}
