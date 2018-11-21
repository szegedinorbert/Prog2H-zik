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

public class Zh implements Comparable<Zh>{
    private String név;
    private int pont;

    public Zh(String név, int pont) {
        this.név = név;
        this.pont = pont;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Zh)){
            return false;
        }
        Zh z=(Zh)obj;
        return this.név.equals(z.getNév());
    }

    @Override
    public String toString() {
        return this.név+": "+this.pont+" pont";
    }

    @Override
    public int compareTo(Zh t) {
        if(this.pont==t.getPont()){
            return this.név.compareTo(t.getNév());
        }else{
            return (-1)*Integer.compare(this.pont, t.getPont());
        }
    
    }
    
    
    
    
}
