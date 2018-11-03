package jeffproject.model;
import java.util.ArrayList;
        ;
/**
 *
 * @author jeffreyt
 */
public abstract class product {
    private ArrayList<part> associatedParts;
    private int productID;
    private String name;
    private double price;
    private int inStock;
    private int min;
    private int max;
    
    //Constructor
    public product( ArrayList<part> associatedParts, int productID, String name, double price, int inStock, int min, int max ) {
        this.setAssociatedParts( associatedParts );
        this.setProductID( productID );
        this.setName( name );
        this.setPrice( price );
        this.setInStock( inStock );
        this.setMin( min );
        this.setMax( max );
    }
        
    //Get
    public ArrayList<part> getAssociatedParts() {
        return this.associatedParts;
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
    public void setAssociatedParts( ArrayList<part> parts ) {
        this.associatedParts = parts;
    }

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
