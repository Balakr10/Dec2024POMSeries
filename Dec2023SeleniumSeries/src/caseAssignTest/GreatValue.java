package caseAssignTest;

public class GreatValue {
	
	void test() {
		int a = 25;
		int b = 78;
		int c = 87;
		int d = 97;
		
		if ((a>b)&&(a>c)&&(a>d)) {
			System.out.println("Value of a is greater:"+a);
		} else if ((b>a) && (b>c) && (b>d)) {
			System.out.println("Value of b is greater:"+b);
		} else if ((c>a)&&(c>b)&&(c>d))
		{
			System.out.println("Value of c is greater:"+c);
		} else {
			System.out.println("Value of d is greater:"+d);
		}
	}

	public static void main(String[] args) {
		
		GreatValue gtv = new GreatValue();
		gtv.test();

	}

}
