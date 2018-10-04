/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
  
        Rectangle r2=new Rectangle(4, 40);
        Rectangle r3=new Rectangle(3.5, 35.9);
        
        System.out.println("Az első téglalap szélessége="+r2.getWidth());
        System.out.println("Az első téglalap magassága="+r2.getHeight());
        System.out.println("Az első téglalap területe="+r2.getArea());
        System.out.println("Az első téglalap kerülete="+r2.getPerimeter());
        System.out.println("A második téglalap szélessége="+r3.getWidth());
        System.out.println("A második téglalap magassága="+r3.getHeight());
        System.out.println("A második téglalap területe="+r3.getArea());
        System.out.println("A második téglalap kerülete="+r3.getPerimeter());
   
    }
}
