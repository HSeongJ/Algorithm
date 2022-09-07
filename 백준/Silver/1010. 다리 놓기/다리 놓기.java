import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			long result = 1;
			int west = Integer.parseInt(st.nextToken());
			int east = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < west; i++) {
				result *= east-i;
				result /= i + 1;
			}
		
			System.out.println(result);
			
		}
		
		br.close();
	}

}