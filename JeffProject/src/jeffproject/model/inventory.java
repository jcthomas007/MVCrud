/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeffproject.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

/**
 *
 * @author jeffreyt
 */
public class inventory {

    private static ObservableList<part> partStock = FXCollections.observableArrayList();
    private static ObservableList<product> productStock = FXCollections.observableArrayList();

    //part
    public static ObservableList<part> getParts() {
        return partStock;
    }

    public static void partAdd(part part) {
        partStock.add(part);
    }

    public static void deletePart(part part) {
        partStock.remove(part);
    }

    public static void updatePart(int partId, part part) {
        partStock.set(partId, part);
    }

    public int partCount() {
        return partStock.size() + 1;
    }

    // todo search part
    // product
    public static ObservableList<product> getProducts() {
        return productStock;
    }

    public static void productAdd(product product) {
        productStock.add(product);
    }

    public static void deleteProduct(product product) {
        productStock.remove(product);
    }

    public static void updatePart(int productId, product product) {
        productStock.set(productId, product);
    }

    public int productCount() {
        return productStock.size() + 1;
    }

    // search  
    public static Integer partLookup(String sValue) {
        for (int x = 0; x < partStock.size(); x++) {
            if (sValue.equals(partStock.get(x).getName().getValue())) {
                return x;
            }
            if (isInt(sValue) == true) {
                if (Integer.parseInt(sValue) == partStock.get(x).getPartId().intValue()) {
                    return x;
                }
            }
        }
        return -1;
    }

    public static Integer productLookup(String sValue) {
        for (int x = 0; x < productStock.size(); x++) {
            if (sValue.equals(productStock.get(x).getName().getValue())) {
                return x;
            }
            if (isInt(sValue) == true) {
                if (Integer.parseInt(sValue) == productStock.get(x).getProductID().intValue()) {
                    return x;
                }
            }

        }
        return -1;
    }

    private static boolean isInt(String sValue) {
        return sValue.matches("-?\\d+") == true;
    }

    //Verification
    public Boolean isPartValid(){
        return false;
    }
    
    public Boolean isProductValid(){
        return false;
    }
    
}
