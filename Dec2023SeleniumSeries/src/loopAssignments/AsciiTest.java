package loopAssignments;

//Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop
public class AsciiTest {

	public static void main(String[] args) {
		
		char Alp = 'a';
		int num  = 'a';
		int i=0;
		System.out.println(Alp+" "+num);
		
		while(i<=24) {
			System.out.println(++Alp +" "+ ++num);
			i++;
		
		if(i>24) {
			System.out.println("all the chars are printed");
			break;
		}
	}
	}
}
