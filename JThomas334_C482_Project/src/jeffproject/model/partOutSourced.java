package jeffproject.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author jeffreyt
 */
public class partOutSourced extends part {

    private StringProperty company;

    public partOutSourced() {
        super();
        company = new SimpleStringProperty();
    }

    public StringProperty getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company.set(company);
    }

}
