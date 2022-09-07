import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] number = new long[10];
        long result = 0L;

        for(int i = 0; i < N; i++) {
            String str = new String(br.readLine());

            for(int j = 0; j < str.length(); j++) {
                if(j == 0) {
                    number[str.charAt(j) - 'A'] += (long)Math.pow(10, str.length() - (j + 1)) + 100000000000000L;
                } else {
                    number[str.charAt(j) - 'A'] += (long) Math.pow(10, str.length() - (j + 1));
                }
            }
        }

        Arrays.sort(number);

        for(int i = 0; i < number.length; i++) {
            result += (number[i] % 100000000000000L) * i;
            number[i] = 0;

            if(i == 0) {
                for(int j = 0; j < number.length; j++) {
                    number[j] = number[j] % 100000000000000L;
                    Arrays.sort(number);
                }
            }
        }

        System.out.println(result);

        br.close();
    }
}