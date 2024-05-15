package caseAssignTest;

public class Testwhiledo {

	public static void main(String[] args) {
		
		int j = 10;
		int k = 10;
		System.out.print("----for loop output----");
		for (int i = 10; i>=1; i--)
		{
			System.out.print(" "+i);		
		}
		System.out.print("----while loop output----");
		while(j>=1) {
			System.out.print(" "+j);
			j--;
		}
		System.out.print("----Do while loop output----");
		do {
			System.out.print(" "+k);
			k--;
		}
			while (k>=1);	
			
		}
	}

