package com.example.project;
import java.util.Scanner;
public class CreatingObjects {

	    public static void main(String[] args) {
	    	
	        Scanner input1 = new Scanner(System.in);
	        Scanner input2 = new Scanner(System.in);
	        Scanner input3 = new Scanner(System.in);
	        Scanner input4 = new Scanner(System.in);
	        Scanner input5 = new Scanner(System.in);
	        
	        System.out.print("Enter your name: ");
	        String name = input1.nextLine();

	        System.out.print("Enter your age: ");
	        int age = input2.nextInt();

	        System.out.print("Enter your favorite number: ");
	        double favoriteNumber = input3.nextDouble();

	        System.out.print("Enter a city name: ");
	        String city = input4.nextLine();

	        System.out.print("Enter your favorite letter: ");
	        char favoriteLetter = input5.next().charAt(0);

	        System.out.println("\nCollected Data:");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Favorite Number: " + favoriteNumber);
	        System.out.println("City: " + city);
	        System.out.println("Favorite Letter: " + favoriteLetter);

	        input1.close();
	        input2.close();
	        input3.close();
	        input4.close();
	        input5.close();
	    }


}
