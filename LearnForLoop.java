package week1.day2;

public class LearnForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for - ctrl+space
				// i=0 starting number i<10 - till what number we need to complete i++ increment
				int n = 10;
				for (int i = 0; i <=n; i++) {
					System.out.println(i);
					
				}
				System.out.println("--------------");
				
				for (int i = n; i>=0 ; i--) {
					System.out.println(i);
					
				}
				System.out.println("-----------");
			for (int i = n; i >=0 ; i--) {
				if (i==6) {
					System.out.println("i reached 6");
					break;
				}
				System.out.println(i);
				
				
			}	
			System.out.println("---------");
			
			for (int i = 0; i <n ; i++) {
				if(i==8) {
				System.out.println("i reached"+i);
				continue;
			}
			System.out.println(i);
			}
			System.out.println("------------------");
			}

			







	}


