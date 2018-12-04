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
import javafx.stage.Stage;
import jeffproject.model.inventory;
import jeffproject.model.part;
import static jeffproject.view_controller.main_Controller.*;

/**
 * FXML Controller class
 *
 * @author jeffreyt
 */
public class modifyPart_Controller implements Initializable {

    @FXML
    private Button btnCancel;
    @FXML
    private Label label;
    @FXML
    private Button btnSave;
    @FXML
    private RadioButton rdoInHouse;
    @FXML
    private ToggleGroup radioButtons;
    @FXML
    private RadioButton rdoOutsourced;
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

    private part partEdit;
    private Integer partIndex;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        partIndex = main_Controller.partId;
        partEdit = inventory.getParts().get(partIndex);
        //rdoInHouse = parts(partId).;
        //rdoOutsourced;
        txtID.setText((Integer.toString(partEdit.getPartId().getValue())));
        txtName.setText(partEdit.getName().getValue());
        txtMin.setText(Integer.toString(partEdit.getMin().getValue()));
        txtCompanyName.setText(partEdit.getCompany().getValue());
        txtPrice.setText(Double.toString(partEdit.getPrice().getValue()));
        txtInv.setText(Integer.toString(partEdit.getInv().getValue()));
        txtMax.setText(Integer.toString(partEdit.getMax().getValue()));
    }

    @FXML
    private void handleCancel(ActionEvent event) {
        if (openConfirm("Do you want to exit without saving?") == true) {
            Stage stage = (Stage) btnCancel.getScene().getWindow();
            stage.close();
        }
    }

    @FXML
    private void handleSave(ActionEvent event) {
        partEdit.setPartId(Integer.parseInt(txtID.getText()));
        partEdit.setName(txtName.getText());
        partEdit.setMin(Integer.parseInt(txtMin.getText()));
        partEdit.setCompany(txtCompanyName.getText());
        partEdit.setPrice(Double.parseDouble(txtPrice.getText()));
        partEdit.setInv(Integer.parseInt(txtInv.getText()));
        partEdit.setMax(Integer.parseInt(txtMax.getText()));
        inventory.updatePart(partIndex, partEdit);
        Stage stage = (Stage) btnSave.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void handleInHouse(ActionEvent event) {
    }

    @FXML
    private void handleOutsourced(ActionEvent event) {
    }

}
