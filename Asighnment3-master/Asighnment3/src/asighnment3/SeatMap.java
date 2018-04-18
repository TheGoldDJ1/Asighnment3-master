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
public class SeatMap {
 private String map[][]=new String[3][20];
 //private boolean Open;
private int i;
private int j;


 public void createMap(){
     i=1;
     map[0][1]= "A";
     map[0][2]= "B";
     map[0][3]= "C"; 
    while (i <=20){
       map[i][0]= ""+i; 
       i=i+1;
    }
     i=1;
     j=1;
     while(i<=20){
         while(j<=3){
             map[i][j]="-";
             j=j+1;
             
         }
         i=i+1;
     }
 }
 
 public boolean isOpen(){
     if(map [i][j].equals("-"))
         return true;
     return false;
 } 
 
 public void takeSeat(){
     if(isOpen()){
       map[i][j] = "x";   
     }
 }
 
 public void leaveSeat(){
     if (map[i][j].equals("x")){
             map[i][j]="-";
 }
     else 
         System.out.println("Seat not taken");
 }
   
}
