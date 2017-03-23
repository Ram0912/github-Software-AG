package com.softwareag.mainmethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

import com.softwareag.bean.FruitsModel;
import com.softwareag.bean.FruitsModel.color;
import com.softwareag.methods.ReturnMethods;
import com.softwareag.methods.VoidMethods;

/*
 * getting the ArrayList
 * grouping the list by their color using EnumMapping
 * calling of the sort by color and size
*/
public class MainMethod {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		ReturnMethods obj=new ReturnMethods();
		VoidMethods obj1=new VoidMethods();
		ArrayList<FruitsModel> f = obj.getArrayListInput();
		f.forEach((b)->{System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getColor()+"\t"+b.getSize()+"\t"+b.getType());});
		EnumMap<color, List<FruitsModel>> map=obj.groupingByColor(f);
		obj1.fruitsByColor(map);
		obj1.fruitsBySize(map);
	}

}
