import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[][] water = new int[N][2];
        int count = 0;
        int sum = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            water[i][0] = Integer.parseInt(st.nextToken());
            water[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(water, (o1, o2)->(o1[0]-o2[0]));
        
        int range = 0;	// 널빤지를 물웅덮이에 덮었을때, 덮을 수 있는 범위
        for(int i=0; i<N; i++) {
            if(water[i][0] > range)
                range = water[i][0];
            if(water[i][1] >= range) {
                while(water[i][1] > range) {
                    range += L;
                    count ++;
                }
            }
        }

        System.out.println(count);
        br.close();
    }
}