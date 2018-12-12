/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Rendeles implements Comparable<Rendeles> {

    private String nev;
    private String varosnev;
    private String utca;
    private int hazszam;
    private int ertek;

    public Rendeles(String nev, String varosnev, String utca, int hazszam) {
        this.nev = nev;
        this.varosnev = varosnev;
        this.utca = utca;
        this.hazszam = hazszam;
    }

    public int getErtek() {
        return ertek;
    }

    public String getNev() {
        return nev;
    }

    public String getVarosnev() {
        return varosnev;
    }

    public String getUtca() {
        return utca;
    }

    public int getHazszam() {
        return hazszam;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj==null || !(obj instanceof Rendeles)){
           return false;
       }
       Rendeles r=(Rendeles)obj;
       
       return varosnev.equals(r.getVarosnev()) && utca.equals(r.getUtca()) && hazszam==r.getHazszam();
    }

    @Override
    public String toString() {
       return varosnev+","+utca+" "+hazszam+"., "+nev+", "+ertek+" Ft";
    }
    

    @Override

    public int compareTo(Rendeles o) {
        if (varosnev.equals(o.getVarosnev())) {
            if (utca.equals(o.getUtca())) {
                if (hazszam == o.getHazszam()) {
                    if (nev.equals(o.getNev())) {
                        return -1 * Integer.compare(ertek, o.getErtek());

                    } else {
                        return nev.compareTo(o.getNev());
                    }
                } else {
                    return Integer.compare(ertek, o.getErtek());
                }

            }else{return utca.compareTo(o.getUtca());
            }
        }else{
            return varosnev.compareTo(o.getVarosnev());
        }
    }

}
