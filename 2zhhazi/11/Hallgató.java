/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Hallgató extends Személy{
    private double átlag;

    public Hallgató(String név, int életkor, boolean férfi,double átlag) {
        super(név, életkor, férfi);
        this.átlag=átlag;
    }

    public double getÁtlag() {
        return átlag;
    }

    @Override
    public String toString() {
        return this.név+"\n"+this.életkor+"\n"+super.isFérfi()+"\n"+this.átlag;
    }
    public boolean joE(){
        
        if(this.átlag>=4.0){
            return true;
        }else{
            return false;
        }
    }
}
    
    
    
