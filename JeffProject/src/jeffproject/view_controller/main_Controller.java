/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeffproject.view_controller;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
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
import javafx.stage.Modality;
import javafx.stage.Stage;

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
            stage.initModality(Modality.WINDOW_MODAL);
                stage.initOwner(
                ((Node)event.getSource()).getScene().getWindow() );
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
