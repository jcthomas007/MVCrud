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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author jeffreyt
 */
public class addPart_Controller implements Initializable {

    @FXML
    private Button btnCancel;
    @FXML
    private Label label;
    @FXML
    private Button btnSave;
    @FXML
    private RadioButton rbtnInHouse;
    @FXML
    private ToggleGroup RadioButtons;
    @FXML
    private RadioButton rbtnOutsourced;
    @FXML
    private TextField txtID;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtMin;
    @FXML
    private TextField txtCompanyName;
    @FXML
    private TextField txtPrice;
    @FXML
    private TextField txtInv;
    @FXML
    private TextField txtMax;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cancelHandler(ActionEvent event) {
    }

    @FXML
    private void saveHandler(ActionEvent event) {
    }

    @FXML
    private void inHouseHandler(ActionEvent event) {
    }

    @FXML
    private void outsourcedHandler(ActionEvent event) {
    }
    
}
