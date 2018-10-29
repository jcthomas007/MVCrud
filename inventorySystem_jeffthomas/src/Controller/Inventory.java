/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author jeffreyt
 */
public abstract class Inventory {
    
    private int partID;
    private String name;
    private double price;
    private int inStock;
    private int min;
    private int max;
    
    //Constructor
    public Inventory( int partID, String name, double price, int inStock, int min, int max ) {
        this.setPartID( partID );
        this.setName( name );
        this.setPrice( price );
        this.setInStock( inStock );
        this.setMin( min );
        this.setMax( max );
    }
        
    //Get
    public int getPartID() {
        return this.partID;
    }

    public String getName() {
        return this.name;
    }

    public dobule getPrice() {
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
    public int setPartID( int partID) {
        this.partID = partID;
    }

    public String setName( string name ) {
        this.name = name;
    }

    public dobule setPrice( double price ) {
        this.price = price;
    }

    public int setInStock( int inStock) {
        this.inStock = inStock;
    }

    public int setMin( int min ) {
        this.min = min;
    }

    public int setMax( int max ) {
        this.max = max;
    }


}
