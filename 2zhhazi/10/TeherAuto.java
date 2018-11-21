/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class TeherAuto extends Auto{
    private int teherbiras;

    public TeherAuto(String rendszám, int teljesítmény, boolean automata,int teherbiras) {
        super(rendszám, teljesítmény, automata);
        this.teherbiras=teherbiras;
    }

    public int getTeherbiras() {
        return teherbiras;
    }

    @Override
    public String toString() {
        return super.toString()+", teherbírás:"+this.teherbiras;
    }
    
    
    
    
}
