import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> positive = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> negative = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > 0) {
                positive.offer(num);
            } else {
                negative.offer(num);
            }
        }

        int sum = 0;
        while(true) {
            if(negative.size() == 0) {
                break;
            } else if(negative.size() == 1) {
                sum += negative.poll();
                break;
            } else {
                int num1 = negative.poll();
                int num2 = negative.poll();
                sum += num1 * num2;
            }
        }

        while(true) {
            if(positive.size() == 0) {
                break;
            } else if(positive.size() == 1) {
                sum += positive.poll();
                break;
            } else {
                int num1 = positive.poll();
                int num2 = positive.poll();
                if(num1 * num2 > num1 + num2) {
                    sum += num1 * num2;
                } else {
                    sum += num1 + num2;
                }
            }
        }
        System.out.println(sum);
        br.close();
    }
}