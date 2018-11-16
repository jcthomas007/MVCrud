/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeffproject.view_controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import jeffproject.model.part;
import jeffproject.model.product;

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
    private TableView<product> grdFindProduct;
    @FXML
    private TableColumn<?, ?> colFindPartID;
    @FXML
    private TableColumn<?, ?> colFindPartName;
    @FXML
    private TableColumn<?, ?> colFindInventoryLevel;
    @FXML
    private TableColumn<?, ?> colFindPricePerUnit;
    @FXML
    private TableView<product> grdEditProduct;
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
    
    private ObservableList<product> dataProductSearch=FXCollections.observableArrayList();
    private ObservableList<product> dataProductEdit=FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
//        dataProductSearch = grdEditProduct.getItems();
//        newPart part(1,2,3,4,5);
//        
//        ArrayList<Integer> parts = new ArrayList<>(newPart);
//        dataProductSearch.add(new product(parts,2,3,4,5,6,7));
//        
//        
////        product newProduct = product();
//        newProduct.setInStock(0);
//        newProduct.setMax(01);
//        newProduct.setMin(2);
//        newProduct.setName("test");
//        newProduct.setPrice(3);
//        newProduct.setProductID(04);
//        tblItems.add(newProduct);
    }

    @FXML
    private void handleSearch(ActionEvent event) {
//        String searchItem=txtSearch.getText();
//        boolean found=false;
//        
//        for (part p : dataPartSearch) {
//            if(Integer.toString(p.getPartID()).equels(searchItem) || p.getName().contains(searchItem)) {
//                system.out.println("This is part " + searchItem);
//                found=true;
//            }
// 
//        }
    }
    
//    public inHouse extends part {
//        void add(){
//            part.a
//        }
//    }
//    
//    public outSourced extends part {
//        void add(){
//            part.a
//        }
//    }
    
}
