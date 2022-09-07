import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int loof = scan.nextInt();
		
		int count = 0;
		
		for(int i = 0; i < loof; i++) {			
			int N = scan.nextInt();
			boolean sosu = true;
			
			if(N == 1) {
				continue;
			}
			
			for(int j = 2; j < N; j++) {
				if(N % j == 0) { //나머지가 없음 => 소수가 아님
					sosu = false;
					break;
				}
			}
			
			if(sosu)
				count++;
		}
		
		System.out.println(count);
	}

}