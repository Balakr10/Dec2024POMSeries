package loopAssignments;

public class Asciisecondprogram {

	public static void main(String[] args) {
		
					
			char Alp = 'A';
			int num  = 'A';
			int i=0;
			System.out.println(Alp+" "+num);
			
			while(i<=24) {
				System.out.println(++Alp+" "+ ++num);
				i++;
			
			if(i>24) {
				System.out.println("all the chars are printed");
				break;
			}
		}
		}
	}

