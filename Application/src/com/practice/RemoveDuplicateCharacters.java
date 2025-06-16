//WAP in java to remove the duplicate characters of the given string "the system is woking properly"
package com.practice;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {
	
	public static void main(String[] args) { //main method will executes the program
		String input = "the system is woking properly"; 
		String result = removeDuplicates(input);
		System.out.println("After removing duplicate characters from the string :" + result);
	}

	private static String removeDuplicates(String input) { // private Access specifier method can be accessed only within the same class
		LinkedHashSet<Character> charSet = new LinkedHashSet<>(); //LinkedHashSet is a great choice for this program due to its ability to store unique elements while preserving order.
		StringBuilder sb = new StringBuilder(); //The StringBuilder optimizes string modifications, making it efficient. 
		
		for(char ch : input.toCharArray()) { // input.toCharArray() converts the input string into a character array.
			if(!charSet.contains(ch)) { //checks whether the character (ch) is already present in the LinkedHashSet
				charSet.add(ch);
				sb.append(ch);
			}	
		}
		
		return sb.toString();
	}
}
