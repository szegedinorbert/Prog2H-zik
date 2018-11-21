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
        List<Parkoló> li = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();

        while (sor.length() > 0) {
            String st[] = sor.split(";");
            String cím = st[0];//1
            double terület = Double.parseDouble(st[1]);//2
            int t = Integer.parseInt(st[2]);//3
            List<String> li2 = new ArrayList();
            for (int i = 3; i < st.length; i++) {
                li2.add(st[i]);
            }

            li.add(new Parkoló(cím, terület, t, li2));

            sor = sc.nextLine();

        }
        Collections.sort(li);
        for (Parkoló i : li) {
            if(i.getSzabadHely()>=3){
                System.out.println(i);
            }
        }

    }

}
