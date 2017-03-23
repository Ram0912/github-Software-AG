
package task;

import java.util.ArrayList;

import java.util.EnumMap;

import java.util.List;



public class Problem2 {

	enum type {
		Berry, Pomes, Hesperidiums, Pepos, Aggregate
	};

	enum color {
		Red, Green, Orange, Yellow
	};

	public static void main(String[] args) {

		ArrayList<Fruits> fi = new ArrayList<>();
		fi.add(new Fruits(1, "Apple", type.Pomes.toString(), "Big", color.Red.toString()));
		fi.add(new Fruits(2, "Grape", type.Berry.toString(), "Small", color.Green.toString()));
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
		logic1 obj = new logic1();

		EnumMap<color, List<Fruits>> map = obj.groupbycolor(fi);
		obj.min_and_max_size(map);
	
	}

}
