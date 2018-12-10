/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeffproject.view_controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import jeffproject.model.inventory;
import jeffproject.model.part;
import jeffproject.model.product;
import static jeffproject.view_controller.main_Controller.openConfirm;

/**
 * FXML Controller class
 *
 * @author jeffreyt
 */
public class modifyProduct_Controller implements Initializable {

    @FXML
    private TextField txtSearch;
    @FXML
    private Button btnDelete;
    @FXML
    private Label label;
    @FXML
    private TableView<part> grdSearch;
    @FXML
    private TableColumn<part, Integer> colSearchPartID;
    @FXML
    private TableColumn<part, String> colSearchName;
    @FXML
    private TableColumn<part, Integer> colSearchInventory;
    @FXML
    private TableColumn<part, Double> colSearchPrice;
    @FXML
    private TableView<part> grdEdit;
    @FXML
    private TableColumn<part, Integer> colEditPartID;
    @FXML
    private TableColumn<part, String> colEditName;
    @FXML
    private TableColumn<part, Integer> colEditInventory;
    @FXML
    private TableColumn<part, Double> colEditPrice;
    @FXML
    private Button btnSave;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnSearch;
    @FXML
    private TextField txtMax;
    @FXML
    private TextField txtInv;
    @FXML
    private TextField txtPrice;
    @FXML
    private TextField txtMin;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtID;

    private static ObservableList<part> productParts = FXCollections.observableArrayList();
    private static ObservableList<part> allParts = FXCollections.observableArrayList();
    private product productEdit;
    private Integer productIndex;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productIndex = main_Controller.productId;
        productEdit = inventory.getProducts().get(productIndex);
        txtID.setText((Integer.toString(productEdit.getProductID().getValue())));
        txtName.setText(productEdit.getName().getValue());
        txtMax.setText((Integer.toString(productEdit.getMax().getValue())));
        txtInv.setText((Integer.toString(productEdit.getInStock().getValue())));
        txtPrice.setText((Double.toString(productEdit.getPrice().getValue())));
        txtMin.setText((Integer.toString(productEdit.getMin().getValue())));
        updateGrids();

    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (openConfirm("Do you want to exit without saving?") == true) {
            Stage stage = (Stage) btnCancel.getScene().getWindow();
            stage.close();
        }
    }

    @FXML
    private void handleDeleteAction(ActionEvent event) {
        part part = grdEdit.getSelectionModel().getSelectedItem();
        productParts.remove(part);
        updateGrids();
    }

    @FXML
    private void handleAdd(ActionEvent event) {
        part part = grdSearch.getSelectionModel().getSelectedItem();
        productParts.add(part);
        updateGrids();
    }

    @FXML
    private void handleSaveAction(ActionEvent event) {
        
        //        todo update per modifyPart_controller
        
        
        productEdit.setProductID(Integer.parseInt(txtID.getText()));
        productEdit.setName(txtName.getText());
        productEdit.setMin(Integer.parseInt(txtMin.getText()));
        productEdit.setPrice(Double.parseDouble(txtPrice.getText()));
        productEdit.setInStock(Integer.parseInt(txtInv.getText()));
        productEdit.setMax(Integer.parseInt(txtMax.getText()));

        inventory.updatePart(productIndex, productEdit);
        Stage stage = (Stage) btnSave.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void handleSearch(ActionEvent event
    ) {
        Integer iIndex = inventory.productLookup(txtSearch.getText());
        if (iIndex > -1) {
            grdSearch.requestFocus();
            grdSearch.getSelectionModel().select(iIndex);
            grdSearch.getFocusModel().focus(iIndex);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("No Product found");
            alert.showAndWait();
        }
    }

    private void updateGrids() {
        productParts = productEdit.getParts();
        colEditPartID.setCellValueFactory(cellData -> cellData.getValue().getPartId().asObject());
        colEditName.setCellValueFactory(cellData -> cellData.getValue().getName());
        colEditInventory.setCellValueFactory(cellData -> cellData.getValue().getInv().asObject());
        colEditPrice.setCellValueFactory(cellData -> cellData.getValue().getPrice().asObject());
        grdEdit.setItems(productParts);

        allParts = inventory.getParts();
        colSearchPartID.setCellValueFactory(cellData -> cellData.getValue().getPartId().asObject());
        colSearchName.setCellValueFactory(cellData -> cellData.getValue().getName());
        colSearchInventory.setCellValueFactory(cellData -> cellData.getValue().getInv().asObject());
        colSearchPrice.setCellValueFactory(cellData -> cellData.getValue().getPrice().asObject());
        grdSearch.setItems(allParts);
    }

}
