
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {
    /*
Gabriella 23 false 3.5
Gábor 22 true 4.2
Péter 36 true Grafika
Andrea 32 false Számítástudomány
    
    */
    

    public static void main(String[] args) {
        Személy sz = new Személy("Mona Liza", 20, false);
        System.out.println(sz+"\n");
        Hallgató h=new Hallgató("András", 34, true, 4);
        System.out.println(h.joE());

        Scanner sc = new Scanner(System.in);
        Személy[] személy=new Személy[4];
        for(int i=0;i<2;i++){
            String sor=sc.nextLine();
            String[] st=sor.split(" ");
            személy[i]=new Hallgató(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]), Double.parseDouble(st[3]));
        }
        for(int i=2;i<4;i++){
            String sor=sc.nextLine();
            String[] st=sor.split(" ");
            személy[i]=new Oktató(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]), st[3]);
        }
                
        for(Személy i:személy){
            System.out.println(i);
        }
    }
}
