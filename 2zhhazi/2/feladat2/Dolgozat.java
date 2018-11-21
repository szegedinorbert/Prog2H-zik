/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat2;

/**
 *
 * @author user
 */
public class Dolgozat {

    public static SzeszesItal[] keres(Ital[] t) {
        int db = 0;

        for (int i = 0; i < t.length; i++) 
        {
            if (t[i] instanceof SzeszesItal) 
            {
                SzeszesItal sz = (SzeszesItal) t[i];
                db++;

            }
        }

        SzeszesItal[] szesz = new SzeszesItal[db];

        int index = 0;

        for (int i = 0; i < t.length; i++) 
        {
            if (t[i] instanceof SzeszesItal) 
            {
                SzeszesItal sz = (SzeszesItal) t[i];
                szesz[index] = sz;
                index++;
            }
        }

        for (int i = 0; i < szesz.length - 1; i++) 
        {
            for (int j = i + 1; j < szesz.length; j++) 
            {
                if (szesz[i].getAlkoholTartalomtujaldonsag() < szesz[j].getAlkoholTartalomtujaldonsag()) 
                {
                    SzeszesItal tmp = szesz[i];
                    szesz[i] = szesz[j];
                    szesz[j] = tmp;
                }
            }
        }
        
        
        if(szesz.length<3)
        {
            SzeszesItal eredmeny[]=new SzeszesItal[1];
            eredmeny[0]=null;
            return eredmeny;
        }
        SzeszesItal eredmeny[]=new SzeszesItal[3];
        for(int i=0;i<3;i++)
        {
            eredmeny[i]=szesz[i];
        }
        
        return eredmeny;
        
    }

    public static void main(String[] args) {
        Ital[] i = new Ital[]{
            new SzeszesItal(40, "Whisky", "0,5", 5000),
            new SzeszesItal(45, "Vodka", "50", 20),
            new SzeszesItal(30, "Alma", "sok", 40),
            new SzeszesItal(20, "Csavart", "kevés", 30),};

        SzeszesItal it[] = keres(i);
        for (SzeszesItal k : it) {
            System.out.println(k);
        }

    }
}
