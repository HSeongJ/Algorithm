import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int[][] signal = new int[N][3];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			signal[i][0] = Integer.parseInt(st.nextToken());
			signal[i][1] = Integer.parseInt(st.nextToken());
			signal[i][2] = Integer.parseInt(st.nextToken());
		} //finished for

		int time = 0;

		for(int i = 0; i < N; i++) {
			if(i == 0) {
				time += signal[i][0];
			} else {
				time += signal[i][0] - signal[i - 1][0];
			}

			if(time % (signal[i][1] + signal[i][2]) == 0) {
				time += signal[i][1];
			} else if(time % (signal[i][1] + signal[i][2]) <= signal[i][1]) {
				//Red
				time += signal[i][1] - (time % (signal[i][1] + signal[i][2]));
			}
		}

		time += L - (signal[N-1][0]);

		System.out.println(time);
		
		br.close();
	}
}