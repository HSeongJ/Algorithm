import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		int kg5 = (N-1) / 5 + 1;
		int kg3 = (N-1) / 3 + 1;
		int result = -1;
		
		for(int i = 0; i <= kg5; i++) {
			for(int j = 0; j <= kg3; j++) {
				if(N == i*5 + j*3) {
					result = i + j;
				}
			}
		}
		System.out.println(result);
	}
}