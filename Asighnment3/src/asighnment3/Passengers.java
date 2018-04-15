/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asighnment3;

import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class Passengers
{
    private ArrayList <Passenger> passengers;
    public Passengers(){
        passengers = new ArrayList<>();
    }
    
    public void addPassenger (String PFName,String PLName, int PNumber){
        passengers.add(new Passenger(PFName,PLName,PNumber));
        System.out.println("passenger added");
    }
}