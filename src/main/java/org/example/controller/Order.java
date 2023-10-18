package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Order {

    @FXML
    private JFXTextField lblDate;

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnPlaceOrder;

    @FXML
    private Label total;

    @FXML
    private Label ttlDiscount;

    @FXML
    private Label balance;

    @FXML
    private Label cash;

    @FXML
    private JFXDatePicker date;

    @FXML
    private JFXCheckBox paymentCash;

    @FXML
    private JFXCheckBox paymentCard;

    @FXML
    private JFXTextField employerId;

    @FXML
    private JFXButton btnAddToCart;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXButton btnRemoveOrder;

    @FXML
    private JFXTextField orderId;

    @FXML
    private JFXTextField EmployerName;

    @FXML
    private JFXTextField customerContact;

    @FXML
    private JFXTextField customerEmail;

    @FXML
    private JFXTextField customerName;

    @FXML
    private JFXTextField itemCode;

    @FXML
    private JFXTextField description;

    @FXML
    private JFXTextField qty;

    @FXML
    private JFXTextField qtyOnHand;

    @FXML
    private JFXTextField sellingPrice;

    @FXML
    private JFXTextField profit;

    @FXML
    private JFXTextField type;

    @FXML
    private JFXTextField size;

    @FXML
    private JFXTextField discount;


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
