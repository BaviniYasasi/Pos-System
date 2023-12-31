package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployerDetails {

    @FXML
    private JFXDatePicker dob;

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXTextField empName;

    @FXML
    private ImageView nameDropDown;

    @FXML
    private JFXTextField name;

    @FXML
    private JFXTextField nic;

    @FXML
    private JFXTextField branch;

    @FXML
    private JFXButton btnPrint;

    @FXML
    private JFXButton btnSave;

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXTextField search;

    @FXML
    private JFXTextField empId;

    @FXML
    private JFXTextField address;

    @FXML
    private JFXTextField contact;

    @FXML
    private JFXTextField bankAccountNo;

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
