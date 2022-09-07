import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int R = Integer.parseInt(br.readLine());
		
		double pi = Math.PI;
		
		System.out.printf("%.6f\n", pi * R * R);
		System.out.printf("%.6f\n", (double)2 * R * R);
		
		br.close();
	}

}