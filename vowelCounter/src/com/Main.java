package com;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		//Variables.
		Scanner scanner1 = new Scanner(System.in);
		String text;
		
		//Stating the purpose for the program and reading a line from the user.
		System.out.println("This is a vowel counter.");
		System.out.println("Enter a String for vowel-counting purposes.");
		text = scanner1.nextLine();

		//Counting vowels from the line.
		System.out.println("The number of vowels in your line is: " + countVowel(text));
		pressEnterToContinue();
		scanner1.close();
		System.out.println("The program has finished running...");
	}
	
	private static void pressEnterToContinue() {
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Press Enter key to continue...");
	    try
	    {
	        System.in.read();
	        scanner2.nextLine();
	    }  
	    catch(Exception e)
	    {}  
	    scanner2.close();
	}
	
	private static int countVowel(String line) {
		int vowelsNum = 0;
		String lineButLowerCase = line.toLowerCase();
		line.length();
		for(int i = 0; i < line.length(); i++) {
			if (
					lineButLowerCase.charAt(i) == 'a' || lineButLowerCase.charAt(i) == 'e' 
					||lineButLowerCase.charAt(i) == 'i' ||lineButLowerCase.charAt(i) == 'o' 
					||lineButLowerCase.charAt(i) == 'u' ) {
				vowelsNum++;
			}
		}
		return vowelsNum;
	}

}
