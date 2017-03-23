package com.softwareag.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;



import com.softwareag.task.FruitsModel.*;



/*Getting the ArrayList
 * The logic is to group the fruits according to their color
* using EnumList and ArrayList
*/

public class GettingArrayProperties {
	final static Logger log = Logger.getLogger(GettingArrayProperties.class.getName());
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public ArrayList<FruitsModel> getInput() throws NumberFormatException, IOException {
		ArrayList<FruitsModel> fi = new ArrayList<>();
		

		log.info("Enter the Number of Fruits");
		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			log.info("enter the fruit properties" + i);
			log.info("\nenter the id");
			int id = Integer.parseInt(br.readLine());
			log.info("\nenter the name");
			String name = br.readLine();
			log.info("\nenter the size either big or small");
			String size = br.readLine();
			log.info("\nenter the type");
			log.info("\n1.seedfruit or 2.seedlessfruit");
			int s = Integer.parseInt(br.readLine());
			String Type = null;
			switch (s) {
			case 1:
				Type = type.seedfruit.name();
				break;

			case 2:
				Type = type.seddlessfruit.name();
				break;
			default:
				log.warning("invalid option");
				break;

			}

			log.info("\nenter the color");
			log.info("\n1.Red, 2.Green, 3.Blue, 4.Black, 5. Yellow, 6. Orange");
			int s1 = Integer.parseInt(br.readLine());
			String Color = null;
			switch (s1) {
			case 1:
				Color = color.Red.name();
				break;

			case 2:
				Color = color.Green.name();
				break;
			case 3:
				Color = color.Blue.name();

				break;

			case 4:
				Color = color.Black.name();

				break;
			case 5:
				Color = color.Yellow.name();
				break;

			case 6:
				Color = color.Orange.name();
				break;
			default:
				log.warning("invalid option");
				break;

			}

			fi.add(new FruitsModel(id, name, Type, size, Color));
		}
		return fi;

	}

	public EnumMap<color, List<FruitsModel>> logic1(ArrayList<FruitsModel> fi) {

		EnumMap<color, List<FruitsModel>> map = new EnumMap<>(color.class);
		ArrayList<FruitsModel> red = new ArrayList<>();
		fi.forEach((f) -> {
			if (f.getColor().toLowerCase().contains("red") == true)
				red.add(f);
			map.put(color.Red, red);

		});
		ArrayList<FruitsModel> green = new ArrayList<>();
		fi.forEach((f) -> {
			if (f.getColor().toLowerCase().contains("green") == true)
				green.add(f);
			map.put(color.Green, green);

		});
		ArrayList<FruitsModel> orange = new ArrayList<>();
		fi.forEach((f) -> {
			if (f.getColor().toLowerCase().contains("orange") == true)
				orange.add(f);
			map.put(color.Orange, orange);

		});
		ArrayList<FruitsModel> yellow = new ArrayList<>();
		fi.forEach((f) -> {
			if (f.getColor().toLowerCase().contains("yellow") == true)
				yellow.add(f);
			map.put(color.Yellow, yellow);

		});
		ArrayList<FruitsModel> blue = new ArrayList<>();
		fi.forEach((f) -> {
			if (f.getColor().toLowerCase().contains("blue") == true)
				blue.add(f);
			map.put(color.Blue, blue);

		});
		ArrayList<FruitsModel> black = new ArrayList<>();
		fi.forEach((f) -> {
			if (f.getColor().toLowerCase().contains("black") == true)
				black.add(f);
			map.put(color.Black, black);

		});

		return map;

	}

	void fruitsByColor(EnumMap<color, List<FruitsModel>> map) {
		log.info("\n2.Color has minimum and maximum number of fruits");

		map.forEach((k, v) -> {
			log.info(k + ":\t" + v.size());
		});
	}

	void fruitsBySize(EnumMap<color, List<FruitsModel>> map) {
		map.forEach((k1, v1) -> {
			System.out.print(k1 + ":\t");

			v1.forEach((c) -> {
				System.out.println(c.getName());
			});
			System.out.println("************************************");
		});
		System.out.println("\n1.min and max size of the fruit with-in each color group");
		map.forEach((k2, v2) -> {
			System.out.println("************************************");
			System.out.println(k2);

			v2.forEach((n) -> {
				if (n.getSize().equalsIgnoreCase("small"))
					System.out.println(n.getName() + " : minimum sized fruit in the color group");
				if (n.getSize().equalsIgnoreCase("big"))
					System.out.println(n.getName() + " : maximum sized fruit in the color group");
			});
		});
		
	}
	public void sortBySize(ArrayList<FruitsModel> fi ) throws NumberFormatException, IOException{
		System.out.println("Choose the option below to group the fruits by size");
		System.out.println("1. Group by Size:Small");
		System.out.println("2. Group by Size:Medium");
		System.out.println("3. Group by Size:Large");
		
		int a = Integer.parseInt(br.readLine());
		switch (a) {
		case 1:
			for (FruitsModel f : fi) {
				if (f.getSize().equalsIgnoreCase("small") )

					System.out.println(f.getName());

			}
			break;
	
		case 2:
			for (FruitsModel f : fi) {
				if (f.getSize().equalsIgnoreCase("big"))

					System.out.println(f.getName());

			}
			break;
		default:
			System.out.println("Invalid option");
		}
	}
}
