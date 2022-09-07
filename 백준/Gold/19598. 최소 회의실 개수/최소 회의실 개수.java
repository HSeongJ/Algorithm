import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        ArrayList<Time> ary = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            ary.add(new Time(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(ary);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int max = 0;

        for(int i = 0; i < N; i++) {
            if (pq.isEmpty()) {
                pq.offer(ary.get(i).end);
            } else if(pq.peek() > ary.get(i).start) {
                pq.offer(ary.get(i).end);
            } else {
                pq.poll();
                i--;
            }
            max = Math.max(max, pq.size());
        }

        System.out.println(max);
        br.close();
    }
}

class Time implements Comparable<Time>{
    int start;
    int end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if(this.start == o.start) {
            return o.end - this.end;
        } else {
            return this.start - o.start;
        }
    }
}