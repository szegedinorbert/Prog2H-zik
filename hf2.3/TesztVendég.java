/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TesztVendég {
    
    private static Kocsma[] adottItaltÁrusítóKocsmák(String ital, VendéglátóipariEgység[] t)
    {
        int count=0;
        for(int i=0;i<t.length;i++)
        {
            if(t[i] instanceof Kocsma)
            {
                Kocsma k=(Kocsma)t[i];
                for(int j=0;j<k.getSörlap().length;j++)
                {
                    if(k.getSörlap()[j].equals(ital))
                    {
                        count++;
                    }
                }
            }
        }
        Kocsma[] kocsma= new Kocsma[count];
        int index=0;
        for(int i=0;i<t.length;i++)
        {
            if(t[i] instanceof Kocsma)
            {
                Kocsma k= (Kocsma) t[i];
                for(int j=0;j<k.getSörlap().length;j++)
                {
                    if(k.getSörlap()[j].equals(ital))
                    {
                       kocsma[index]=k;
                       index++;
                    }
                }
            }
        }
        return kocsma;   
    }
    
    public static void main(String[] args) {
        VendéglátóipariEgység[] t= new VendéglátóipariEgység[]
        {
          new Étterem("Csárdás étterem", 100, new String[]{"rántotthús", "libamáj", "paradicsomleves"}),
          new Étterem("Látóképi étterem", 200, new String[]{"paprikáskrumpli", "pacal", "rántotta"}),
          new Étterem("Leroy étterem", 150, new String[]{"burrito", "gyümölcsleves", "görögsaláta"}),
          new Étterem("Bonita étterem", 175, new String[]{"milánói", "pizza", "csirkéspenne"}),
          new Étterem("Hortobágyi étterem", 150, new String[]{"hortobágyipalacsinta", "halászlé"}),
          new Kocsma("Wall kocsma", 20, new String[]{"vodka", "jéger", "sör"}),
          new Kocsma("Svejk kocsma", 15, new String[]{"sör", "bor", "pálinka"}),
          new Kocsma("Pince kocsma", 50, new String[]{"vodka","jéger"}),
          new Kocsma("Füredi kocsma", 30, new String[]{"jéger", "bor"}),
          new Kocsma("Loki kocsma", 20, new String[]{"sör", "bor"})
        };
        Kocsma[] kocsm=adottItaltÁrusítóKocsmák("sör", t);
        for(Kocsma k:kocsm){
        System.out.println(k);}
    }
}
