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
import java.util.List;
import java.util.Objects;

public class Könyvek implements Comparable<Könyvek>{
    
    private String cím;
    private int kiadásiév;
    private List<String> szerzo;

    public Könyvek(String cím, int kiadásiév) {
        this.cím = cím;
        this.kiadásiév = kiadásiév;
        this.szerzo=new ArrayList<>();
    }

    public List<String> getSzerzo() {
        return szerzo;
    }

    public String getCím() {
        return cím;
    }

    public int getKiadásiév() {
        return kiadásiév;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.cím);
        hash = 41 * hash + this.kiadásiév;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Könyvek)) {
            return false;
        }
        
        Könyvek k=(Könyvek) obj;
        
        return this.cím.equals(k.getCím()) && this.szerzo.equals(k.getSzerzo());
    }

    @Override
    public int compareTo(Könyvek t) {
        if(this.kiadásiév==t.getKiadásiév()) {
            if(this.szerzo.size()==t.getSzerzo().size()) {
                return this.cím.compareTo(t.getCím());
            }
            else{
                return (-1)*Integer.compare(this.szerzo.size(), t.getSzerzo().size());
            }
        }
        
        else {
            return Integer.compare(this.kiadásiév, t.getKiadásiév());
        }
        
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<this.szerzo.size();i++) {
            if(i<this.szerzo.size()-1) {
                sb.append(this.szerzo.get(i)).append(", ");
            }
            else{
                sb.append(this.szerzo.get(i));
            }
            
        }
        if(!this.szerzo.isEmpty()) {
             sb.append(": ");
        }
        sb.append(this.cím);
        sb.append(" (").append(this.kiadásiév).append(")");
        
        return sb.toString();
    }    
}
