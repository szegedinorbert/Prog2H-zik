/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Szótár {
    
    private String angol;
    private String magyar;

    public Szótár(String angol, String magyar)
    {
        this.angol = angol;
        this.magyar = magyar;
    }

    public String getAngol() 
    {
        return angol;
    }

    public String getMagyar() 
    {
        return magyar;
    }

    @Override
    public String toString() 
    {
        return  angol + ":" + magyar ;
    } 
}

