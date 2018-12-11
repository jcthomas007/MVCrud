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
public class addProduct_Controller implements Initializable {

    @FXML
    private TextField txtSearch;
    @FXML
    private Button txtDelete;
    @FXML
    private Label label;
    @FXML
    private TableView<part> grdFindProduct;
    @FXML
    private TableColumn<part, Integer> colFindPartID;
    @FXML
    private TableColumn<part, String> colFindPartName;
    @FXML
    private TableColumn<part, Integer> colFindInventoryLevel;
    @FXML
    private TableColumn<part, Double> colFindPricePerUnit;
    @FXML
    private TableView<part> grdFindProduct1;
    @FXML
    private TableColumn<part, Integer> colFindPartID1;
    @FXML
    private TableColumn<part, String> colFindPartName1;
    @FXML
    private TableColumn<part, Integer> colFindInventoryLevel1;
    @FXML
    private TableColumn<part, Double> colFindPricePerUnit1;
    @FXML
    private Button txtSave;
    @FXML
    private Button txtCancel;
    @FXML
    private Button btnAdd;
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

    private static ObservableList<part> partStock = FXCollections.observableArrayList();
    private int productID;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colFindPartID.setCellValueFactory(cellData -> cellData.getValue().getPartId().asObject());
        colFindPartName.setCellValueFactory(cellData -> cellData.getValue().getName());
        colFindPricePerUnit.setCellValueFactory(cellData -> cellData.getValue().getPrice().asObject());
        colFindInventoryLevel.setCellValueFactory(cellData -> cellData.getValue().getInv().asObject());
        grdFindProduct.setItems(inventory.getParts());
    }

    @FXML
    private void handleAdd(ActionEvent event) {
        part part = grdFindProduct.getSelectionModel().getSelectedItem();
        partStock.add(part);
        updateProductPart();
    }

    @FXML
    private void handleDelete(ActionEvent event) {
        if (openConfirm("Do you want to remove this part?") == true) {
            part part = grdFindProduct1.getSelectionModel().getSelectedItem();
            partStock.remove(part);
            updateProductPart();
        }
    }

    @FXML
    private void handleSave(ActionEvent event) {
        String max = txtMax.getText();
        String inv = txtInv.getText();
        String price = txtPrice.getText();
        String min = txtMin.getText();
        String name = txtName.getText();
        String id = txtID.getText();
        
        //validate new product
        String message = inventory.isProductValid(name, price, inv, min, max, partStock);
        if (message.length() == 0) {
            product newProd = new product();
            newProd.setMax(Integer.parseInt(max));
            newProd.setInStock(Integer.parseInt(inv));
            newProd.setPrice(Double.parseDouble(price));
            newProd.setMin(Integer.parseInt(min));
            newProd.setName(name);
            newProd.setProductID(Integer.parseInt(id));
            newProd.setParts(partStock);
            inventory.productAdd(newProd);

            Stage stage = (Stage) txtSave.getScene().getWindow();
            stage.close();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setContentText(message);
            alert.showAndWait();     
        }
    }

    @FXML
    private void handleCancel(ActionEvent event
    ) {
        if (openConfirm("Do you want to exit without saving?") == true) {
            Stage stage = (Stage) txtSave.getScene().getWindow();
            stage.close();
        }
    }

    @FXML
    private void handleSearch(ActionEvent event
    ) {
        Integer iIndex = inventory.productLookup(txtSearch.getText());
        if (iIndex > -1) {
            grdFindProduct.requestFocus();
            grdFindProduct.getSelectionModel().select(iIndex);
            grdFindProduct.getFocusModel().focus(iIndex);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("No Product found");
            alert.showAndWait();
        }
    }

private void updateProductPart() {
        colFindPartID1.setCellValueFactory(cellData -> cellData.getValue().getPartId().asObject());
        colFindPartName1.setCellValueFactory(cellData -> cellData.getValue().getName());
        colFindPricePerUnit1.setCellValueFactory(cellData -> cellData.getValue().getPrice().asObject());
        colFindInventoryLevel1.setCellValueFactory(cellData -> cellData.getValue().getInv().asObject());
        if (partStock.size() > 0) {
            grdFindProduct1.setItems(partStock);
        }
    }

}
