import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int num = 665;
		while(true) {
			if(N == 0)
				break;
			
			num++;
			
			String str = String.valueOf(num);
			
			int[] check = new int[str.length()];
			
			for(int i = 0; i < check.length; i++) {
				check[check.length - i - 1] = Character.getNumericValue(str.charAt(i));
			}
			
			for(int i = 0; i < check.length - 2; i++) {
				if(check[i] == 6 && check[i] == check[i+1] && check[i] == check[i+2]) {
					N--;
					break;
				}
			}
		}
		
		System.out.println(num);
		
		br.close();
	}

}