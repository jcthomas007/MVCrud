/*
 */
package jeffproject.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author jeffreyt
 */
public abstract class part {
    private IntegerProperty partId;
    private StringProperty name;
    private DoubleProperty price;
    private IntegerProperty inv;
    private IntegerProperty min;
    private IntegerProperty max;
    private StringProperty company;
    
    public part(){
        partId = new SimpleIntegerProperty();
        name = new SimpleStringProperty();
        price = new SimpleDoubleProperty();
        inv = new SimpleIntegerProperty();
        min = new SimpleIntegerProperty();
        max = new SimpleIntegerProperty();
        company = new SimpleStringProperty();
    }
    
    //Get
    public IntegerProperty getPartId() {
        return this.partId;
    }

    public StringProperty getName() {
        return this.name;
    }

    public DoubleProperty getPrice() {
        return this.price;
    }

    public IntegerProperty getInv() {
        return this.inv;
    }

    public IntegerProperty getMin() {
        return this.min;
    }

    public IntegerProperty getMax() {
        return this.max;
    }
    
    public StringProperty getCompany() {
        return this.company;
    }
    
    //Set
    public void setPartId( int partId) {
        this.partId.set(partId);
    }

    public void setName( String name ) {
        this.name.set(name);
    }

    public void setPrice( double price ) {
        this.price.set(price);
    }

    public void setInv( int inv) {
        this.inv.set(inv);
    }

    public void setMin( int min ) {
        this.min.set(min);
    }

    public void setMax( int max ) {
        this.max.set(max);
    }
    
    public void setCompany( String company ) {
        this.company.set(company);
    }
}