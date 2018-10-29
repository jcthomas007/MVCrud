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
public abstract class Outsourced {

    private String companyName;
    
    //Constructor
    public Outsourced( String companyName ) {
        this.setCompanyName( companyName );
    }
        
    //Get
    public String getCompanyName() {
        return this.companyName;
    }

    //Set
    public int setCompanyName( String companyName) {
        this.companyName = companyName;
    }

}
