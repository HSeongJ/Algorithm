import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        int[] B_tmp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        B_tmp = B.clone();

        int count = 0;
        boolean mul = false;
        for(int i = 9; i >= 0; i--) {
            for(int j = 0; j < N; j++) {
                if(B_tmp[j] >= Math.pow(2, i)) {
                    A[j]++;
                    B_tmp[j] -= Math.pow(2, i);
                    count++;
                    mul = true;
                }
            }

            if(check(A, B, N))
                break;

            if(mul) {
                for (int j = 0; j < N; j++) {
                    A[j] *= 2;
                }
                count++;
            }

            if(check(A, B, N))
                break;
        }

        System.out.println(count);
        br.close();
    }

    public static boolean check(int[] A, int[] B, int N) {
        boolean end = true;
        for(int i = 0; i < N; i++) {
            if(A[i] != B[i]) {
                end = false;
                return end;
            }
        }
        return end;
    }
}