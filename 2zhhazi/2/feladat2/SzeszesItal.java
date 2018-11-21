/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat2;

/**
 *
 * @author user
 */
public class SzeszesItal extends Ital {

    private int alkoholTartalomtujaldonsag;

    public SzeszesItal(int alkoholTartalomtujaldonsag, String név, String kiszerelés, int ár) 
    {
        super(név, kiszerelés, ár);
        this.alkoholTartalomtujaldonsag = alkoholTartalomtujaldonsag;
    }

    public void setAlkoholTartalomtujaldonsag(int alkoholTartalomtujaldonsag)
    {
        this.alkoholTartalomtujaldonsag = alkoholTartalomtujaldonsag;
    }

    public int getAlkoholTartalomtujaldonsag() 
    {
        return alkoholTartalomtujaldonsag;
    }

    @Override
    public String toString()
    {

        return this.alkoholTartalomtujaldonsag + "% alkoholtartalmú "+super.toString();

    }

}
