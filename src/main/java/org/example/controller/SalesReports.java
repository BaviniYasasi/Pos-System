package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class SalesReports {

    @FXML
    private JFXButton btnDailyReport;

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnMonthlyReport;

    @FXML
    private JFXButton btnAnnualReport;

    @FXML
    private JFXButton btnDailyReturns;

    @FXML
    private JFXTextField day;

    @FXML
    private ImageView dropDownDay;

    @FXML
    private JFXTextField profit;

    @FXML
    private JFXTextField salesCount;

    @FXML
    private JFXTextField sales;

    @FXML
    private JFXButton btnSalesReport;

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
