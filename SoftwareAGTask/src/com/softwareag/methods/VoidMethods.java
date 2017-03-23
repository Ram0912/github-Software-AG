package com.softwareag.methods;

import java.io.IOException;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Logger;

import com.softwareag.bean.FruitsModel;
import com.softwareag.bean.FruitsModel.color;

public class VoidMethods {
	final static Logger log = Logger.getLogger(ReturnMethods.class.getName());

	public void sortBySize(ArrayList<FruitsModel> fi) throws NumberFormatException, IOException {

	}

	public void fruitsByColor(EnumMap<color, List<FruitsModel>> map) {
		log.info("\n2.Color has minimum and maximum number of fruits");

		map.forEach((k, v) -> {
			log.info(k + ":\t" + v.size());
		});
	}

	public void fruitsBySize(EnumMap<color, List<FruitsModel>> map) {
		map.forEach((k1, v1) -> {
			log.info(k1 + ":\t");

			v1.forEach((c) -> {
				log.info(c.getName());
			});
			System.out.println("************************************");
		});
		log.info("\n1.min and max size of the fruit with-in each color group");
		map.forEach((k2, v2) -> {
			System.out.println("************************************");
			log.info(k2.toString());

			v2.forEach((n) -> {
				if (n.getSize().equalsIgnoreCase("small"))
					log.info(n.getName() + " : minimum sized fruit in the color group");
				if (n.getSize().equalsIgnoreCase("big"))
					log.info(n.getName() + " : maximum sized fruit in the color group");
			});
		});

	}
}
