/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ErjedtGyumolcs extends Gyümölcs implements Alkoholos{
    
    private double alkoholTartalom;

    
    public ErjedtGyumolcs(String f, String i,double a)
    {
        super(f,i);
        this.alkoholTartalom = a;
    }

    @Override
    public double mennyiAlkoholtTartalmaz()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() 
    {
        return "ErjedtGyumolcs{" + "alkoholTartalom=" + alkoholTartalom + '}';
    }      
}
