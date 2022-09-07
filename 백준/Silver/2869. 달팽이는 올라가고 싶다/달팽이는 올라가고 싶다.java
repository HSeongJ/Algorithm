import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		String[] str_sp = str.split(" " );
		
		int A = Integer.parseInt(str_sp[0]);
		int B = Integer.parseInt(str_sp[1]);
		int V = Integer.parseInt(str_sp[2]);
		
		int day = 1;
		
		V = V - A;
		
		day = day + (V / (A - B));
		
		if(V % (A - B) != 0)
			day++;
		
		bw.write(String.valueOf(day));
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}