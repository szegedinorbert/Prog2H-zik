/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class MainBor {

    public static Aszu[] puttony(AlkoholosItal[] t) {
        int db = 0;

        for (int i = 0; i < t.length; i++) 
        {
            if (t[i] instanceof Aszu) {
                Aszu k = (Aszu) t[i];

                if (k.hanyPuttonyos() == 5) {
                    db++;
                }

            }
        }
        
        Aszu[] a = new Aszu[db];
        int n = 0;
        for (int i = 0; i < t.length; i++) 
        {
            if (t[i] instanceof Aszu) 
            {
                Aszu k = (Aszu) t[i];

                if (k.hanyPuttonyos() == 5) 
                {
                    a[n] = k;
                    n++;
                }
            }
        }
        return a;
    }
    
    

    

    public static void main(String[] args) {
        Bor[] b = new Bor[]{
            new Bor("otelló", "Tokaj", "édes", 10),
            new Bor("fehér", "Eger", "száraz", 15),
            new Aszu(5, "Tokaj", 20),
            new Aszu(20, "Eger", 15)

        };
        Aszu[] bor= puttony(b);
        for(Aszu k: bor){
            System.out.println(k);
        }   
    }
}
