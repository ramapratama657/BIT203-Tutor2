/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
import java.util.*;
public class Room {
    String name;
    int noOfChairs;
    boolean isBooked;
    Dimension inDimension;
    Window inWindow[];
    
    public Room(){
    
    }
    public Room(String inName, int inNoOfChairs, boolean inBooked, Dimension inDimension, Window inWindow[] ){
        this.name=inName;
        this.noOfChairs=inNoOfChairs;
        this.isBooked=inBooked;
        //this.Dimension=inDimension;
        
    }
    
    public void setName(String inName){
        this.name=inName;
    }
    public void setNoOfChairs(int inNoOfChairs){
        this.noOfChairs=inNoOfChairs;
    }
    public void setIsBooked(boolean inBooked){
        this.isBooked=inBooked;
    }
    public String getName(){
        return this.name;
    }
    public int getNoOfChairs(){
        return this.noOfChairs;
    }
    public boolean getIsBooked(){
        return this.isBooked;
    }
    
    public String toString(){
        return "Room "+name+" with "+inDimension+"m, with "+inWindow+" and "+noOfChairs+" chairs, and is already booked: "+isBooked;
    }
}
