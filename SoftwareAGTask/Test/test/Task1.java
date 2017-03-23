package test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import org.junit.Test;
import com.softwareag.bean.FruitsModel;
import com.softwareag.bean.FruitsModel.*;
import com.softwareag.methods.ReturnMethods;

public class Task1 {
/*
 * passing the ArrayList to the  groupingByColor Method 
 * Using EnumMap the ArrayList is grouped by Key and Value
 * Asserted
*/
	@Test
	public void test() throws NumberFormatException, IOException {
		ReturnMethods obj =new ReturnMethods();
		ArrayList<FruitsModel> fi = new ArrayList<>();
		fi.add(new FruitsModel(1, "Apple", type.seedfruit.name(), "Big", color.Red.name()));
		fi.add(new FruitsModel(2, "Grape", type.seddlessfruit.name(), "Small", color.Green.name()));
		fi.add(new FruitsModel(3, "Banana", type.seddlessfruit.name(), "Big", color.Yellow.name()));
		fi.add(new FruitsModel(4, "Lemon", type.seedfruit.name(), "Small", color.Yellow.name()));
		fi.add(new FruitsModel(5, "Orange", type.seedfruit.name(), "Small", color.Orange.name()));
		fi.add(new FruitsModel(6, "Melon", type.seedfruit.name(), "Big", color.Green.name()));
		EnumMap<color, List<FruitsModel>> m=obj.groupingByColor(fi);
		
		EnumMap<color, List<FruitsModel>> mi=new  EnumMap<>(color.class);
		
		ArrayList<FruitsModel> red = new ArrayList<>();
		red.add(new FruitsModel(1, "Apple", type.seedfruit.name(), "Big", color.Red.name()));
		ArrayList<FruitsModel> green = new ArrayList<>();
		green.add(new FruitsModel(2, "Grape", type.seddlessfruit.name(), "Small", color.Green.name()));
		green.add(new FruitsModel(6, "Melon", type.seedfruit.name(), "Big", color.Green.name()));
		ArrayList<FruitsModel> blue = new ArrayList<>();
		ArrayList<FruitsModel> black = new ArrayList<>();
		ArrayList<FruitsModel> orange = new ArrayList<>();
		orange.add(new FruitsModel(5, "Orange", type.seedfruit.name(), "Small", color.Orange.name()));
		ArrayList<FruitsModel> yellow = new ArrayList<>();
		yellow.add(new FruitsModel(3, "Banana", type.seddlessfruit.name(), "Big", color.Yellow.name()));
		yellow.add(new FruitsModel(4, "Lemon", type.seedfruit.name(), "Small", color.Yellow.name()));
		
		mi.put(color.Red, red);
		mi.put(color.Green, green);
		mi.put(color.Blue, blue);
		mi.put(color.Black, black);
		mi.put(color.Orange, orange);
		mi.put(color.Yellow, yellow);
		
assertEquals(mi, m);
	}
	/*
	 * passing the ArrayList to the  sortingBySSize Method 
	 * compared the expected value
	*/
@ Test
public void test1(){
	ReturnMethods obj =new ReturnMethods();
	ArrayList<FruitsModel> fi = new ArrayList<>();
	fi.add(new FruitsModel(1, "Apple", type.seedfruit.name(), "Big", color.Red.name()));
	fi.add(new FruitsModel(2, "Grape", type.seddlessfruit.name(), "Small", color.Green.name()));
	fi.add(new FruitsModel(3, "Banana", type.seddlessfruit.name(), "Big", color.Yellow.name()));
	fi.add(new FruitsModel(4, "Lemon", type.seedfruit.name(), "Small", color.Yellow.name()));
	fi.add(new FruitsModel(5, "Orange", type.seedfruit.name(), "Small", color.Orange.name()));
	fi.add(new FruitsModel(6, "Melon", type.seedfruit.name(), "Big", color.Green.name()));
	ArrayList<FruitsModel> f=obj.sortingBySSize(fi);
	ArrayList<FruitsModel> ss = new ArrayList<>();
	ss.add(new FruitsModel(2, "Grape", type.seddlessfruit.name(), "Small", color.Green.name()));
	ss.add(new FruitsModel(4, "Lemon", type.seedfruit.name(), "Small", color.Yellow.name()));
	ss.add(new FruitsModel(5, "Orange", type.seedfruit.name(), "Small", color.Orange.name()));
	assertEquals(f, ss);
}
/*
 * passing the ArrayList to the  sortingByBSize Method 
 * compared the expected value
*/
@ Test
public void test2(){
	ReturnMethods obj =new ReturnMethods();
	ArrayList<FruitsModel> fi = new ArrayList<>();
	fi.add(new FruitsModel(1, "Apple", type.seedfruit.name(), "Big", color.Red.name()));
	fi.add(new FruitsModel(2, "Grape", type.seddlessfruit.name(), "Small", color.Green.name()));
	fi.add(new FruitsModel(3, "Banana", type.seddlessfruit.name(), "Big", color.Yellow.name()));
	fi.add(new FruitsModel(4, "Lemon", type.seedfruit.name(), "Small", color.Yellow.name()));
	fi.add(new FruitsModel(5, "Orange", type.seedfruit.name(), "Small", color.Orange.name()));
	fi.add(new FruitsModel(6, "Melon", type.seedfruit.name(), "Big", color.Green.name()));
	ArrayList<FruitsModel> f=obj.sortingByBSize(fi);
	ArrayList<FruitsModel> bs = new ArrayList<>();
	bs.add(new FruitsModel(1, "Apple", type.seedfruit.name(), "Big", color.Red.name()));
	bs.add(new FruitsModel(3, "Banana", type.seddlessfruit.name(), "Big", color.Yellow.name()));
	bs.add(new FruitsModel(6, "Melon", type.seedfruit.name(), "Big", color.Green.name()));
	assertEquals(f, bs);
}
}
