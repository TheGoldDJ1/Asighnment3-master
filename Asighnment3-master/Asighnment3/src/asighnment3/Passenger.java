/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asighnment3;

/**
 *
 * @author Damian
 */
public class Passenger {
    private String PFName;
    private String PLName;
    private int PNumber; 
    
    public Passenger(String PFName, String PLName, int PNumber){
        this.PFName = PFName;
        this.PLName= PLName;
        this.PNumber= PNumber; 
        
        
    }
    public void setFName(String f){
        PFName = f; 
    }
    
    public void setLName(String l){
        PLName = l; 
    }
    public void setPNum(int p){
        PNumber = p;
    }
    
    public String toString(){
        return PFName+","+PLName+","+PNumber;
    }
    
    public boolean equals(Object obj){
        if(obj instanceof Passenger){
            Passenger p = (Passenger) obj;
        
        if((this.PFName+this.PLName).equals(PFName+PLName)){
        return true;
        }
        }
        return false; 
    }
}