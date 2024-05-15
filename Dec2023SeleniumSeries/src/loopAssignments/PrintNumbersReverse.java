package loopAssignments;

// Print the following series: 
//1.0 2.0 3.0  ...... 10.0 
//0 9 18 27 36 …99
public class PrintNumbersReverse {

	public static void main(String[] args) {
		
		int a = 0;
		float b = 1.0f;
		 for (b=1.0f; b<=10.0; b++) {
			 System.out.println("float numbers "+b);
		 }
		 while(a<=100) {
			 if(a%9==0) {
			 System.out.println(a);
		 }
			a++;
		 }
	}
}
