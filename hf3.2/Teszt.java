/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import java.util.Scanner;

public class Teszt {
    private static void rendez(Diák[] d) {

        for (int i = 0; i < d.length - 1; i++) {   
            for (int j = i + 1; j < d.length; j++) {
               
                if (d[j].getElőzőNeve().equals(d[i].getSajátNeve()) && j > i + 1) {
                    Diák tmp = d[i + 1];
                    d[i + 1] = d[j];
                    d[j] = tmp;
                }
            }
        }
    }

    private static void pirosKék(Diák[] d, String ki) {

        int piros = 0;
        int kék = 0;
        for (int i = 0; i < d.length; i++) { 
            if (d[i].getSajátNeve().equals(ki)) {  
                System.out.println(piros + " " + kék);
                break;

            } else if (i % 2 == 0) { 
                piros++;
            } else {
                kék++;
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine(); 
        String[] s = sor.split(";");

        int n = Integer.parseInt(s[0]);  
        Diák[] d = new Diák[n]; 
        d[0] = new Diák(s[1], ""); 
                                   
        String X = s[2];    

        for (int i = 1; i < n; i++) 
        {       
            sor = sc.nextLine();     
            s = sor.split(";");      
            d[i] = new Diák(s[0], s[1]);   

        }

        rendez(d); 

        for (Diák i : d) {    
            System.out.println(i);
        }
        
        pirosKék(d, X);  
    }
}
