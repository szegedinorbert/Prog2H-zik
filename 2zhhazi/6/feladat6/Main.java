/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat6;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    public static Hallgato h[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        int n = Integer.parseInt(sor);

        for (int i = 0; i < n; i++) {
            sor = sc.nextLine();
            boolean a = false;
            String st[] = sor.split(" ");
            if (st[1].equals("igaz")) {
                a = true;

            }
            if(st[1].equals("hamis")){
                a=false;
            }
            h[i] = new Hallgato(Integer.parseInt(st[0]), a);

        }

    }

}