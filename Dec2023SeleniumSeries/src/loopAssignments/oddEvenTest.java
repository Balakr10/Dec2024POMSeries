package loopAssignments;

//6. Print all odd and even numbers between 1 to 100
public class oddEvenTest {

	public static void main(String[] args) {
		
		for (int i=0; i<=100; i++) {
			if (i%2==0) {
				System.out.println("the number is even number "+i);
			} else if(i%2!=0) {
				//System.out.println("the number is odd number "+i);
			}
		}
	}
}
