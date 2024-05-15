package arraysconcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysSecondProgram {

	public static void main(String[] args) {
		
		ArrayList<String> colours = new ArrayList<String>(Arrays.asList("Red","Blue","Green","white","Green"));
		
		System.out.println(colours);
		System.out.println(colours.indexOf("Blue"));
		//non existing element throws -1 as index
		System.out.println(colours.indexOf("Grey"));

		ArrayList<String> subcol = new ArrayList<String>(colours.subList(0,4));
		
		System.out.println(subcol);
		
		ArrayList<String> clist = new ArrayList<String>();
		clist.addAll(subcol);
		
		System.out.println(clist);
		System.out.println(clist.containsAll(subcol));
		
		ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        
        System.out.println(colors.size());
        
        colors.trimToSize();
        System.out.println(colors.size());
	}

}
