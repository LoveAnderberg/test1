package org.lu.ics.labbar;

import java.util.Scanner;

public class Lab1app {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String name;
		
		System.out.print("Input 1: ");
		name = stdIn.nextLine();
		
		String surname;
		
		System.out.print("Input 2: ");
		surname = stdIn.nextLine();
		
		System.out.println();
		System.out.println(surname + " " + name);
		
		stdIn.close();
	}

}
