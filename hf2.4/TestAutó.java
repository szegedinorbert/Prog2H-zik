/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestAutó {
    
    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher){
        
        for(int i=0;i<teher.length-1;i++)
        {
            for(int j=i+1;j<teher.length;j++)
            {
                if(teher[i].getMaxSzállíthatóTeher()<teher[j].getMaxSzállíthatóTeher()){
                Teherautó tmp= teher[i];
                teher[i]=teher[j];
                teher[j]=tmp;
            }
        }
    }
    }
    
    public static Autó keresMaxMotorTeljesítmény(Autó[] auto)
    {   
        int max=Integer.MIN_VALUE;
    
        int index=0;
    
        for(int i=0;i<auto.length;i++)
        {
            if(auto[i].getMotorteljesítmény()>max)
            {
                max=auto[i].getMotorteljesítmény();
                index=i;
                
            }
        }
        return auto[index];
    }
    
    public static void main(String[] args) {
        
        Autó[] auto= new Autó[]{
        new Autó("ABC-012", 18000),
        new Autó("DEF-345", 2000),
        new Autó("GHI-678", 3000),
        new Autó("JKL-901", 4000),
        new Autó("MNO-234", 5000),
        new Teherautó("PQR-456", 6000, 60),
        new Teherautó("STU-789", 7000, 70),
        new Teherautó("VZA-012", 8000, 80),
        new Teherautó("BCD-345", 9000, 90),
        new Teherautó("EFG-678", 10000, 100)
    };
        
        Teherautó[] teher= new Teherautó[]{
        new Teherautó("ABB-122", 4000, 40),
        new Teherautó("ACC-133", 5000, 50),
        new Teherautó("ADD-144", 3000, 30),
        new Teherautó("AEE-155", 8000, 80),
        new Teherautó("AFF-166", 9000, 90),
        new Teherautó("AGG-177", 10000, 100),
        new Teherautó("AHH-188", 6000, 60),
        new Teherautó("AII-199", 1000, 10),
        new Teherautó("AJJ-200", 8000, 80),
        new Teherautó("AKK-211", 2000, 20)
        };
        
        rendezMaxSzállíthatóTeherCsökkenőleg(teher);
        for(Teherautó t:teher){
        System.out.println(t);}
        System.out.println("legnagyobb motorteljesítmény:");
        System.out.println(keresMaxMotorTeljesítmény(auto));
 }
}

