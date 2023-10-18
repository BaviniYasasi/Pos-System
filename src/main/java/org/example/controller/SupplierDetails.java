package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.example.db.DBConnection;
import org.example.model.SupplierDetail;
import org.example.model.tm.SupplierDetailTm;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SupplierDetails implements Initializable {
    public JFXTreeTableView<SupplierDetailTm> tblSupplier;

    @FXML
    private TreeTableColumn<?, ?> colSupplierId;

    @FXML
    private TreeTableColumn<?, ?> colSupplierName;

    @FXML
    private TreeTableColumn<?, ?> colSupplierContact;

    @FXML
    private TreeTableColumn<?, ?> colSupplierCompany;

    @FXML
    private TreeTableColumn<?, ?> colSupplierAddress;

    @FXML
    private TreeTableColumn<?, ?> colSupplierOption;


    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnPrint;

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private JFXTextField supplierId;

    @FXML
    private JFXTextField supplierName;

    @FXML
    private JFXTextField company;

    @FXML
    private JFXTextField contact;

    @FXML
    private JFXTextField search;

    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtEmail;


    @FXML
    void btnAddOnAction(ActionEvent event) {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "INSERT INTO Supplier VALUES(?,?,?,?,?,?)";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1,supplierId.getText());
            pstm.setString(2,supplierName.getText());
            pstm.setString(3,company.getText());
            pstm.setString(4,txtAddress.getText());
            pstm.setString(5,contact.getText());
            pstm.setString(6,txtEmail.getText());

            if(pstm.executeUpdate()>0){
                new Alert(Alert.AlertType.INFORMATION,"Supplier Added..!").show();
            }else{
                new Alert(Alert.AlertType.ERROR,"Added Failed..!").show();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnBackOnAction(ActionEvent event) {
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashBoard.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        window.show();
    }

    @FXML
    void btnClearOnAction(ActionEvent event) {
        clearFields();
    }
    public void clearFields(){
        supplierId.setText(null);
        supplierName.setText(null);
        company.setText(null);
        txtAddress.setText(null);
        contact.setText(null);
        txtEmail.setText(null);
    }

    @FXML
    void btnPrintOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "Update Supplier set sup_Name=?, company=?, address=?, contact=?, email=? where supplier_Id=?";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1,supplierName.getText());
            pstm.setString(2,company.getText());
            pstm.setString(3,txtAddress.getText());
            pstm.setString(4,contact.getText());
            pstm.setString(5,txtEmail.getText());
            pstm.setString(6,supplierId.getText());

            if(pstm.executeUpdate()>0){
                new Alert(Alert.AlertType.INFORMATION,"Supplier Added..!").show();
            }else{
                new Alert(Alert.AlertType.ERROR,"Added Failed..!").show();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colSupplierId.setCellValueFactory(new TreeItemPropertyValueFactory<>("id"));
        colSupplierName.setCellValueFactory(new TreeItemPropertyValueFactory<>("name"));
        colSupplierCompany.setCellValueFactory(new TreeItemPropertyValueFactory<>("company"));
        colSupplierAddress.setCellValueFactory(new TreeItemPropertyValueFactory<>("address"));
        colSupplierContact.setCellValueFactory(new TreeItemPropertyValueFactory<>("contact"));
        colSupplierOption.setCellValueFactory(new TreeItemPropertyValueFactory<>("option"));
        generateId();
        loadTable();
    }

    private void generateId() {
        Connection connection = null;
        try {
            connection = DBConnection.getInstance().getConnection();
            PreparedStatement ptsm = connection.prepareStatement("SELECT supplier_Id FROM Supplier order by supplier_Id DESC limit 1");
            ResultSet resultSet = ptsm.executeQuery();
            if (resultSet.next()) {
                int num = Integer.parseInt(resultSet.getString(1).split("[P]")[1]);
                num++;
                supplierId.setText(String.format("SP%04d", num));
            } else {
                supplierId.setText("SP0001");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void loadTable(){
        ObservableList<SupplierDetailTm> tmList = FXCollections.observableArrayList();
        try {
            List<SupplierDetail> list = new ArrayList<>();
            Connection connection = DBConnection.getInstance().getConnection();

        PreparedStatement pstm = connection.prepareStatement("SELECT * FROM Supplier");
        ResultSet resultSet = pstm.executeQuery();

        while(resultSet.next()){
            list.add(new SupplierDetail(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6)

            ));
        }

        for (SupplierDetail supplierDetail:list){
            JFXButton btn = new JFXButton("DELETE");
            btn.setBackground(Background.fill(Color.rgb(255,255,255)));
            tmList.add(new SupplierDetailTm(
                    supplierDetail.getSupplierID(),
                    supplierDetail.getSupName(),
                    supplierDetail.getContact(),
                    supplierDetail.getCompany(),
                    supplierDetail.getEmail(),
                    supplierDetail.getAddress(),
                    btn
            ));

            }

            TreeItem<SupplierDetailTm> treeItem = new RecursiveTreeItem<>(tmList, RecursiveTreeObject::getChildren);
            tblSupplier.setRoot(treeItem);
            tblSupplier.setShowRoot(false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
