package arraysconcept;

import java.util.Arrays;

public class FirstArraysProgram {

	public static void main(String[] args) {
		
		int p[] = {1,4,5,2,3,22,31, 2}; 
		int[] a = new int[p.length-1];

		int j = 0;
		for (int i = 0; i < p.length; i++) {
		    if (p[i] != 22) {
		        a[j] = p[i];
		        j++;
		    }
		}

		System.out.println(Arrays.toString(a));

	}

}
