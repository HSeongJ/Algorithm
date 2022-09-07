import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int count1;
    static int count2;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] num = new int[N];
            char[] bomb = new char[N];
            int result = 0;
            String num_str = br.readLine();
            String bomb_str = br.readLine();

            for (int i = 0; i < N; i++) {
                num[i] = num_str.charAt(i) - '0';
                bomb[i] = bomb_str.charAt(i);
            }

            if(num[0] == 0) {
                bomb[0] = 'X';
                bomb[1] = 'X';
                findBomb(num, bomb);
            } else if(num[0] == 2) {
                bomb[0] = '*';
                bomb[1] = '*';
                findBomb(num, bomb);
            } else {
                bomb[0] = '*';
                bomb[1] = 'X';
                if(!findBomb(num, bomb)) { //
                    bomb[0] = 'X';
                    bomb[1] = '*';
                    findBomb(num, bomb);
                }
            }

            for(int i = 0; i < N; i++) {
                if(bomb[i] == '*') result++;
            }

            System.out.println(result);
        }
        br.close();
    }

    public static boolean findBomb(int[] num, char[] bomb) {
        for(int i = 1; i < num.length - 1; i++) {
            int count1 = 0; //count #
            int count2 = 0; //count *

            for(int j = -1; j < 1; j++) {
                if(bomb[i + j] == '#') {
                    count1++;
                } else if(bomb[i + j] == '*') {
                    count2++;
                }
            }

            if(num[i] - count2 == 0) {
                bomb[i + 1] = 'X';
            } else {
                bomb[i + 1] = '*';
            }
        }

        //check
        boolean check = true;
        for(int i = 0; i < num.length; i++) {
            int start_check = 0; //check *
            for(int j = -1; j < 2; j++) {
                try {
                    if(bomb[i + j] == '*') {
                        start_check++;
                    }
                } catch (Exception e) {}
            }
            if(num[i] == start_check) {
                continue;
            } else {
                check = false;
                return check;
            }
        }
        return check;
    }
}