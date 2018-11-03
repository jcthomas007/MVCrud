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
public class addProduct_Controller implements Initializable {

    @FXML
    private TextField txtSearch;
    @FXML
    private Button txtDelete;
    @FXML
    private Label label;
    @FXML
    private TableView<?> grdFindProduct;
    @FXML
    private TableColumn<?, ?> colFindPartID;
    @FXML
    private TableColumn<?, ?> colFindPartName;
    @FXML
    private TableColumn<?, ?> colFindInventoryLevel;
    @FXML
    private TableColumn<?, ?> colFindPricePerUnit;
    @FXML
    private TableView<?> grdEditPart;
    @FXML
    private TableColumn<?, ?> colEditPartID;
    @FXML
    private TableColumn<?, ?> colEditPartName;
    @FXML
    private TableColumn<?, ?> colEditInventoryLevel;
    @FXML
    private TableColumn<?, ?> colEditPricePerUnit;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleDelete(ActionEvent event) {
    }

    @FXML
    private void handleSave(ActionEvent event) {
    }

    @FXML
    private void handleCancel(ActionEvent event) {
    }

    @FXML
    private void handleAdd(ActionEvent event) {
    }

    @FXML
    private void handleSearch(ActionEvent event) {
    }
    
}
