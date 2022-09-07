import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int max = 0;
		
		int[] card = new int[N];
		
		for(int i = 0; i < N; i++) {
			card[i] = scan.nextInt();
		}
		
		for(int i = 0; i < N - 2; i++) {
			for(int j = i + 1; j < N - 1; j++) {
				for(int k = j + 1; k < N; k++) {
					if((card[i] + card[j] + card[k] <= M) && (card[i] + card[j] + card[k] > max)) {
						max = card[i] + card[j] + card[k];
					}
				}
			}
		}
		
		System.out.println(max);
	}

}