import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			String str = br.readLine();
			
			String[] str1 = str.split(" ");
			
			int[] first = {Integer.parseInt(str1[0]), Integer.parseInt(str1[1]), Integer.parseInt(str1[2])};
			int[] second = {Integer.parseInt(str1[3]), Integer.parseInt(str1[4]), Integer.parseInt(str1[5])};
			
			int distance = (int)(Math.pow(first[0] - second[0], 2) + Math.pow(first[1] - second[1], 2));
			
			if(first[0] == second[0] && first[1] == second[1] && first[2] == second[2])
				bw.write(String.valueOf(-1 + "\n"));
			else if((distance > Math.pow(first[2] + second[2], 2))
					|| distance < Math.pow(first[2] - second[2], 2))
				bw.write(String.valueOf(0 + "\n"));
			else if((distance == Math.pow(first[2] + second[2], 2))
					|| distance == Math.pow(first[2] - second[2], 2))
				bw.write(String.valueOf(1 + "\n"));
			else
				bw.write(String.valueOf(2 + "\n"));
		}
		br.close();
		
		bw.flush();
		bw.close();
	}
}