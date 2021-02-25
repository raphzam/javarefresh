package java_basics;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		
		boolean hungry = true;
		
		if (hungry) {
			System.out.println("I'm starving");
		} else {
			System.out.println("I'm not hungry");
			
		}
		
		int hungerRating = 5;
		
		if ( (hungerRating < 6 )) {
			System.out.println("Not hungry");
		} else {
			System.out.println("I'm starving");
		}
		
		Scanner input = new Scanner(System.in);
		
		int favoriteTemp = 75;
		System.out.println("What is the current temperature?");
		int currentTemp = input.nextInt();
		String opinion = "";
		
		if(favoriteTemp != currentTemp) {
		
		if (currentTemp < favoriteTemp - 30) {
			opinion = "It's pretty darn cold";
		} else if (currentTemp < favoriteTemp - 20) {
			opinion = "It's kind of cold out";
		} else if (currentTemp > favoriteTemp + 10) {
			opinion = "It's hot out";
		} else {
			opinion = "It's a beautiful day ...";
		}
		
		System.out.println(opinion);
		} else {
			opinion = "it's a PERFECT day";
		}
		
		System.out.println(opinion);
		
		
		
		int month = 13;
		
		String monthString;
		
		switch (month) {
		case 1: 
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4: 
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11: 
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
			default:
				monthString = "invalid month";
		}
		
		System.out.println(monthString);
		
		
	

	}

}
