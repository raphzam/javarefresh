package java_basics;

import java.util.Arrays;
import java.util.Scanner;

public class LearningArrays {

	public static void main(String[] args) {
		
		int[] values = new int[3];	 //		values = {100, 200, 300};
		
		values[0] = 100;
		values[1] = 200;
		values[2] = 300;
		
		
		
		System.out.println(Arrays.toString(values));
		
		int[] copy = values;
		
		copy[1] += 3;
		
		System.out.println(copy[1]);
		System.out.println(values[1]);
		
		String[] words = new String[] {"yes", "sir", "yellow"};
		
		String[] moreWords = {"my", "name", "is"};
		
		System.out.println(words[1]);
		System.out.println(moreWords[2]);
		
		//Print words array
		
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
		
		System.out.println();
		
//		Reverse words array
		
		for (int i = words.length-1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
		
//		Print words array using enhanced for loop
		
		System.out.println();
		
		for (String s : words) {
			System.out.print(s + " ");
		}
		
//		Print words using while loop
		
		System.out.println();
		
		int k = 0;
		while (k < words.length) {
			System.out.print(words[k] + " ");
			k++;
		}
		
//		Spell String
		
		System.out.println();
		String str = "reverse";
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
//		Reverse String
		
		System.out.println();
		
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(str);
		
		System.out.println("Reversing A String. Enter text: ");
		
		Scanner input = new Scanner(System.in);
		
		String userText = input.nextLine();
		
		System.out.println(reverseString(userText));
		
		
	}
	
	
	
	public static String reverseString(String str) {
		
		String output = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			output = output + str.charAt(i);
		}
		
		return output;
		
	}

}
