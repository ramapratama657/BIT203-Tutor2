/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */

import java.util.Scanner;
public class Menu {
    /*Dimension inDimension;
    Window inWindow;
    Room inRoom;
    Scanner inp=new Scanner(System.in);
    
    public Menu (Dimension dim, Window win, Room room){
        this.inDimension=dim;
        this.inRoom=room;
        this.inWindow=win;
    }
    
    public static void main(String[] args){
        System.out.println("Please input direction for window: ");
        win=inp.nextLine();
        System.out.println("Please input the width and length for room: ");
        room = inp.nextInt();*/
        
    public static void main(String[] args){
        Window win = new Window("West");
        Dimension dim = new Dimension(5 , 4);
        Room rom = new Room("TR1" , dim, win , 15 , false);
        
        System.out.println(rom.toString());
        
        
    }
}
