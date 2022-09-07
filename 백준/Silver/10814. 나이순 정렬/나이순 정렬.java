import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person> {
	int num;
	int age;
	String name;
	
	public Person(int num, int age, String name) {
		this.num = num;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return age + " " + name;
	}

	@Override
	public int compareTo(Person o) {
		if(this.age != o.age) {
			return this.age - o.age;
		}
		return this.num - o.num;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		ArrayList<Person> arr = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			arr.add(new Person(i, sc.nextInt(), sc.next()));
		}
		
		Collections.sort(arr);
		
		for(int i = 0; i < N; i++) {
			System.out.println(arr.get(i));;
		}
	}

}