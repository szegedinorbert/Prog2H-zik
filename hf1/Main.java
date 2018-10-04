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
        
        Pont elso = new Pont(1,1);
        Pont masodik = new Pont(2,2);
        Pont harmadik = new Pont (3,3);
        Pont negyedik = new Pont (4,4);
        
        elso.setY(elso.getY()+5);
        
        masodik.setY(masodik.getY()+5);
        
        harmadik.setX(harmadik.getX()-3.4f);
        
        negyedik.setX(negyedik.getX()-3.4f);
        
        System.out.println("Első koordináta: ( " + elso.getX() + " , " + elso.getY() + " )");
        System.out.println("Második koordináta: ( " + masodik.getX() + " , " + masodik.getY()+ " )");
        System.out.println("Harmadik koordináta: ( " + harmadik.getX() + " , " + harmadik.getY()+ " )");
        System.out.println("Negyedik koordináta: ( " + negyedik.getX() + " , " + negyedik.getY()+" )");
        
    }
}
