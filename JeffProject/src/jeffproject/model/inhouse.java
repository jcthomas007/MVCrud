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
public abstract class inhouse {
    
    private int machineID;
    
    //Constructor
    public void Inhouse( int MachineID ) {
        this.setMachineID( MachineID );
    }
        
    //Get
    public int getMachineID() {
        return this.machineID;
    }
    
    //Set
    public void setMachineID( int machineID ) {
        this.machineID = machineID;
    }

}
