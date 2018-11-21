
import java.util.ArrayList;
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
public class Parkoló implements Comparable<Parkoló> {

    private String cím;
    private double terület;
    private int kapacitás;
    private List<String> rendszam = new ArrayList();

    public Parkoló(String cím, double terület, int kapacitás, List<String> rendszam) {
        this.cím = cím;
        this.terület = terület;
        this.kapacitás = kapacitás;
        this.rendszam = rendszam;

    }

    public String getCím() {
        return cím;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    public double getTerület() {
        return terület;
    }

    public void setTerület(double terület) {
        this.terület = terület;
    }

    public int getKapacitás() {
        return kapacitás;
    }

    public void setKapacitás(int kapacitás) {
        this.kapacitás = kapacitás;
    }

    public List<String> getRendszam() {
        return rendszam;
    }

    public void setRendszam(List<String> rendszam) {
        this.rendszam = rendszam;
    }

    public int getSzabadHely() {
        return this.kapacitás - rendszam.size();
    }

    @Override
    public String toString() {

        return this.cím + ": " + this.getSzabadHely() + " szabad hely";

    }

    @Override
    public int compareTo(Parkoló t) {

        if (this.getSzabadHely() == t.getSzabadHely()) {
            return this.cím.compareTo(t.getCím());
        } else {
            return (-1) * Integer.compare(this.getSzabadHely(), t.getSzabadHely());
        }
    }

}
