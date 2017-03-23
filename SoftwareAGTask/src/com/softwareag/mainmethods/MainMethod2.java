package com.softwareag.mainmethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Logger;

import com.softwareag.bean.FruitsModel;
import com.softwareag.methods.ReturnMethods;


public class MainMethod2 {
	/*
	 * getting the ArrayList
	 * calling of the  sort by size method 
	*/
	final static Logger log = Logger.getLogger(ReturnMethods.class.getName());
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ReturnMethods obj=new ReturnMethods();
		ArrayList <FruitsModel> f=obj.getArrayListInput();
		log.info("Choose the option below to group the fruits by size");
		log.info("1. Group by Size:Small");
		log.info("2. Group by Size:Big");
		
		int a = Integer.parseInt(br.readLine());
		switch (a) {
		case 1:
		{
			ArrayList <FruitsModel> ss=obj.sortingBySSize(f);
					ss.forEach((n)->{
						log.info(n.getName());
					});

		}
			break;
	
		case 2:
		{
			ArrayList <FruitsModel> bs=obj.sortingByBSize(f);
			bs.forEach((n)->{
				log.info(n.getName());
			});
			break;
		}
	
		default:
			log.warning("Invalid option");
		}
		

	}

}
