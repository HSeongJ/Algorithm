import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		String[] str1= str.split(" ");
		int count = 0;
		for(int i = 0; i < str1.length; i++) {
			if(!str1[i].equals("")) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
