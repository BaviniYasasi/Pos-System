package org.example.controller;

import com.jfoenix.controls.JFXButton;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class DashBoardForm implements Initializable {

    @FXML
    private Label employers;

    @FXML
    private Label items;

    @FXML
    private Label orders;

    @FXML
    private Label suppliers;

    @FXML
    private Label orderDetails;

    @FXML
    private Label salesReturn;

    @FXML
    private Label salesReports;

    @FXML
    private JFXButton btnLogOut;

    @FXML
    private Label lblTime;

    @FXML
    private Label lblDate;

    @FXML
    private ImageView imageOrders;
    @FXML
    private ImageView imageSuppliers;

    @FXML
    private ImageView imageSalesReturn;

    @FXML
    private ImageView imageSalesReports;

    @FXML
    private ImageView imageOrderDetails;

    @FXML
    private ImageView imageItem;

    @FXML
    private ImageView imageEmployers;


    @FXML
    void lblOrdersOnAction(MouseEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Orders.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();

    }

    @FXML
    void imageOrdersOnAction(MouseEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Orders.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();
    }

    @FXML
    void itemsOnAction(MouseEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ItemDetails.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();
    }

    @FXML
    void imageItemOnAction(MouseEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ItemDetails.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();
    }

    @FXML
    void logOutONAction(ActionEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/LoginForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();
    }

    @FXML
    void orderDetailsOnAction(MouseEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/OrderDetails.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();
    }

    @FXML
    void salesReportsOnAction(MouseEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SalesReports.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();
    }

    @FXML
    void salesReturnOnAction(MouseEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SalesReturn.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();
    }

    @FXML
    void suppliersOnAction(MouseEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SupplierDetails.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();
    }


    @FXML
    void ImageEmployersOnAction(MouseEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/EmployerDetails.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();
    }

    @FXML
    void employersOnAction(MouseEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/EmployerDetails.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();
    }



    @FXML
    void imageOrderDetailsOnAction(MouseEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/OrderDetails.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();

    }



    @FXML
    void imageSalesReportsOnAction(MouseEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SalesReports.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();

    }

    @FXML
    void imageSalesReturnOnAction(MouseEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SalesReturn.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();

    }

    @FXML
    void imageSuppliersOnAction(MouseEvent event) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SupplierDetails.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        manageTimeAndDate();
    }

    private void manageTimeAndDate(){
        Timeline date = new Timeline((new KeyFrame(
                Duration.ZERO,
                actionEvent -> lblDate.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")))
        )), new KeyFrame(Duration.seconds(1)));
        date.setCycleCount(Animation.INDEFINITE);
        date.play();

        Timeline time = new Timeline(new KeyFrame(
                Duration.ZERO,
                actionEvent -> lblTime.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")))
        ), new KeyFrame(Duration.seconds(1)));

        time.setCycleCount(Animation.INDEFINITE);
        time.play();
    }




}
