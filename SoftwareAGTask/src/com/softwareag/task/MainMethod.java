package com.softwareag.task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;

import com.softwareag.task.FruitsModel.color;


public class MainMethod {
	final static Logger log = Logger.getLogger(MainMethod.class.getName());

	public static void main(String[] args) throws NumberFormatException, IOException {
		BasicConfigurator.configure();
		
		GettingArrayProperties obj=new GettingArrayProperties();
		ArrayList<FruitsModel> f = obj.getInput();
		f.forEach((b)->{System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getColor()+"\t"+b.getSize()+"\t"+b.getType());});
		EnumMap<color, List<FruitsModel>> map=obj.logic1(f);
		obj.fruitsByColor(map);
		obj.fruitsBySize(map);
	}

}
