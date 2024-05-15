package caseAssignTest;

//WAP to launch browsers using If-ElseIf and Switch Case.
//Browser: Chrome/Firefox/IE/Safari
//If user passes wrong browser, print please pass the right browser name

public class BrowserTest {
	
	String Browser = null;
	
	void testa() {
		
		String Browser = "Safari";
		
		if (Browser == "Chrome") {
			System.out.println("Please launch chrome browser "+Browser);
		}else if(Browser == "Edge") {
			System.out.println("Please launch Edge browser "+Browser);
		} else if(Browser == "IE") {
			System.out.println("Please launch IE browser "+Browser);
		} else if(Browser == "Safari") {
			System.out.println("Please launch Safari browser "+Browser);
		} else {
			System.out.println("Please pass the right browser name "+Browser);
		}
	}
	
	void testb() {
		String Browser = "IE";
		switch("Browser") {
		case ("Chrome"):{
			System.out.println("Please launch chrome browser " +Browser);
			break;
		}
		case ("Edge"):{
			System.out.println("Please launch Edge browser "+Browser);
			break;
		}
		case ("IE"):{
			System.out.println("Please launch IE browser "+Browser);
			break;
		}
		case ("Safari"):{
			System.out.println("Please launch Safari browser "+Browser);
			break;
		}
		default: {
			System.out.println("Please pass the right browser name" +Browser);
			break;
		}
		}
		
	}
	public static void main(String[] args) {
		
		BrowserTest bt = new BrowserTest();
		bt.testa();
		bt.testb();
	}
}
