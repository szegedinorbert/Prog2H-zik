/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

import java.util.Scanner;

public class NégyazonosSzám {
    
    public static boolean isConsecutiveFour(int[] values) {
        
        int db = 0;
        int count = 0;
        for (int i = 0; i < values.length; i++) 
        {
            db++;
        }
        if (db < 4) 
        {
            return false;
        } 
        else 
        {
            for (int i = 0; i < values.length; i++) 
            {
                for (int j =0; j < values.length; j++) 
                {
                    if (values[i] == values[j]) 
                    {
                        count++;
                    }
                }
            }
            if (count < 4) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int meret = 0;
        
        while (scan.hasNextInt()) 
        {
            int s = scan.nextInt();
            
            if (s == 0) 
            {
                break;
            }
            meret++;
        }
        
        int[] t=new int[meret];
        
        System.out.println(isConsecutiveFour(t));
    }
}

