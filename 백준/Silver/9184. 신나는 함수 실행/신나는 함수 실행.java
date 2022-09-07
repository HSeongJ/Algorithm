import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][][] ary = new int[21][21][21];

    public static void main(String[] args) throws Exception {
        ary[0][0][0] = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int sum = 0;

            if(a == -1 && b == -1 && c == -1) {
                break;
            } else {
                sum += w(a, b, c);
            }
            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + sum);
        }


        br.close();
    }

    public static int w(int a, int b, int c) {

        if(a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }
        
        if(a > 20 || b > 20 || c > 20) {
            return ary[20][20][20] = w(20, 20, 20);
        }

        if(ary[a][b][c] != 0) {
            return ary[a][b][c];
        }

        if(a < b && b < c) {
            ary[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
            return ary[a][b][c];
        }

        ary[a][b][c] =  w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
        return ary[a][b][c];

    }
}