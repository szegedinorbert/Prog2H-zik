/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Színész implements Comparable<Színész> {

    private String név;
    private int szülÉve;

    public Színész(String név, int szülÉve) {
        this.név = név;
        this.szülÉve = szülÉve;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getSzülÉve() {
        return szülÉve;
    }

    public void setSzülÉve(int szülÉve) {
        this.szülÉve = szülÉve;
    }

    @Override
    public int compareTo(Színész o) {

        if (this.szülÉve == o.getSzülÉve()) {
            return this.név.compareTo(o.getNév());

        }
        else
        {
        return Integer.compare(this.szülÉve, o.getSzülÉve());        
        }

    }

    @Override
    public String toString() {
        return this.szülÉve+": "+this.név;
    }
    
    

}
