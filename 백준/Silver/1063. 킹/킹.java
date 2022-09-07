import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String king_str = st.nextToken();
        String rock_str = st.nextToken();

        char[] king = new char[]{king_str.charAt(0), king_str.charAt(1)};
        char[] rock = new char[]{rock_str.charAt(0), rock_str.charAt(1)};

        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String command = br.readLine();

            char[] king_tmp = king.clone();
            char[] rock_tmp = rock.clone();

            move(king_tmp, command);
            if(Arrays.equals(rock_tmp, king_tmp)) {
                move(rock_tmp, command);
            }

            if(((king_tmp[0] >= 65 && king_tmp[0] <=72) && (king_tmp[1] >= 49 && king_tmp[1] <= 56)) &&
                    ((rock_tmp[0] >= 65 && rock_tmp[0] <=72) && (rock_tmp[1] >= 49 && rock_tmp[1] <= 56))) {
                king = king_tmp.clone();
                rock = rock_tmp.clone();
            }
        }

        System.out.println(String.valueOf(king) + "\n" + String.valueOf(rock));

        br.close();
    }

    public static void move(char[] ary, String command) {
        if (command.indexOf("R") != -1) {
            ary[0]++;
        }

        if (command.indexOf("L") != -1) {
            ary[0]--;
        }

        if (command.indexOf("B") != -1) {
            ary[1]--;
        }

        if (command.indexOf("T") != -1) {
            ary[1]++;
        }
    }
}