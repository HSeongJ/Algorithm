import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 1;
        String str = new String(br.readLine());

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'S') {
                result++;
            } else {
                i++;
                result++;
            }
        }

        if(result > str.length()) {
            result = str.length();
        }
        System.out.println(result);
        br.close();
    }
}