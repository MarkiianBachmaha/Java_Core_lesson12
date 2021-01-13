package task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Натисніть 1, щоб вивести всі записи з масиву");
		System.out.println("Натисніть 2, щоб засетити для всіх об'єктів даного масиву однаковий об'єкт");
	}

	public static void main(String[] args) {

		Random random = new Random();
		int a = random.nextInt(5);
		int b = random.nextInt(5);
		// Auto[][] auto = new Auto[a][b];
		// String[] typeOfMaterial = { "alcantara", "leather", "wood", "metal",
		// "plastic" };

		List<ArrayList<Auto>> auto = new ArrayList<>();
		List<String> typeOfMaterial = new ArrayList<>();
		typeOfMaterial.add("alcantara");
		typeOfMaterial.add("leather");
		typeOfMaterial.add("wood");
		typeOfMaterial.add("metal");
		typeOfMaterial.add("plastic");

		while (true) {

			Scanner sc = new Scanner(System.in);
			menu();

			switch (sc.next()) {

			case "1": {

				for (int c = 0; c < a; c++) {

					ArrayList<Auto> auto1 = new ArrayList<>();

					for (int d = 0; d < b; d++) {
						Auto autoA = new Auto(random.nextInt(250), (random.nextInt(250) + 500),
								new Engine(random.nextInt(12)), new Rudder(random.nextDouble(),
										typeOfMaterial.get(random.nextInt(typeOfMaterial.size()))));

						auto1.add(autoA);

					}

					auto.add(auto1);
				}

				System.out.println(auto);

				System.out.println();

				break;
			}
			case "2": {
				Auto autoChange = new Auto(random.nextInt(250), (random.nextInt(250) + 500),
						new Engine(random.nextInt(12)),
						new Rudder(random.nextDouble(), typeOfMaterial.get(random.nextInt(typeOfMaterial.size()))));

				for (int c = 0; c < auto.size(); c++) {

					for (int d = 0; d < auto.get(c).size(); d++) {
						auto.get(c).set(d, autoChange);
					}
				}

				System.out.println(auto);

				System.out.println();

				break;
			}
			}
		}

	}
}