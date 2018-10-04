/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Teszt {
    
    public static void main(String[] args) {
        
        RegularPolygon elso = new RegularPolygon();
        
        RegularPolygon masodik = new RegularPolygon(6,4);
        
        RegularPolygon harmadik = new RegularPolygon (10,4,5.6,7.8);
        
        System.out.println("Első kerülete = " + elso.getPerimeter());
        System.out.println("Első területe = " + elso.getArea());
        System.out.println("Második kerülete = " + masodik.getPerimeter());
        System.out.println("Második területe = " + masodik.getArea());
        System.out.println("Harmadik kerülete = " + harmadik.getPerimeter());
        System.out.println("Harmadik területe = " + harmadik.getArea());
        
    }
}

