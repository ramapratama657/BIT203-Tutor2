/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
public class Dimension {
    int width;
    int length;
    
    public Dimension(){
        this.width=0;
        this.length=0;
    }
    
    public Dimension(int inWidth, int inLength){
        this.width=inWidth;
        this.length=inLength;
    }
    
    public void setWidth(int inWidth){
        this.width=inWidth;
    }
    
    public void setLength(int inLength){
        this.length=inLength;
    }
    
    public int getWidth(){
        return this.width;
    } 
    
    public int getLength(){
        return this.length;
    }
    public String toString(){
        return ""+width * length;
    }
}
