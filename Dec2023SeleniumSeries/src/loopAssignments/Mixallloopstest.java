package loopAssignments;

//Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
public class Mixallloopstest {

	public static void main(String[] args) {
		
		System.out.println("The result of for loop");
		for (int a=0; a<=100; a++) {
			if (a%5 ==0) {
				System.out.println(a);
			}
		}
		int b = 0;
		System.out.println("The result of while loop");
		while(b<=100) {
			if(b%5==0) {
			System.out.println(b);
			}
			b++;
		}
		int c = 0;
		System.out.println("The do while loop started");
		do { 
			c++;
			if(c%5==0) {
				System.out.println(" "+c);
			}	
		}
		while(c<=100);
	}
}
		
		

