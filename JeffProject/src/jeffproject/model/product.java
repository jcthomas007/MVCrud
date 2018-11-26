package jeffproject.model;
import java.util.ArrayList;
        ;
/**
 *
 * @author jeffreyt
 */
public class product {
    private int productID;
    private String name;
    private double price;
    private int inStock;
    private int min;
    private int max;
    
    //Constructor
    public product() {
    productID = 0;
    name = "";
    price = 0;
    inStock = 0;
    min = 0;
    max = 0;
    }
        
    public int getProductID() {
        return this.productID;
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
    public void setProductID( int productID) {
        this.productID = productID;
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
