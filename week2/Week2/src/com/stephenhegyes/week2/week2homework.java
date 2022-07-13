package com.stephenhegyes.week2;

public class week2homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 17;
		boolean hasLicense = true;
		System.out.println(age >= 16);
		
		//using a conditional, print "you can drive" if age is greater than or equal to 16
		//and "you cannot drive" otherwise
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive");
		}	else  {
			System.out.println("you cannot drive");
		}
		//add a new variable called hasLicense before the conditional
		//change the boolean expression in the conditional to additionall include the need for hasLicense to be true
		//
		//create two new variables - costOfMilk and thirstLevel
		//create new conditional that prints "Milk Please" if costOfMilk is less than 2.50
		//or if thirstLevel iss greater than 6 and prints "no Thanks" otherwise
		
		double costOfMilk = 5;
		int thirstLevel = 2;
				
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}
		
		//create two variables called numberOfCookies and numberOfChildren
		//you will evenly distribute all of the cookies to the children and as the adult
		//you get to keep the remaining cookies to yourself
		//use a conditional to print the following based on the following conditions
		//if there are 0 cookies remaining, print "Sad Face"
		//if there are less than 2 cookies, print "Yes!"
		//if there are less than 5 cookies, print "whoohoo!"
		//if there are 5 or more cookies print "Jackpot!"
		
		double numberOfCookies = 20;
		double numberOfChildren = 3;
		
		if (numberOfCookies % numberOfChildren <= 0) {
			System.out.println("Sad Face");
		} else if (numberOfCookies % numberOfChildren < 2) {
			System.out.println("Yes!");
		} else if (numberOfCookies % numberOfChildren < 5) {
			System.out.println("Whoohoooo!");
		} else if (numberOfCookies % numberOfChildren >= 5) {
			System.out.println("Jackpot!");
		}
		
		//create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//create a variable called loyaltyMemberDiscount and assign the value 0.0
		//using a switch, set the value of loyaltyMemberDiscount based on the following loyaltyMemberStatus scale
		//"SILVER" is 0.10, "GOLD" is 0.15 and "PLATINUM" is 0.25
		
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;
		
		switch(loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = .1;
				break;
			case "GOLD":
				loyaltyMemberDiscount = .15;
				break;
			case "PLATIMUN":
				loyaltyMemberDiscount = .25;
		}
		
		System.out.println(loyaltyMemberDiscount);
		
		//create a variable called billTotal and assign a value
		//create a variable called adjustTotal amd assign it the billTotal minus the LoyaltyMemberDiscount percent of the billTotal
		//if the adjustedBillTotal is greater than $500 upgrade the loyaltyMemberStatus from SILVER to GOLD or GOLD to PLATINUM
		
		double billTotal = 645.20;
		double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
		System.out.println(adjustedTotal);
		
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
			} else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
			}
		}
		System.out.println(loyaltyMemberStatus);
	
	//create 2 variables, username and password
	//create a conditional that prints "login successfull" if the username is "Tommy123" and the password is "12345"
	//otherwise, print "access denied"
	
	
	String username = "Tommy123";
	String password = "12345"; 
		
	if (username.equals("Tommy123") && password.equals("12345")) {
		System.out.println("login successful");
	} else {
		System.out.println("access denied");
		
	}
	String randomWord = "outragous";
	
	if (randomWord.length() >= 10) {
		System.out.println("That is a really long word!");
	} else {
		System.out.println("Your word is not that long.");
	}
	
	
	//write a for loop that prints each number from 0 to 9
	for (int i = 0; i < 10; i++) {
		System.out.println(i);
	}
		
		//write a for loop that prints each number from 10 to 0 backwards
	for (int i = 10; i >= 0; i--) {
		System.out.println(i);
	}
	
	//write a while loop that starts at 100 and iterates backwards to 1 until it reaches 0
	
	
		//write a for loop that prints every other number from 0 to 100
	for (int i = 0; i < 100; i += 2) {
		System.out.println(i);
	}
		
		//write a for loop that iterates from 0 to 100 and prints "EVEN" of the number is 
	//

	
	//write a while loop that starts at 100 and iterates backwards to 1 until it reaches 0
	int x = 100;
	while (x < 100) {
		System.out.println(x);
		x--;
	}
	
	
	
	
	}
	
	
	
}
