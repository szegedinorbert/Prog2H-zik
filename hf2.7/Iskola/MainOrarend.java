/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class MainOrarend {
    
    private static Orarend orarend[];
    
    public static void main(String[] args) {
        
        int n;
        
        Scanner scan=new Scanner(System.in);
        
        n=Integer.parseInt(scan.nextLine());
        
        orarend=new Orarend[n];
        
        for(int i=0;i<n;i++)
        {
            String sor=scan.nextLine();
            Orarend ora=new Orarend(sor);  
        }
    }
}

