
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
public class Adatok implements Comparable<Adatok>{
    private int iranyitoszam;
    private List<Rendeles> r=new ArrayList<>();

    public Adatok(int iranyitoszam, List r) {
        this.iranyitoszam = iranyitoszam;
        this.r=r;
    }

    
    public int getIranyitoszam() {
        return iranyitoszam;
    }

    public List<Rendeles> getR() {
        return r;
    }
    public int getOsszegez(){
        int osszeg=0;
        for(int i=0;i<r.size();i++){
            osszeg=osszeg+ r.get(i).getErtek();
        }
        return osszeg;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj==null || !(obj instanceof Adatok)){
           return false;
       }
       Adatok a=(Adatok)obj;
       return iranyitoszam==a.getIranyitoszam();
    }
    

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(iranyitoszam).append(": ").append(getOsszegez()).append(" Ft\n");
        for(int i=0;i<r.size();i++){
            if(i<r.size()-1){
                sb.append(r.get(i)).append("\n");
            }else{
                sb.append(r.get(i));
            }
        }
        return sb.toString();
    }

    @Override
    public int compareTo(Adatok o) {
        return Integer.compare(iranyitoszam, o.getIranyitoszam());
    }
    
}
