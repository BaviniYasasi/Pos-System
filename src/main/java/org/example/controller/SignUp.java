package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUp {
    @FXML
    private JFXButton btnSignUp;

    @FXML
    private JFXTextField txtUserPassword;

    @FXML
    private JFXTextField txtConfirmPassword;

    @FXML
    private JFXTextField txtUserEmail;

    @FXML
    private JFXTextField txtUserId;

    @FXML
    void btnSignUpOnAction(ActionEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashBoard.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();
    }

}
