import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N != 1) {
			while(true) {
				for(int i = 2; i <= N; i++) {
					if(N % i == 0) {
						N /= i;
						bw.write(String.valueOf(i) + "\n");
						break;
					}
				}
				
				if(N == 1)
					break;
			}
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}