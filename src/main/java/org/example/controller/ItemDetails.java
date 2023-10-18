package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.example.db.DBConnection;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ItemDetails implements Initializable {

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXTextField supplierId;

    @FXML
    private ImageView supplierDropDown;

    @FXML
    private JFXTextField supplierName;

    @FXML
    private JFXTextField description;

    @FXML
    private JFXTextField sellingPrice;

    @FXML
    private JFXTextField profit;

    @FXML
    private JFXTextField type;

    @FXML
    private JFXTextField size;

    @FXML
    private JFXButton btnPrint;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXTextField search;

    @FXML
    private JFXTextField qty;

    @FXML
    private JFXTextField addQty;

    @FXML
    private JFXTextField buyingPrice;

    @FXML
    private JFXButton btnAdd;

    @FXML
    private ImageView typeDropDown;

    @FXML
    private ImageView sizeDropDown;

    @FXML
    private JFXTextField type1;

    @FXML
    private JFXTextField size1;

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
    @FXML
    void btnAddOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnPrintOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        loadTable();
    }


}
