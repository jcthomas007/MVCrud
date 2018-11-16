/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeffproject.model;

/**
 *
 * @author jeffreyt
 */
public abstract class part {
    int partID;
    String name;
    double price;
    int inStock;
    int min;
    int max;
    
    public abstract addPart (int id, String name, double price, int inStock, int min, int max);
    public abstract void removePart(int id);

    //Get
    public int getPartID() {
        return this.partID;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getInStock() {
        return this.inStock;
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }
    
    //Set
    public void setPartID( int partID) {
        this.partID = partID;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setPrice( double price ) {
        this.price = price;
    }

    public void setInStock( int inStock) {
        this.inStock = inStock;
    }

    public void setMin( int min ) {
        this.min = min;
    }

    public void setMax( int max ) {
        this.max = max;
    }

}