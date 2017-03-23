package task;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

import task.Problem2.color;

public class logic1 {
public EnumMap<color, List<Fruits>>   groupbycolor(ArrayList<Fruits> fi){
	
	EnumMap<color, List<Fruits>> map = new EnumMap<>(color.class); 
	ArrayList<Fruits> red = new ArrayList<>();
	fi.forEach((f)->{
		if(f.color.contains("Red")==true)
			red.add(f);
		map.put(color.Red, red);
		
	});
	ArrayList<Fruits> green = new ArrayList<>();
	fi.forEach((f)->{
		if(f.color.contains("Green")==true)
			green.add(f);
		map.put(color.Green, green);
		
	});
	ArrayList<Fruits> orange = new ArrayList<>();
	fi.forEach((f)->{
		if(f.color.contains("Orange")==true)
			orange.add(f);
		map.put(color.Orange, orange);
		
	});
	ArrayList<Fruits> yellow = new ArrayList<>();
	fi.forEach((f)->{
		if(f.color.contains("Yellow")==true)
			yellow.add(f);
		map.put(color.Yellow, yellow);
		
	});
	return map;
}

void min_and_max_size(EnumMap<color, List<Fruits>> map){
	map.forEach((k1, v1) -> {
		System.out.println(k1 + ":");
		System.out.println("************************************");
		v1.forEach((c) -> {
			System.out.println(c.name + ", ");
		});
	});
	System.out.println("\n1.min and max size of the fruit with-in each color group");
	map.forEach((k2, v2) -> {
		System.out.println("************************************");
		System.out.println(k2);

		v2.forEach((n) -> {
			if (n.size.contains("Small") == true)
				System.out.println(n.name + " : minimum sized fruit in the color group");
			if (n.size.contains("Big") == true)
				System.out.println(n.name + " : maximum sized fruit in the color group");
		});
	});

	System.out.println("\n2.Color has minimum and maximum number of fruits");

	map.forEach((k, v) -> {
		System.out.println(k + ":\t" + v.size());
	});
	
}
}
