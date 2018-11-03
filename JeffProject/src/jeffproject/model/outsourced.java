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
public abstract class outsourced {

    private String companyName;
    
    //Constructor
    public void Outsourced( String companyName ) {
        this.setCompanyName( companyName );
    }
        
    //Get
    public String getCompanyName() {
        return this.companyName;
    }

    //Set
    public void setCompanyName( String companyName) {
        this.companyName = companyName;
    }

}
