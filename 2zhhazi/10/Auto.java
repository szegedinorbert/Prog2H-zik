/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import java.util.Objects;

public class Auto implements Comparable<Auto> {

    private String rendszám;
    private int teljesítmény;
    private boolean automata;

    public Auto(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return "Auto:" + "rendszám:" + rendszám + ", teljesítmény:" + teljesítmény + ", automata:" + automata;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Auto)) {
            return false;
        }
        Auto a = (Auto) obj;

        return this.rendszám.equals(a.getRendszám());

    }

    @Override
    public int compareTo(Auto t) {
        return (-1)*Integer.compare(teljesítmény, t.getTeljesítmény());

    }
    
    public boolean getSzabáyos() {
        if (this.rendszám.length() == 6) {
            for (int i = 0; i < 3; i++) {
                char a = this.rendszám.charAt(i);
                if (Character.isUpperCase(a)) {
                    for (int j = 3; j < 6; j++) {
                        char szam = this.rendszám.charAt(j);
                        Character.isDigit(szam);

                    }

                }
            }
            return true;
        }else{
            return false;
        }
       
    }
}