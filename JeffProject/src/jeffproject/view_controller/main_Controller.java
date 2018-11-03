/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeffproject.view_controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    private TableView<?> grdPart;
    @FXML
    private TableColumn<?, ?> colPartID;
    @FXML
    private TableColumn<?, ?> colPartName;
    @FXML
    private TableColumn<?, ?> colPartInventoryLevel;
    @FXML
    private TableColumn<?, ?> colPartPrice;
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
    private TableColumn<?, ?> colProductID;
    @FXML
    private TableColumn<?, ?> colProductName;
    @FXML
    private TableColumn<?, ?> colProductInventoryLevel;
    @FXML
    private TableColumn<?, ?> colProductPrice;
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
        // TODO
    }    

    @FXML
    private void handleExit(ActionEvent event) {
    }

    @FXML
    private void handleSearch(ActionEvent event) {
    }

    @FXML
    private void handlePartDelete(ActionEvent event) {
    }

    @FXML
    private void handlePartModify(ActionEvent event) {
    }

    @FXML
    private void handleProductAdd(ActionEvent event) {
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
