package caseAssignTest;

//WAP to book the specific type of car from the Uber app using Switch - Case. 
//Car Type: Mini, Sedan, SUV, Premium

public class CabBookingTest {

	public static void main(String[] args) {
		
		String C = "Premium";
		
		switch(C) {
		
		case "mini":
		{
			System.out.println("The cab choosen is "+C);
			break;
		}
		case "sedan":
		{
			System.out.println("The cab choosen is "+C);
			break;
		}
		case "SUV":
		{
			System.out.println("The cab choosen is "+C);
			break;
		}
		case "Premium":
		{
			System.out.println("The cab choosen is "+C);
			break;
		}
		default:{
			System.out.println("The cab choosen is invalid "+C);
			break;
		}
		}

	}

}
