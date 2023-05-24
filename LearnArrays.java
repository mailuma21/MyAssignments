package week2.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mark= {56,99,99,67,47,78,99,100};
		//length - property
		//ctrl+2
		 int length = mark.length;
		 System.out.println("total number:" +length);
		 System.out.println("---------------");
		 //mark[5]
		 System.out.println(mark[5]);
		 System.out.println("---------------");
		 //print last value
		 System.out.println(mark[length-1]);
		 System.out.println("---------------");
		 //sort - for printing use for loop
		 Arrays.sort(mark);
		 
		 //for loop ctrl+space
		 for (int i = 0; i < mark.length; i++) {
			 System.out.println(mark[i]);
			 System.out.println(mark[3]);
			System.out.println("---------------");
			 for (int j = mark.length-1; j >0; j--) {
				 System.out.println(mark[j]);
				
			}

	}

}
}
