package testCodeFirst;

// Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character
public class TestTwoAscii {

	public static void main(String[] args) {
		
		char a = 'd';
		int b = (byte)a;
		System.out.println("The final value:"+(b+3));

	}

}
