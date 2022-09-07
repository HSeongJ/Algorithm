import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String rs = new String(br.readLine());
			
			String[] rs_sub = rs.split(" ");
			
			for(int j = 0; j < rs_sub[1].length(); j++) {
				for(int k = 0; k < Integer.parseInt(rs_sub[0]); k++) {
					System.out.print(rs_sub[1].charAt(j));
				}
			}
			System.out.println();
		}
		
		
	}

}