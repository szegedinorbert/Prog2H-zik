/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Date;
import java.util.Objects;

public class Ital {
    
    protected String név;
    protected String kiszerelés;
    private static int ár=10;
    protected Date gyártásiDátum;
    
    public Ital(String név, String kiszerelés)
    {
        this.név= név;
        this.kiszerelés=kiszerelés;
        this.gyártásiDátum = new Date();    
    }
     
    public String getNév()
    {
        return név;
    }
    
    public String getKiszerelés()
    {
        return kiszerelés;
    }
    
    public static int getÁr()
    {
        return ár;
    }
    
    public Date getGyártásiDátum()
    {
        return gyártásiDátum;
    }
    
    public static void setÁr(int ár)
    {
        Ital.ár=ár;
    }
    
    @Override
    public String toString(){
        return this.név + "," + this.kiszerelés + "," + this.ár + " Ft";
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj)
        {
            return true;
        }
        if(this == null)
        {
            return false;
        }
        if(getClass() != obj.getClass())  
        {
            return false;
        }
        final Ital other = (Ital) obj;
        if(!Object.equals(this.név, other.név))
        {
           return false; 
        }
        if(!Object.equals(this.kiszerelés, other.kiszerelés))
        {
           return false; 
        }
        if(!Object.equals(this.ár, other.ár))
        {
           return false; 
        }
        return true;
    }
    public static void getÁrEuróban()
    {
        System.out.println((double)ár/308);
    }  
}
