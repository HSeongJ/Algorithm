import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int first = 0;
		int second = 1;
		
		for(int i = 1; i < n; i++) {
			int temp = second;
			
			second += first;
			first = temp;
		}
		
		System.out.println(second);
		
		br.close();
	}

}