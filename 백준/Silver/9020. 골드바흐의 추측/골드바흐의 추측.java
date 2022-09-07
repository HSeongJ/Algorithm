import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++ ) {
			int n = Integer.parseInt(br.readLine());
			
			int first = n / 2;
			int second = n / 2;
			
			while(true) {
				boolean sosu = true;
				
				for(int j = 2; j <= (int)Math.sqrt(first); j++) {
					if(first % j == 0) {
						sosu = false;
						break;
					}
				}
				for(int j = 2; j <= (int)Math.sqrt(second); j++) {
					if(second % j == 0) {
						sosu = false;
						break;
					}
				}
				
				if(sosu) {
					System.out.println(first + " " + second);
					break;
				} else {
					first--;
					second++;
				}
			}
		}
			
		br.close();
	}

}