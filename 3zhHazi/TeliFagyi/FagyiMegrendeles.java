/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class FagyiMegrendeles {

    private String fajta;
    private int ar;

    public FagyiMegrendeles(String fajta, int ar) {
        this.fajta = fajta;
        this.ar = ar;
    }

    public String getFajta() {
        return fajta;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return "FagyiMegrendeles{" + "fajta=" + fajta + ", ar=" + ar + '}';
    }

}
