import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		
		String[] data = input.split(" ");
		
		int A = Integer.parseInt(data[0]);
		int B = Integer.parseInt(data[1]);
		int C = Integer.parseInt(data[2]);
		
		if(B >= C) {
			bw.write(String.valueOf(-1));
		}
		else {
			bw.write(String.valueOf((A / (C - B)) + 1));
		}
		br.close();
		
		bw.flush();
		bw.close();
	}

}