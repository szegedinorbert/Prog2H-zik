
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
public class Molekula {
    private String vegyjel;
    private String elemnév;
    private String molekulanév;
    private List<String> vegyjel2=new ArrayList();

    public Molekula(String vegyjel, String elemnév) {
        this.vegyjel = vegyjel;
        this.elemnév = elemnév;
    }

    public Molekula(String molekulanév, List<String> vegyjel2) {
        this.molekulanév = molekulanév;
        this.vegyjel2 = vegyjel2;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public void setVegyjel(String vegyjel) {
        this.vegyjel = vegyjel;
    }

    public String getElemnév() {
        return elemnév;
    }

    public void setElemnév(String elemnév) {
        this.elemnév = elemnév;
    }

    public String getMolekulanév() {
        return molekulanév;
    }

    public void setMolekulanév(String molekulanév) {
        this.molekulanév = molekulanév;
    }

    public List<String> getVegyjel2() {
        return vegyjel2;
    }

    public void setVegyjel2(List<String> vegyjel2) {
        this.vegyjel2 = vegyjel2;
    }

    @Override
    public String toString() {
        return "Molekula{" + "vegyjel=" + vegyjel + ", elemn\u00e9v=" + elemnév + ", molekulan\u00e9v=" + molekulanév + ", vegyjel2=" + vegyjel2 + '}';
    }

}
