package week2.day1;

public class FindDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num = {2,5,7,7,5,9,2,3};
		//num[0] =1
		for (int i = 0; i < num.length; i++) {
			//num[0+1] - num[1]=4 ---
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]);
				}

	}

		}
}
}