/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */

/*Sejauh ini belum ada masalah di kelas ini namun saya belum mengerti cara membuat kelas java driver program nya*/
public class Window {
    String direction;
    
    public Window(){
        this.direction = null;
    }
    
    public Window(String inDirection){
        this.direction=inDirection;
    }
    
    public void setDirection(String inDirection){
        this.direction=inDirection;
    }
    
    public String getDirection(){
        return this.direction;
    }
    
    public String toString(){
        return "Window facing to "+getDirection();
    }
    
}
