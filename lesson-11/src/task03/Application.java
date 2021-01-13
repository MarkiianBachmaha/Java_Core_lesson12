package task03;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		String name = "Paul";
		int a = 263;
		List ArrayList = new ArrayList();

		ArrayList.add("A");
		ArrayList.add(26);
		ArrayList.add('b');
		ArrayList.add("black");
		ArrayList.add("car");
		ArrayList.add("37.1297");
		ArrayList.add(name);
		ArrayList.add(a);
		ArrayList.add("Test");
		ArrayList.add("IT");

		System.out.println(ArrayList);

		for (int i = 0; i < 7; i++) {
			ArrayList.remove(2);
			System.out.println(ArrayList);
		}

		for (int i = 0; i < 10; i++) {
			ArrayList.add("Words");
			System.out.println(ArrayList);
		}

	}

}