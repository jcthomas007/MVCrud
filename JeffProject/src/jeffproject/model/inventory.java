/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeffproject.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author jeffreyt
 */
public class inventory {

    private static ObservableList<part> partStock = FXCollections.observableArrayList();
    private static ObservableList<product> productStock = FXCollections.observableArrayList();

    //part
    public static ObservableList<part> getParts(){
        return partStock;
    }
    
    public static void partAdd(part part) {
        partStock.add(part);
    }

    public static void deletePart(part part) {
        partStock.remove(part);
    }
    
    public static void updatePart(int partId, part part){
        partStock.set(partId, part);
    }
    
    public int partCount() {
        return partStock.size() + 1;
    }
    
    // todo search part

    // product
       public static ObservableList<product> getProducts(){
        return productStock;
    }
    
    public static void productAdd(product product) {
        productStock.add(product);
    }

    public static void deleteproduct(product product) {
        productStock.remove(product);
    }
    
    public static void updatePart(int productId, product product){
        productStock.set(productId, product);
    }
    
    public int productCount() {
        return productStock.size() + 1;
    }
    
    // todo search product 
}