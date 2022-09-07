import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0)
				break;
			
			int count = 0;
			
			
			for(int i = n + 1; i <= n*2; i++) {
				boolean sosu = true;
				
				if(i == 1)
					continue;
				
				for(int j = 2; j <= Math.sqrt(i); j++) {
					if(i % j == 0) {
						sosu = false;
						break;
					}
				}
				
				if(sosu)
					count++;
			}
			
			bw.write(String.valueOf(count) + "\n");
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}