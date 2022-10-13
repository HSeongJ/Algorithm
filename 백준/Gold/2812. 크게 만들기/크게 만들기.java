import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        String str = br.readLine();

        char[] ary = str.toCharArray();
        Stack<Integer> stack = new Stack<>();

        int count = K;

        for(int i = 0; i < N; i++) {
            int num = ary[i] - '0';
            if(stack.isEmpty()) {
                stack.push(num);
                continue;
            }
            if(count == 0) {
                stack.push(num);
                continue;
            }
            if(stack.peek() >= num) {
                stack.push(num);
            } else {
                stack.pop();
                i--;
                count--;
            }
        }

        while(count-- >0) {
            stack.pop();
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N - K; i++) {
            sb.append(stack.pop());
        }
        sb.reverse();
        System.out.println(sb.toString());
        br.close();
    }
}