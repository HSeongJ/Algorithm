import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str = new String(br.readLine());
		
		int sum = 0;
		
		for(int i = 1; i <= N; i++) {
			sum += str.charAt(i-1) - '0';
		}
		
		System.out.println(sum);
		
		br.close();
	}

}
