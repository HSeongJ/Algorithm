import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		short N = scan.nextShort();
		byte M = 0;
		float[] score = new float[N];
		float new_Score = 0;
		
		for(int i = 0; i < score.length; i++) {
			
			score[i] = scan.nextFloat();
			
			if(M < (byte)score[i])
				M = (byte)score[i];
		}
		
		for(int i = 0; i <score.length; i++) {
			score[i] = score[i] / M * 100;
			
			new_Score += score[i] / score.length;
		}
		System.out.println(new_Score);
	}
}