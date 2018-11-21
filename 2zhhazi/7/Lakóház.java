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

public class Lakóház implements Comparable<Lakóház>{
    
    public static final double emeletMagasság=3.2;
    private String cím;
    private int emeletekSzáma;
    private double alapterület;

    public Lakóház(String cím, int emeletekSzáma, double alapterület) 
    {
        this.cím = cím;
        this.emeletekSzáma = emeletekSzáma;
        this.alapterület = alapterület;
    }

    public String getCím() 
    {
        return cím;
    }

    public int getEmeletekSzáma() 
    {
        return emeletekSzáma;
    }

    public double getAlapterület() 
    {
        return alapterület;
    }
    
    public double légköbméter()
    {
        return this.alapterület*this.emeletekSzáma*emeletMagasság;
    }

    public void setAlapterület(double alapterület) {
        this.alapterület = alapterület;
    }
    

    @Override
    public String toString() 
    {
        StringBuilder sb=new StringBuilder();
        sb.append(this.cím).append(":\n");
        sb.append(this.légköbméter());
        
        return sb.toString();
    }

    @Override
    public int compareTo(Lakóház o) {
        
        return Double.compare(this.légköbméter(),o.légköbméter());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
    
    //cím alapján hasonlítunk
    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Lakóház)) 
        
            return false;
            Lakóház l=(Lakóház) obj;
            
            return this.cím.equals(l.getCím());
        }     
}
