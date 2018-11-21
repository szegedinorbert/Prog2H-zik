/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public abstract class AlkoholosItal extends Ital implements Alkoholos{
    
    private String íz;
    private double alkoholTartalom;
    
    public AlkoholosItal(String i,double a)
    {
        this.íz=i;
        this.alkoholTartalom=a;
    }
    
    @Override
    public double mennyiAlkoholtTartalmaz()
    {
        return alkoholTartalom;
    }
    @Override
    public String milyenIzu()
    {
        return íz;
    }

    @Override
    public String toString() 
    {
        return "AlkoholosItal{" + "\u00edz=" + íz + ", alkoholTartalom=" + alkoholTartalom + '}';
    }
}
