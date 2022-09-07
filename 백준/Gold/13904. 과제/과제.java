import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Mission implements Comparable<Mission>{
    int score;
    int date;

    public Mission(int deadline, int score) {
        this.date = deadline;
        this.score = score;
    }

    @Override
    public int compareTo(Mission o) {
        if(this.date == o.date) {
            return o.score - this.score;
        } else {
            return this.date - o.date;
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Mission[] ary = new Mission[N];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ary[i] = new Mission(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.parallelSort(ary);

        for(int i = 0; i < N; i++) {
            if(pq.size() < ary[i].date) {
                pq.offer(ary[i].score);
            } else if(pq.size() == ary[i].date) {
                if(pq.peek() < ary[i].score) {
                    pq.poll();
                    pq.offer(ary[i].score);
                }
            }
        }

        int result = 0;
        int size = pq.size();
        for(int i = 0; i < size; i++) {
            result += pq.poll();
        }

        System.out.println(result);
        br.close();
    }
}