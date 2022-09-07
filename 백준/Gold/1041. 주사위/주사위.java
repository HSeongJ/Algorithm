import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        long see = N*N + (N*(N-1)) + (2*(N-1)*(N-1)) + ((N-1) * (N-2));
        long side3 = 4;
        long side2 = N * 8 - 12;
        long side1 = see - (side2 + side3);
        long result = 0;

        int[] num = new int[6];
        int side3_min = 150;
        int side2_min = 100;
        int side1_min = 50;

        StringTokenizer st = new StringTokenizer(br. readLine());
        for(int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            side1_min = Math.min(side1_min, num[i]);
        }

        if(N == 1) {

            Arrays.sort(num);
            for(int i = 0; i < 5; i++) {
                result += num[i];
            }
            System.out.println(result);
            br.close();
            return;
        }

        //check side3_min
        side3_min = Math.min(side3_min, num[0] + num[1] + num[2]);
        side3_min = Math.min(side3_min, num[0] + num[2] + num[4]);
        side3_min = Math.min(side3_min, num[0] + num[1] + num[3]);
        side3_min = Math.min(side3_min, num[0] + num[3] + num[4]);
        side3_min = Math.min(side3_min, num[5] + num[1] + num[2]);
        side3_min = Math.min(side3_min, num[5] + num[2] + num[4]);
        side3_min = Math.min(side3_min, num[5] + num[1] + num[3]);
        side3_min = Math.min(side3_min, num[5] + num[3] + num[4]);

        //check side2_min
        for(int i = 0; i < 6; i++) {
            for(int k = 0; k < 6; k++) {
                if(k == num.length - (i + 1) || k == i) {
                    continue;
                }
                side2_min = Math.min(side2_min, num[i] + num[k]);
            }
        }

        result = (side3 * side3_min) + (side2 * side2_min) + (side1 * side1_min);
        System.out.println(result);
        br.close();
    }
}