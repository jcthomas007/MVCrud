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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import jeffproject.model.inventory;
import jeffproject.model.part;
import jeffproject.model.partInHouse;
import jeffproject.model.partOutSourced;
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
    private boolean bOutsourced = false;

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
        
        String partId = txtID.getText();
        String name = txtName.getText();
        String min = txtMin.getText();
        String company = txtCompanyName.getText();
        String price = txtPrice.getText();
        String inv = txtInv.getText();
        String max = txtMax.getText();

        //validate edited part
        String message = inventory.isPartValid(name, price, inv, min, max, company);
        if (message.length() == 0) {
            if (bOutsourced == false) {
//                partOutSourced newPart = new partOutSourced();
                partEdit.setPartId(Integer.parseInt(partId));
                partEdit.setName(name);
                partEdit.setMax(Integer.parseInt(max));
                partEdit.setMin(Integer.parseInt(min));
                partEdit.setInv(Integer.parseInt(inv));
                partEdit.setPrice(Double.parseDouble(price));
                partEdit.setCompany(company);
                inventory.updatePart(partIndex, partEdit);
            } else {
//                partEdit newPart = new partInHouse();
                partEdit.setPartId(Integer.parseInt(partId));
                partEdit.setName(name);
                partEdit.setMax(Integer.parseInt(max));
                partEdit.setMin(Integer.parseInt(min));
                partEdit.setInv(Integer.parseInt(inv));
                partEdit.setPrice(Double.parseDouble(price));
                partEdit.setCompany(company);
                inventory.updatePart(partIndex, partEdit);
            }
            Stage stage = (Stage) btnSave.getScene().getWindow();
            stage.close();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setContentText(message);
            alert.showAndWait();
        }
    }

    @FXML
    private void handleInHouse(ActionEvent event) {
        bOutsourced = false;
        rdoOutsourced.setSelected(false);
    }

    @FXML
    private void handleOutsourced(ActionEvent event) {
        bOutsourced = false;
        rdoOutsourced.setSelected(false);
    }

}
