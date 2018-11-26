/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeffproject.view_controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import jeffproject.model.inventory;
import jeffproject.model.part;
import jeffproject.model.product;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author jeffreyt
 */
public class main_Controller implements Initializable {

    @FXML
    private Button btnExit;
    @FXML
    private Label label;
    @FXML
    private Button btnPartSearch;
    @FXML
    private TextField txtPartSearch;
    @FXML
    private TableView<part> grdPart;
    @FXML
    private TableColumn<part, Integer> colPartID;
    @FXML
    private TableColumn<part, String> colPartName;
    @FXML
    private TableColumn<part, Integer> colPartInventoryLevel;
    @FXML
    private TableColumn<part, Double> colPartPrice;
    @FXML
    private Button btnPartDelete;
    @FXML
    private Button btnPartModify;
    @FXML
    private Button btnPartAdd;
    @FXML
    private Button btnProductSearch;
    @FXML
    private TextField txtProductSearch;
    @FXML
    private TableView<?> grdProduct;
    @FXML
    private TableColumn<product, Integer> colProductID;
    @FXML
    private TableColumn<product, String> colProductName;
    @FXML
    private TableColumn<product, Integer> colProductInventoryLevel;
    @FXML
    private TableColumn<product, Integer> colProductPrice;
    @FXML
    private Button btnProductDelete;
    @FXML
    private Button btnProductModify;
    @FXML
    private Button btnProductAdd;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colPartID.setCellValueFactory(cellData -> cellData.getValue().getPartId().asObject());
        colPartName.setCellValueFactory(cellData -> cellData.getValue().getName());
        colPartPrice.setCellValueFactory(cellData -> cellData.getValue().getPrice().asObject());
        colPartID.setCellValueFactory(cellData -> cellData.getValue().getPartId().asObject());
        colPartInventoryLevel.setCellValueFactory(cellData -> cellData.getValue().getInv().asObject());
        grdPart.setItems(inventory.getParts());
    }    

    @FXML
    private void handleExit(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION, "", ButtonType.YES, ButtonType.NO);
        alert.setTitle("Confirm");
        alert.setContentText("Do you want to exit?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.YES){
            System.exit(1);
        }
    }

    @FXML
    private void handleSearch(ActionEvent event) {
    }

    @FXML
    private void handlePartAdd(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addPart.fxml"));
            Parent root = (Parent) fxmlLoader.load();            
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }
    
    @FXML
    private void handlePartDelete(ActionEvent event) {
    }

    @FXML
    private void handlePartModify(ActionEvent event) {
    }

    @FXML
    private void handleProductAdd(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addProduct.fxml"));
            Parent root = (Parent) fxmlLoader.load();            
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }

    @FXML
    private void handleProductSearch(ActionEvent event) {
    }

    @FXML
    private void handleProductDelete(ActionEvent event) {
    }

    @FXML
    private void handleProductModify(ActionEvent event) {
    }
    
}
