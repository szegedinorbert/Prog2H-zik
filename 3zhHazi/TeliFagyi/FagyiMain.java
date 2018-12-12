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
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FagyiMain {

    public static void main(String[] args) {
        List<Fagyi> li = new ArrayList<>();
        
        try {
            FileReader fr = new FileReader(new File("fagyi.txt"));
            BufferedReader br = new BufferedReader(fr);
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] st = sor.split(":");
                Fagyi f = new Fagyi(st[0]);
                for (int i = 1; i < st.length; i++) {
                    f.getFagylalt().add(st[i]);
                }
                li.add(f);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("file error");
        }

  /*      List<FagyiMegrendeles> li2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {
            String[] st = sor.split(";");
            FagyiMegrendeles f= new FagyiMegrendeles(st[0], Integer.parseInt(st[1]));
            li2.add(f);
        }*/
        for(Fagyi a: li){
            System.out.println(a);
    }

}
}
