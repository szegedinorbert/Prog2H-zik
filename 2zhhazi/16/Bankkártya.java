
import java.util.ArrayList;
import java.util.List;
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
public class Bankkártya {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {
            for (int i = 0; i < sor.length(); i++) {
                int szam = Integer.parseInt(""+sor.charAt(i));
                li.add(szam);
            }
//                System.out.println("lista:");
//                for( Integer i:li){
//                    System.out.println(i);
//                }
            boolean paros = true;
            int összeg = 0;
            for (Integer i : li) {
                if (paros) {
                    i = 2 * i;
                    if (i > 9) {
                        i -= 9;
                    }
                }
                összeg += i;
                paros = !paros;
            }
            
            if (összeg % 10 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
            sor = sc.nextLine();
        }

    }

}
