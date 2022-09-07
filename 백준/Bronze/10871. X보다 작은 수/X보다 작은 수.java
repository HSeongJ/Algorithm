import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int num = scan.nextInt();
		
		int[] input = new int[count];
		
		for(int i = 0; i < count; i++) {
			input[i] = scan.nextInt();
			
			if(input[i] < num) {
				System.out.print(input[i] + " ");
			}
		}
		
	}
}

