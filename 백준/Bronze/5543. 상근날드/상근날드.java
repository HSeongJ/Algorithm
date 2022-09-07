import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int[] a = {Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())};
		int[] b = {Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())};
		
		int min = 4000;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j< b.length; j++) {
				if(a[i] + b[j] < min) {
					min = a[i] + b[j];
				}
			}
		}
		System.out.println(min - 50);
	
		br.close();
	}

}