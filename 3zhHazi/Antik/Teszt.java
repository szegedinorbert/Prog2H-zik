/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Teszt {
    
    public static void main(String[] args) {
        List<Könyvek> li=new ArrayList<>();
        
        try{
            FileReader fr=new FileReader(new File("sample.txt"));    //args[0]
            BufferedReader br=new BufferedReader(fr);
            
            String sor;
            
            while((sor=br.readLine())!=null) {
                
                String [] tmp=sor.split(";");
                Könyvek k=new Könyvek(tmp[tmp.length-2],Integer.parseInt(tmp[tmp.length-1]));
                
                for(int i=0;i<tmp.length-2;i++) {
                    k.getSzerzo().add(tmp[i]);
                }
                li.add(k);
            }
            
            br.close();
            
        }catch(IOException e)
        {
            System.out.println("Fájl hiba!");
        }
        
        Collections.sort(li);

        
        try{
            FileWriter fw=new FileWriter(new File("ki.txt"));
            BufferedWriter bw=new BufferedWriter(fw);
                       
            List<Könyvek> l2=new ArrayList<>();
            for(int i=0;i<li.size()-1;i++) {
                l2.add(li.get(i));
                for(int j=i+1;j<li.size();j++) {
                    
                    if(li.get(i).equals(li.get(j))) {
                        li.remove(j);
                    }
                }
            }
            l2.add(li.get(li.size()-1));
            
            
            for (Könyvek x : l2) {
            bw.write(x.toString());
            bw.newLine();
        }
            
            bw.close();
            
        }catch(IOException e){
            
        }
        
        
    }
    
}
