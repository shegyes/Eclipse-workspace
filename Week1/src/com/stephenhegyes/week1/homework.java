package com.stephenhegyes.week1;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Week 1 Lab part 1
		int planeSeatsAvailable = 5;
		double costOfGroceries = 60.17;
		char middleInitial = 'r';
		boolean isHotOutside = false;
		String firstName = "Joshy";
		String address = "506 Smith St";
		System.out.println(planeSeatsAvailable);
		System.out.println(costOfGroceries);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(firstName);
		System.out.println(address);
		
	//Week 1 Lab part2 	
		costOfGroceries +=2;
		System.out.println(costOfGroceries);
	//birth certificate was printed incorrectly, change the middle initial
		middleInitial = 'C';
		System.out.println(middleInitial);
	//the season has changed, update the hot outside variable to be opposite of what it is
		//isHotOutside = true;  //hard coded way
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside);
	//create a new variable called full name using the customer's first name, middle initial, and a last name of your choice.
		String fullName = firstName + " " + middleInitial + " " + "Smith";
		System.out.println(fullName);
	//print a line to the console that introduces the customer and says they live at the address variable
		String whereCustomerLives = "This is Joshy. Joshy lives at " + address;
		System.out.println(whereCustomerLives);
	
		
		
		
		
		
		

	}

}
