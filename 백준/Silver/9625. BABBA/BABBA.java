import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static String[] str;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        int strt = 0;
        int calculateA = 1;// A는 B로 B는 AB로
        int calculateB = 0;
        int tmp;
        while (strt != K) {
            tmp = calculateA;
            calculateA = calculateB;
            calculateB += tmp;

            strt++;
        }

        System.out.println(calculateA + " " + calculateB);
        br.close();
    }

}