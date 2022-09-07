import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		for(int i = 0; i < 3; i++) {
			int count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			while(st.hasMoreTokens()) {
				if(Integer.parseInt(st.nextToken()) == 0) {
					count++;
				}
			}
			
			switch(count) {
			case 0: bw.write("E\n"); break;
			case 1: bw.write("A\n"); break;
			case 2: bw.write("B\n"); break;
			case 3: bw.write("C\n"); break;
			case 4: bw.write("D\n"); break;
			}
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}