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
import jeffproject.model.partInHouse;
import jeffproject.model.partOutSourced;
import jeffproject.model.inventory;
import static jeffproject.view_controller.main_Controller.openConfirm;

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
    private Label lblCompanyName;
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

    private boolean bOutsourced = false;

    @FXML
    private void cancelHandler(ActionEvent event) {
        if (openConfirm("Do you want to exit without saving?") == true) {
            Stage stage = (Stage) btnCancel.getScene().getWindow();
            stage.close();
        }
    }

    @FXML
    private void saveHandler(ActionEvent event) {
        String partId = txtID.getText();
        String name = txtName.getText();
        String min = txtMin.getText();
        String company = txtCompanyName.getText();
        String price = txtPrice.getText();
        String inv = txtInv.getText();
        String max = txtMax.getText();

        //validate new part
        String message = inventory.isPartValid(name, price, inv, min, max, company, bOutsourced);
        if (message.length() == 0) {
            if (bOutsourced == false) {
                partOutSourced newPart = new partOutSourced();
                newPart.setPartId(Integer.parseInt(partId));
                newPart.setName(name);
                newPart.setMax(Integer.parseInt(max));
                newPart.setMin(Integer.parseInt(min));
                newPart.setInv(Integer.parseInt(inv));
                newPart.setPrice(Double.parseDouble(price));
                newPart.setCompany(company);
                inventory.partAdd(newPart);
            } else {
                partInHouse newPart = new partInHouse();
                newPart.setPartId(Integer.parseInt(partId));
                newPart.setName(name);
                newPart.setMax(Integer.parseInt(max));
                newPart.setMin(Integer.parseInt(min));
                newPart.setInv(Integer.parseInt(inv));
                newPart.setPrice(Double.parseDouble(price));
                newPart.setMachineId(Integer.parseInt(company));
                inventory.partAdd(newPart);
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
    private void inhouseHandler(ActionEvent event) {
        bOutsourced = false;
        rbtnOutsourced.setSelected(false);
        rbtnInHouse.setSelected(true);
        lblCompanyName.setText("Machine ID");
        txtCompanyName.setText("");
    }

    @FXML
    private void outsourceHandler(ActionEvent event) {
        bOutsourced = true;
        rbtnOutsourced.setSelected(true);
        rbtnInHouse.setSelected(false);
        lblCompanyName.setText("Company Name");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtID.setText(Integer.toString(inventory.newPartId()));
    }
}
