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
public class modifyProduct_Controller implements Initializable {

    @FXML
    private TextField txtSearch;
    @FXML
    private Button btnDelete;
    @FXML
    private Label label;
    @FXML
    private TableView<?> grdSearch;
    @FXML
    private TableColumn<?, ?> colSearchPartID;
    @FXML
    private TableColumn<?, ?> colSearchName;
    @FXML
    private TableColumn<?, ?> colSearchInventory;
    @FXML
    private TableColumn<?, ?> colSearchPrice;
    @FXML
    private TableView<?> grdEdit;
    @FXML
    private TableColumn<?, ?> colEditPartID;
    @FXML
    private TableColumn<?, ?> colEditName;
    @FXML
    private TableColumn<?, ?> colEditInventory;
    @FXML
    private TableColumn<?, ?> colEditPrice;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }

    @FXML
    private void handleAdd(ActionEvent event) {
    }

    @FXML
    private void handleSearch(ActionEvent event) {
    }
    
}
