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
        LinearEquation elso = new LinearEquation(1,2,3,4,5,6);
        LinearEquation masodik = new LinearEquation(2,4,2,4,5,6);
        LinearEquation harmadik = new LinearEquation(66,22,55,44,33,11);
        
        if(elso.isSolveable()==true)
        {
            System.out.println("Az első e.r. megoldásai: " + elso.getX() + " , " + elso.getY());
        } 
        else System.out.println("The first equation has no solution.");
        
        if(masodik.isSolveable()==true)
        {
            System.out.println("A második e.r. megoldásai: " + masodik.getX() + " , " + masodik.getY());
        }
        else System.out.println("The second equation has no solution.");
        
        if(harmadik.isSolveable()==true)
        {
            System.out.println("A harmadik e.r. megoldásai: " + harmadik.getX() + " , " + harmadik.getY());
        }
        else System.out.println("The third equation has no solution.");
               
    }   
}
    

