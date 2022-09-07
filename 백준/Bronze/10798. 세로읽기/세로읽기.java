import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = new String[5];
		int long_length = 0;
		for(int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
			if(str[i].length() > long_length) {
				long_length = str[i].length();
			}
		}
		
		for(int i = 0; i < long_length; i++) {
			for(int j = 0; j < str.length; j++) {
				try {
					System.out.print(str[j].charAt(i));
				} catch(Exception e) {
					
				}
			}
		}
		
		br.close();
	}

}