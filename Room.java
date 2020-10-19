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
    ArrayList<Dimension> InDimension = new ArrayList<Dimension>();
    ArrayList<Window> InWindow = new ArrayList<Window>();
    
    public Room(){
        name=null;
        noOfChairs=0;
        isBooked=true;
    }
    public Room(String inName, int inNoOfChairs, boolean inBooked, Dimension inDimension, Window inWindow ){
        this.name=inName;
        this.noOfChairs=inNoOfChairs;
        this.isBooked=inBooked;
        InDimension.add(inDimension);
        InWindow.add(inWindow);
        
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
    public void setInDimension(ArrayList<Dimension>inDimension){
        this.InDimension=inDimension;
    }
    public void setInWindow(ArrayList<Window>inWindow){
        this.InWindow=inWindow;
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
    public ArrayList<Dimension> getInDimension(){
        return this.InDimension;
    }
    public ArrayList<Window> getInWindow(){
        return this.InWindow;
    }
    public String toString(){
        return "Room "+getName()+" with "+getInDimension()+"m, with "+getInWindow()+" and "+getNoOfChairs()+" chairs, and is already booked: "+getIsBooked();
    }
}
