package jeffproject.model;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

;

/**
 *
 * @author jeffreyt
 */
public class product {

    private IntegerProperty productID;
    private StringProperty name;
    private DoubleProperty price;
    private IntegerProperty inStock;
    private IntegerProperty min;
    private IntegerProperty max;
    private static ObservableList<part> parts = FXCollections.observableArrayList();

    //Constructor
    public product() {
        
        productID = new SimpleIntegerProperty();
        name = new SimpleStringProperty();
        price = new SimpleDoubleProperty();
        inStock = new SimpleIntegerProperty();
        min = new SimpleIntegerProperty();
        max = new SimpleIntegerProperty();
    }

    public IntegerProperty getProductID() {
        return this.productID;
    }

    public StringProperty getName() {
        return this.name;
    }

    public DoubleProperty getPrice() {
        return this.price;
    }

    public IntegerProperty getInStock() {
        return this.inStock;
    }

    public IntegerProperty getMin() {
        return this.min;
    }

    public IntegerProperty getMax() {
        return this.max;
    }

    public ObservableList getParts() {
        return parts;
    }

    //Set
    public void setProductID(int productID) {
        this.productID.set(productID);
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setPrice(double price) {
        this.price.set(price);
    }

    public void setInStock(int inStock) {
        this.inStock.set(inStock);
    }

    public void setMin(int min) {
        this.min.set(min);
    }

    public void setMax(int max) {
        this.max.set(max);
    }

    public void setParts(ObservableList<part> parts) {
        this.parts = parts;
    }

}
