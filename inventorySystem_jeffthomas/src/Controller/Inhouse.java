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
public abstract class Inhouse {
    
    private int machineID;
    
    //Constructor
    public Inhouse( int MachineID ) {
        this.setMachineID( MachineID );
    }
        
    //Get
    public int getMachineID() {
        return this.machineID;
    }
    
    //Set
    public int setMachineID( int machineID ) {
        this.machineID = machineID;
    }

}
