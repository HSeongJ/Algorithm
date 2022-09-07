import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	static int result = 1;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		factorial(Integer.parseInt(br.readLine()));
		
		System.out.println(result);
		
		br.close();
	}
	
	public static int factorial(int N) {
		if(N == 0)
			return 0;
		else if( N > 1 )
			result *= N;
		
		return factorial(N - 1);
	}
}