package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SalesReturn {

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXTextField orderIdSearch;

    @FXML
    private JFXTextField qty;

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private Label total;

    @FXML
    private JFXButton btnPlaceOrder;

    @FXML
    void btnBackOnAction(ActionEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashBoard.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();

    }

}
