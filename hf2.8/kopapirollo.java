/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

import java.util.Random;
import java.util.Scanner;


public class kopapirollo {
    
    public static void main(String[] args) {
        
        int k=1;
        
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        
       
       
       while(k==1){
           String tippem= sc.nextLine();
           
           if(tippem.equals("vege"))
               break;
           else if(tippem.equals("ko") || tippem.equals("papir") || tippem.equals("ollo")){
               
                int random = rnd.nextInt(3);
                
           
               if(tippem.equals("ko") && random==0)
                        System.out.println("Döntetlen");
               if(tippem.equals("ko") && random==1)
                        System.out.println("Nyertem");
               if(tippem.equals("ko") && random==2)
                       System.out.println("Nyertél");
               
               if(tippem.equals("papir") && random==0)
                   System.out.println("Nyertem");
               if(tippem.equals("papir") && random==1)
                   System.out.println("Dötetlen");
               if(tippem.equals("papir") && random==2)
                   System.out.println("Nyertél");
               
               if(tippem.equals("ollo") && random==0)
                   System.out.println("Nyertél");
               if(tippem.equals("ollo") && random==1)
                   System.out.println("Nyertem");
               if(tippem.equals("ollo") && random==2)
                   System.out.println("Döntetlen");
           }
           else{
               System.out.println("Add meg a ko papir ollo vagy vege ");
           } 
        }
    }   
}
