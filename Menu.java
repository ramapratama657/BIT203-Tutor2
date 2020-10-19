/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */

/*always remember with this method*/

import java.util.*;
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
        //quest1 a
        Window win = new Window("West");
        Dimension dim = new Dimension(5 , 4);
        Room rom = new Room("TR1" , 15, true , dim , win);
        
        //cara untuk mengambil data objek toString dari class Room
        System.out.println(rom.toString());
        
        Scanner inp = new Scanner(System.in);
        //quest1 b
        System.out.print("Window facing to: ");
        String window = inp.next();
        
        Window wind = new Window(window);
        System.out.println(wind.toString());
        
        System.out.print("Room width: ");
        int width = inp.nextInt();
        System.out.print("Room length: ");
        int length = inp.nextInt();
        
        Dimension dimends = new Dimension(width,length);
        System.out.println(dimends.toString());

        System.out.print("Room Name: ");
        String romname = inp.next();
        System.out.print("No of chairs: ");
        int chairs = inp.nextInt();
        System.out.print("Already booked(true / false): ");
        boolean book = inp.nextBoolean();
        
        Room rom1 = new Room(romname,chairs,book,dimends,wind);
        System.out.println(rom1.toString());
        
    }
}
