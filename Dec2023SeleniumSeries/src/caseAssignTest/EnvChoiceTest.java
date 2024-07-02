package caseAssignTest;

public class EnvChoiceTest {

	public static void main(String[] args) {
		
		String Env = "prod";
		
		switch(Env)
		{
		case "QA": 
			System.out.println("Environment choosen to execute test is "+Env);
			break;
		
		case "Dev":
		
			System.out.println("Environment choosen to execute test is "+Env);
			break;
		
		case "prod":
			System.out.println("Environment choosen to execute test is "+Env);
			break;
		
		case "UAT": 
			System.out.println("Environment choosen to execute test is "+Env);
			break;
		
		default:
			System.out.println("Environment choosen is invalid");
			break;
		

	}

}
}
