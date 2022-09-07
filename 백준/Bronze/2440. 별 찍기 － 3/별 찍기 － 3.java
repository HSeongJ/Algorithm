import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		for(int i = 0; i < N; i++) {
			for(int j = i; j < N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}