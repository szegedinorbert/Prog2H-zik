/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import jdk.nashorn.internal.ir.CatchNode;

public class Main {

    public static void main(String[] args) {
        List<Film> fl = new ArrayList();

        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {
            String[] darabolt = sor.split("[():;]");
            for (int i = 3; i < darabolt.length; i++) {
                Film f = new Film(darabolt[i]);

                if (fl.contains(f)) {
                    fl.get(fl.indexOf(f)).getSzínészek().add(new Színész(darabolt[0], Integer.parseInt(darabolt[1])));
                } else {
                    f.getSzínészek().add(new Színész(darabolt[0], Integer.parseInt(darabolt[1])));
                    fl.add(f);
                }

            }

            sor = sc.nextLine();

        }

        
        Collections.sort(fl);
        for(Film i:fl)
            System.out.println(i);

    }
}
