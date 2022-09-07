import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int C = Integer.parseInt(br.readLine());

		String[] input = new String[C];
		float[] result = new float[C];
		for(int i = 0; i < C; i++) {
			float avg = 0;
			int count = 0;
			input[i] = br.readLine();
			
			String[] score = input[i].split(" ");
			
			for(int j = 1; j < score.length; j++) {
				avg += Integer.parseInt(score[j]);
			}
			
			avg /= Float.parseFloat(score[0]);
			
			for(int j = 1; j < score.length; j++) {
				if(Float.parseFloat(score[j]) > avg) {
					count++;
				}
			}
			result[i] = count / Float.parseFloat(score[0]) * 100;
		}
		
		for(int i = 0; i < C; i++) {
			System.out.printf("%.3f%%\n", result[i]);
		}
		br.close();
	}

}
