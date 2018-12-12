/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Tura {

	private String kezdo;
	private String veg;
	private int tav;
	
	public Tura(String all, int tav) {
		String[] s = all.split("-");
		this.kezdo = s[0];
		this.veg = s[1];
		
		this.tav = tav;
	}
	
	public String getKezdo() {
		return kezdo;
	}
	public void setKezdo(String kezdo) {
		this.kezdo = kezdo;
	}
	public String getVeg() {
		return veg;
	}
	public void setVeg(String veg) {
		this.veg = veg;
	}
	public int getTav() {
		return tav;
	}
	public void setTav(int tav) {
		this.tav = tav;
	}
}
