import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	static char[][] result;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		result = new char[N][N];
		
		star(0, 0, N, false);
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				sb.append(result[i][j]);
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
	}
	
	static void star(int x, int y, int N, boolean blank) {
		
		if(blank) {
			for(int i = x; i < x + N; i++) {
				for(int j = y; j < y + N; j++) {
					result[i][j] = ' ';
				}
			}
			return;
		}
		
		if(N == 1) {
			result[x][y] = '*';
			return;
		}
		
		int size = N / 3;
		int count = 0;
		
		for(int i = x; i < x + N; i+= size ) {
			for(int j = y; j < y + N; j+= size) {
				count++;
				if(count == 5)
					star(i, j, size, true);
				else
					star(i, j, size, false);
			}
		}
	}
}