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
import java.util.Scanner;


public class Main {

    
    public static List<Auto> nagy3(List<Auto> li){
        List<Auto> li2=new ArrayList();
        if(li.size()>=3){
            Collections.sort(li);
            for(int i=0;i<3;i++){
                li2.add(new Auto(li.get(i).getRendszám(), li.get(i).getTeljesítmény(), li.get(i).isAutomata()));
                
            }
            return li2;
        }
        else{
            return li;
        }
    }

    public static List<TeherAuto> nagyobbE(Auto[] a) {
        List<TeherAuto> t = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof TeherAuto) {
                TeherAuto teher = (TeherAuto) a[i];
                if(teher.getTeherbiras()>20){
                    t.add(teher);
                }
            }
        }
        return t;
    }

    public static void main(String[] args) {
        Auto[] au = new Auto[4];
        Scanner sc = new Scanner(System.in);
        String rendszam = sc.nextLine();
        Auto a = new Auto(rendszam, 100, true);
        System.out.println(a);
        System.out.println(a.getSzabáyos());
        for (int i = 0; i < 2; i++) {
            String sor = sc.nextLine();
            String st[] = sor.split(" ");
            au[i] = new Auto(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]));

        }
        for (int i = 2; i < 4; i++) {
            String sor = sc.nextLine();
            String st[] = sor.split(" ");
            au[i] = new TeherAuto(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]), Integer.parseInt(st[3]));
        }

        for (Auto i : au) {
            System.out.println(i);
        }
        System.out.println("\n");
        
        List<TeherAuto> teher=nagyobbE(au);
        for(TeherAuto i: teher){
            System.out.println(i);
        }
        List<Auto> oto=new ArrayList();
        oto.add(new Auto("sdasd", 34, true));
        oto.add(new Auto("afdf122", 45, true));
        oto.add(new Auto("trze", 80, true));
        oto.add(new Auto("ewrew", 70, true));
        
        System.out.println("\n");
        List<Auto> auto=nagy3(oto);
        for(Auto i:auto){
            System.out.println(i);
        }
    }

}
