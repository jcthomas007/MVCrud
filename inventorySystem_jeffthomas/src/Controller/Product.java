package Controller;
import java.util.ArrayList;
import Controller.Part;

/**
 *
 * @author jeffreyt
 */
public abstract class Product {
    
    private ArrayList<Part> associatedParts = new ArrayList<Part>();
    private int productID;
    private String name;
    private double price;
    private int inStock;
    private int min;
    private int max;
    
    //Constructor
    public Product( ArrayList<Part> associatedParts, int productID, String name, double price, int inStock, int min, int max ) {
        this.setAssociatedParts( associatedParts );
        this.setProductID( partID );
        this.setName( name );
        this.setPrice( price );
        this.setInStock( inStock );
        this.setMin( min );
        this.setMax( max );
    }
        
    //Get
    public ArrayList<Part> getAssociatedParts() {
        return this.associatedParts;
    }
        
    public int getProductID() {
        return this.productID;
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
    public ArrayList<Part> setAssociatedParts( associatedParts ) {
        this.associatedParts = associatedParts;
    }
        

--todo finish

    
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
