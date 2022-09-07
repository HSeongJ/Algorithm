import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = 10001;
		
		for(int i = M; i <= N; i++) {
			boolean sosu = true;
			
			if(i == 1) {
				continue;
			}
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					sosu = false;
					break;
				}
			}
			
			if(sosu) {
				sum += i;
				if(min > i)
					min = i;
			}
		}
		
		if(sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		br.close();
		
	}

}