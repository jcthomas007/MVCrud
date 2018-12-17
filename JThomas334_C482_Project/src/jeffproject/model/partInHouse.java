package jeffproject.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author jeffreyt
 */
public class partInHouse extends part {

    private IntegerProperty machineId;

    public partInHouse() {
        super();
        machineId = new SimpleIntegerProperty();
    }

    public int getMachineId() {
        return this.machineId.get();
    }

    public void setMachineId(int machineId) {
        this.machineId.set(machineId);
    }

}
