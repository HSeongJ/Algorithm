import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuffer sb = new StringBuffer(br.readLine());
		
		sb.reverse();
		
		String[] str = sb.toString().split(" ");
		
		if(Integer.parseInt(str[0]) > Integer.parseInt(str[1]))
			System.out.println(Integer.parseInt(str[0]));
		else
			System.out.println(Integer.parseInt(str[1]));
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}