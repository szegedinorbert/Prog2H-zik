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

    public static void main(String[] args) {
        List<OsztalyPénz> li = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();

        while (sor.length()>0) {
            String st[] = sor.split(";");
            String név = st[0];
            int pénz = Integer.parseInt(st[1]);
            boolean b = false;

            if (li.size() == 0) {
                li.add(new OsztalyPénz(név, pénz));
                b = true;
            } else {
                for (int i = 0; i < li.size(); i++) {
                    if (név.equals(li.get(i).getNév())) {
                        int vpénz = li.get(i).getPénz() + pénz;
                        li.set(i, new OsztalyPénz(név, vpénz));
                        b = true;
                    }
                }
            }
            if (!b) {
                li.add(new OsztalyPénz(név, pénz));
                b = false;
            }
            sor = sc.nextLine();
        }

        Collections.sort(li);
        for (OsztalyPénz i : li) {
            System.out.println(i);
        }

    }

}
