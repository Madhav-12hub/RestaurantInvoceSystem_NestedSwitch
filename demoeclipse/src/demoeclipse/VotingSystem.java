package demoeclipse;

import java.util.Scanner;

public class VotingSystem {
	public static void main(String [] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter You Age...");
		int age=Sc.nextInt();
		
		System.out.println("Are you a Indian Citizien...");
		boolean indianCitizen=Sc.nextBoolean();
		
		System.out.println("Have you Ever Voted...");
		boolean hasVoted=Sc.nextBoolean();
		
		if(age>0) {
			System.out.println("Invalid");
		}else if(age < 18) {
			System.out.println("Not Eligible");	
		}else if(!indianCitizen) {
			System.out.println("Your Are not indian Citizen");
		}else if(hasVoted) {
			System.out.println("you have alredy vouted");
		}
		else {
			System.out.println("please Check the eligibility");
		}
		
	}

}
