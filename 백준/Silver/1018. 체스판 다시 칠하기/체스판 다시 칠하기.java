import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		char[][] chess1 = {
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'}};
		
		char[][] chess2 = {
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'}};
		
		
		int change1 = 32;
		int change2 = 32;
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		char[][] chess_input = new char[N][M];
		
		for(int i = 0; i < N; i++) {
			String bw = scan.next();
			
			for(int j = 0; j < bw.length(); j++) {
				chess_input[i][j] = bw.charAt(j);
			}
		}
		
		
		
		for(int i = 0; i < N - 7; i++) {
			for(int j = 0; j < M - 7; j++) {
				int count1 = 0;
				int count2 = 0;
				for(int k = i; k < i + 8; k++) {
					for(int l = j; l < j + 8; l++) {
						if(chess1[k-i][l-j] != chess_input[k][l]) {
							count1++;
						}
						if(chess2[k-i][l-j] != chess_input[k][l]) {
							count2++;
						}
					}
				}
				
				if(change1 > count1) {
					change1 = count1;
				}
				if(change2 > count2) {
					change2 = count2;
				}
			}
		}
		
		if(change1 > change2) {
			System.out.println(change2);
		} else {
			System.out.println(change1);
		}
	}
}