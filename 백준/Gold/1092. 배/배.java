import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> crain = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++ ) {
            crain.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        ArrayList<Integer> box = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            box.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(crain, Collections.reverseOrder());
        Collections.sort(box, Collections.reverseOrder());

        int count = 0;
        if(crain.get(0) < box.get(0)) {
            System.out.println(-1);
        } else {
            while(box.size() != 0) {
                int idx = 0;
                for(int i = 0; i < crain.size();) {
                    if(idx == box.size()) break;
                    else if(crain.get(i) >= box.get(idx)) {
                        box.remove(idx);
                        i++;
                    }
                    else idx++;
                }
                count++;
            }
            System.out.println(count);
        }
        br.close();
    }
}