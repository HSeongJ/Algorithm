import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int[] num = new int[input];
		
		int min = 1000001;
		int max = -1000001;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		for(int i = 0; i < num.length; i++) {
			if(max <= num[i]) {
				max = num[i];
			}
			
			if(min >= num[i]) {
				min = num[i];
			}
		}
		
		System.out.println(min + " " + max);
	}
}
