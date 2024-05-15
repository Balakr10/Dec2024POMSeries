package testCodeFirst;

public class TestIncrDecr {

	void methodone()
	{
		int i = 11;
		
		i = i++ + ++i;
		
		System.out.println(i);
	}
	
	void add() {
		
         int a=11, b=22, c;
		
		c = a + b + a++ + b++ + ++a + ++b;
		//c = 11 + 22 + 11(12) + 22(23) + 13 + 24 = 103
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
   	 
    }
	
	void num() {

		int j = 0;
		j = j++ - --j + ++j - j--;
		System.out.println(j);
	}
	
	void calc() {
		
			int i=1, j=2, k=3;
			int m = i-- - j-- - k--;
             System.out.println("i="+i);
             System.out.println("j="+j);
             System.out.println("k="+k);
             System.out.println("m="+m);
	}
	
	void charn()
	     {
		int ch = 'A';
		char ca = 'A';
		System.out.println(ch++);
		System.out.println(++ca);
	     }

	public static void main(String[] args) { 
		
		TestIncrDecr cal = new TestIncrDecr();
		cal.add();
		cal.methodone();
		cal.num();
		cal.calc();
		cal.charn();
		
	}

// i = 11 + 13(12+1)
// 11 + 13
         
	}
