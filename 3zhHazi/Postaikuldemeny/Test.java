
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Test {

    public static void main(String[] args) {
        List<Adatok> li = new ArrayList<>();

        try {
            FileReader fr = new FileReader(new File("sample.txt"));
            BufferedReader br = new BufferedReader(fr);
            String sor;
            int tmp = 0;
            while ((sor = br.readLine()) != null) {
                String[] st = sor.split(":");
                String nev = st[0];
                int iranyitosz = Integer.parseInt(st[1]);
                String varos = st[2];
                String utca = st[3];
                int hazszam = Integer.parseInt(st[4]);
                int ertek = Integer.parseInt(st[5]);
               

                List<Rendeles> rendeles = new ArrayList<>();
                Rendeles r = new Rendeles(nev, varos, utca, hazszam);
                rendeles.add(r);
                 Adatok a = new Adatok(iranyitosz, rendeles);
                 li.add(a);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Nem tudtam beolvasni");
        }
        Collections.sort(li);
        for(Adatok a:li){
            System.out.println(a);
        }
    }

}
