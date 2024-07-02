package testCodeFirst;

public class TestAscii {

	public static void main(String[] args) {
		char a = 'h';
		int b = (byte)a;
		System.out.println(b);
		
		int x = 5;
        int y = 10;

        //&& short circuits for false
        if (x > 0 && y > 0 && x < y && x * 2 > y) {
            System.out.println("Hi");
        }
        
        //single Ampersand & short circuits only for true
        if (x > 0 & y > 0 & x < y ) {
            System.out.println("Hello");
        }
        
        boolean c = false;
        boolean d = true;
        
        boolean result = d && c;
        System.out.println(result);
        
        boolean resultVal = c & d;
        System.out.println(resultVal);
	}

}

//x * 2 > y
