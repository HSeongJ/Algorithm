import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		HashSet<String> tmp = new HashSet<>();
		
		for(int i = 0; i < N; i++) {
			tmp.add(br.readLine());
		}
		
		String[] arr = new String[tmp.size()];
	
		Iterator<String> it = tmp.iterator();
		int count = 0;
		
		while(it.hasNext()) {
			arr[count] = it.next();
			count++;
		}
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else {
					return Integer.compare(o1.length(), o2.length());
				}
			}
			
		});
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		br.close();
	}

}