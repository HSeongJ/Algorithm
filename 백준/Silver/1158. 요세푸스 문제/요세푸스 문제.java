import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        int num = 0;

        for(int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        sb.append("<");

        while(true) {
            int num1 = 0;
            for(int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll());
            if(queue.isEmpty()) {
                break;
            }
            sb.append(", ");
        }
        sb.append(">");

        System.out.println(sb.toString());

        br.close();
    }
}
