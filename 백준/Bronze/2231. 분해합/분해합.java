import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int num = 0;
		boolean tf = false;
		
		for(int i = 1; i < N; i++) {
			num = i;
			String temp = String.valueOf(i);
			
			for(int j = 0; j < temp.length(); j++) {
				num += Character.getNumericValue(temp.charAt(j));
			}
			
			if(num == N) {
				System.out.println(i);
				tf = true;
				break;
			}
		}
		
		if(!tf)
			System.out.println(0);		
		
		br.close();
	}
}