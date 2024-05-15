package loopAssignments;

//Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
public class LoopTest2 {

	public static void main(String[] args) {
		
		int i = 1;
		while(i<=10) {
			System.out.print(" "+i);
			i++;
			if (i%7==0) {
				System.out.println("bye, see you tomorrow "+i);
				break;
			}
		}
	}
}
