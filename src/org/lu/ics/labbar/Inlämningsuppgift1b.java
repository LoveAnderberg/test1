package org.lu.ics.labbar;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Inl�mningsuppgift1b {

	public static void main(String[] args) {
	
		DecimalFormat d2 = new DecimalFormat("#.00");
		Scanner stdIn = new Scanner (System.in);
		String namn;
		float timlon;
		float timmar;
		
		System.out.print("Ange ditt namn: ");
		namn = stdIn.nextLine();
	    
		
		System.out.print("Ange din timl�n: ");
		timlon = stdIn.nextFloat();
		
		
		System.out.print("Ange antal timmar: ");
		timmar = stdIn.nextFloat();
		
		System.out.println();
		System.out.println(namn.toUpperCase() + " du tj�nade " + d2.format(timmar * timlon) + " kr f�rra veckan");
		
		stdIn.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
