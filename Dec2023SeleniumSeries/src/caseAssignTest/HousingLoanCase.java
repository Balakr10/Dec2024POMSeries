package caseAssignTest;

/*WAP to define the interest rate on the basis of Loan type using Switch Case
Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan */

public class HousingLoanCase {

	public static void main(String[] args) {
		
		String Loan = "Housing";
		int salary = 34999;
		
		switch(Loan) {
		case ("Housing"):{
			if (salary<35000) {
				System.out.println("The candidate is not eligible for housing loan");
				break;
			}else {
				System.out.println("please process the housing loan for 5%");
				break;
			}
		}
		case ("personal loan"):{
			System.out.println("please process the personal loan for 6%");
			break;
		}
		case ("Education Loan"):{
			System.out.println("please process the Education loan for 4%");
			break;
		}
		case ("Car Loan"):{
			System.out.println("please process the Car loan for 7%");
			break;
		}
		default:{
			System.out.println("The candidate not eligible for any loan");
			break;
		}
		}
		

	}

}
