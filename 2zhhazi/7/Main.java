/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    
    public static List<Lakóház> tágas(List<Lakóház> lh, double térfogat)
    {
        List<Lakóház> l2=new ArrayList<>();
        for(Lakóház i:lh){
            if(i.légköbméter()>térfogat)
            {
                l2.add(i);
            }
        }
        return l2;
    }
    
    
    public static void main(String[] args){
       
        //az add-el a lista végére szúrhatunk be
        List <Lakóház> lh=new ArrayList();
        lh.add( new Lakóház("Egy 1",12,5.6));
        lh.add( new Lakóház("Egy 3",15,4.6));
        lh.add( new Lakóház("Egy 5",3,7.6));
        lh.add( new Lakóház("Egy 6",2,17.6));
        
        
        System.out.println(lh.get(0));
        
        //a 3.index helyre beszúrjuk a 111-est
        lh.add(3,new Lakóház("Egy 111",22,1.6));
        
        //így is ejárhatjuk
        //for(int i=0;i<lh.size();i++)
        //System.out.println(lh.get(i));
        
        for(Lakóház i:lh)
            System.out.println(i);
        
        //0.indexüt felülírjuk
        lh.set(0,new Lakóház("Egy 222",2,4));
        System.out.println(lh.get(0));
        
        
        //visszaadja hogy megtalálható a listában ez az objektm
        System.out.println(lh.contains(new Lakóház("Egy 222",2,4)));
        
        //megadja az első előfordulásának az indexét
        System.out.println(lh.lastIndexOf(new Lakóház("Egy 222",2,4)));
        
        List<Lakóház> l3= tágas(lh,55);
        Collections.sort(l3);
        for(Lakóház i:l3)
            System.out.println(i);
    
    }          
}
