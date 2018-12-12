
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Test {

	public static ArrayList<Személy> személyLi = new ArrayList<Személy>(); 
	
	public static boolean exist(String name) {
		for (Személy sz : személyLi) {
			if(sz.getNev().contains(name)) {
				return true;
			}
		}
		return false;
	}
	
	public static void increase(String name, String tura, int tav) {
		for (Személy sz : személyLi) {
			if(sz.getNev().contains(name)) {
				sz.addNewTura(new Tura(tura, tav));
			};
		}
	}
	
	public static void read(File f) throws FileNotFoundException {
		Scanner sc =  new Scanner(f);
		while(sc.hasNextLine()) {			
			
			String line = sc.nextLine();
			String[] l = line.split(":");
			
			String nev = l[0];
			String tura = l[1];
			int tav = Integer.parseInt(l[2]);
			
			if(személyLi.size() == 0) {
				Személy sz = new Személy(nev);
				sz.addNewTura(new Tura(tura, tav));
				személyLi.add(sz);
				
			} else if(exist(nev)) {
				increase(nev, tura, tav);
			}
			else {
				Személy p = new Személy(nev);
				p.addNewTura(new Tura(tura, tav));
				személyLi.add(p);
			}
		}
	}
	
	public static void main(String[] args) {

		File f = new File("sample.txt");
		
		try {
			read(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for (Személy p : személyLi) {
				//p.printTurak();
			System.out.println(p.getNev() + " " + p.leghosszabbTura());
		}

	}

}
