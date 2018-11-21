/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Gyümölcs {
    
    private String fajta;
    private String íz;

    public Gyümölcs(String f, String i) 
    {
        this.fajta = f;
        this.íz = i;
    }
    
    public String milyenFajtaju()
    {
        return this.fajta;
    }
    public String milyenIzu()
    {
        return this.íz;
    }

    @Override
    public String toString() 
    {
        return "Gy\u00fcm\u00f6lcs{" + "fajta=" + fajta + ", \u00edz=" + íz + '}';
    }
   
}
