package task;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import task.Fruits.*;

public class Problem1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Fruits> fi = new ArrayList<>();
		System.out.println("Enter the number of FruitsList:");
		int n = Integer.parseInt(br.readLine());
		fi.add(new Fruits(1, "Apple", type.Pomes.name(), "Big", color.Red.toString()));
		fi.add(new Fruits(2, "Grape", type.Berry.name(), "Small", color.Green.toString()));
		fi.add(new Fruits(3, "Banana", type.Berry.toString(), "Medium", color.Yellow.toString()));
		fi.add(new Fruits(4, "Lemon", type.Hesperidiums.toString(), "Small", color.Yellow.toString()));
		fi.add(new Fruits(5, "Orange", type.Hesperidiums.toString(), "Small", color.Orange.toString()));
		fi.add(new Fruits(6, "Melon", type.Pepos.toString(), "Big", color.Green.toString()));
		fi.add(new Fruits(7, "Pumpkin", type.Pepos.toString(), "Big", color.Orange.toString()));
		fi.add(new Fruits(8, "Cherry", type.Pomes.toString(), "Small", color.Red.toString()));
		fi.add(new Fruits(9, "Pears", type.Pomes.toString(), "Medium", color.Green.toString()));
		fi.add(new Fruits(10, "Kiwifruit", type.Aggregate.toString(), "Medium", color.Green.toString()));
		fi.add(new Fruits(11, "Mango", type.Pomes.toString(), "Medium", color.Yellow.toString()));
		fi.add(new Fruits(12, "Pineapple", type.Pomes.toString(), "Big", color.Yellow.toString()));
		fi.add(new Fruits(13, "Pomogranate", type.Pomes.toString(), "Medium", color.Red.toString()));
		fi.add(new Fruits(13, "vocado", type.Pomes.toString(), "Medium", color.Green.toString()));

		Console console = System.console();
		String s = console.readLine();
		int i = Integer.parseInt(console.readLine());

		System.out.println("Choose the option below to group the fruits by size");
		System.out.println("1. Group by Size:Small");
		System.out.println("2. Group by Size:Medium");
		System.out.println("3. Group by Size:Large");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		switch (a) {
		case 1:
			for (Fruits f : fi) {
				if (f.getSize().contains("Small") == true)

					System.out.println(f.getName());

			}
			break;
		case 2:
			for (Fruits f : fi) {
				if (f.getSize().contains("Medium") == true)

					System.out.println(f.getName());

			}
			break;
		case 3:
			for (Fruits f : fi) {
				if (f.getSize().contains("Big") == true)

					System.out.println(f.getName());

			}
			break;
		default:
			System.out.println("Invalid option");
		}

		main(args);
	}
}
