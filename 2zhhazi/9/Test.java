
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

    public static void kiir(List<Hátizsák> lista) {
        for (Hátizsák i : lista) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        List<Hátizsák> li = new ArrayList();
        li.add(new Hátizsák("adidas", 5.0, 7, true));
        li.add(new Hátizsák("adidas", 5.0, 10, true));
        li.add(new Hátizsák("nike", 7.6, 5, true));
        li.add(new Hátizsák("puma", 82.2, 90, false));
        li.add(new Hátizsák("hw", 8.7, 5, true));
        Collections.sort(li);
        kiir(li);
    }
}