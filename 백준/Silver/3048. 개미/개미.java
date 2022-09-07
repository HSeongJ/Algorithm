import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str_ant1 = br.readLine();
		String str_ant2 = br.readLine();
		
		int T = Integer.parseInt(br.readLine());
		
		char[] Ant1 = new char[Integer.parseInt(st.nextToken())];
		char[] Ant2 = new char[Integer.parseInt(st.nextToken())];
		
		for(int i = 0; i < Ant1.length; i++) {
			Ant1[i] = str_ant1.charAt(str_ant1.length() - 1 - i);
		}
		
		for(int i = 0; i < Ant2.length; i++) {
			Ant2[i] = str_ant2.charAt(i);
		}
		
		if(T == 0) {
			for(int i = 0; i < Ant1.length; i++) {
				System.out.print(Ant1[i]);
			}
			for(int i = 0; i < Ant2.length; i++) {
				System.out.print(Ant2[i]);
			}
		} else if(T >= (Ant1.length + Ant2.length - 1)) {
			for(int i = 0; i < Ant2.length; i++) {
				System.out.print(Ant2[i]);
			}
			for(int i = 0; i < Ant1.length; i++) {
				System.out.print(Ant1[i]);
			}
		} else if(T > (Ant1.length - 1)) {
			T = (Ant1.length + Ant2.length - 1) - T;
			Cross(Ant2, Ant1, T);
		} else {
			Cross(Ant1, Ant2, T);
		}
		
		
		br.close();
	}
	
	public static void Cross(char[] first, char[] second, int T) {
		StringBuilder sb = new StringBuilder();
		
		int first_idx = 0;
		int second_idx = 0;
		
		for(int i = 0; i < first.length - T; i++) {
			sb.append(first[first_idx++]);
		}
		
		while((first_idx < first.length) && (second_idx < second.length)) {
			sb.append(second[second_idx++]);
			sb.append(first[first_idx++]);
		}
		
		if(first_idx == first.length) {
			for(int i = second_idx; i < second.length; i++) {
				sb.append(second[i]);
			}
		} else {
			for(int i = first_idx; i < first.length; i++) {
				sb.append(first[i]);
			}
		}
		System.out.println(sb);
	}
}