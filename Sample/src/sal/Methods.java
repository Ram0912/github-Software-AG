package sal;

import java.util.ArrayList;
import java.util.List;


public class Methods {
		public List<FruitPOJO> sortSizeSmall(List<FruitPOJO> list) {
			List<FruitPOJO> actuallist = new ArrayList<FruitPOJO>();
			for(FruitPOJO f: list){
				if(f.size.equalsIgnoreCase("small")==true){
					actuallist.add(f);
				}
			}
			//list.stream().filter(f -> f.getSize().equalsIgnoreCase("Small"));
					//.forEach(f -> logger.info(f.getName() + " " + f.getSize()));
					// list.filter(p -> p.getSize().toLowerCase().toString() == "small")
					// .forEach(obj -> logger.info(obj.getName() + ": " + obj.getSize()));
	return actuallist;
		}
}

