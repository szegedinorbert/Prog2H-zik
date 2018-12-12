
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Személy {

	private String nev;
	private  ArrayList<Tura> li  = new ArrayList<Tura>();
	
	public Személy(String nev) {
		this.nev = nev;
	}
	
	public void addNewTura(Tura t) {
		li.add(t);
	}
	
	public void printTurak() {
		System.out.println(nev + " túrái:");
		for (Tura tura : li) {
			System.out.println(tura.getKezdo() + "-" + tura.getVeg() + " [" + tura.getTav()+"]");
		}
		System.out.println();
	}

	public String getNev() {
		return nev;
	}
	
	private void utvonalRagasztas() {
		
		ArrayList<Tura> smallLi = new ArrayList<Tura>();
		boolean change = false;
		
		for (Tura tura1 : li) {	
			for (Tura tura2 : li) {
				
				if(tura1.getVeg().contains(tura2.getKezdo())) {
					String a = tura1.getKezdo() + "-" + tura2.getVeg();
					Tura t = new Tura(a, tura1.getTav() + tura2.getTav());
					smallLi.add(t);
					change = true;
				}
			}	
		}
		
		for (Tura tura : smallLi) {
			li.add(tura);
		}		
	}
	
	public int leghosszabbTura() {	
		int oldSize = li.size();
		for(int i = 0; i < oldSize; i++) {
			utvonalRagasztas();}
		
		int max = 0;
		for (Tura tura : li) {
			if(tura.getTav() > max) max = tura.getTav();
		}
		return max;
	}
}
