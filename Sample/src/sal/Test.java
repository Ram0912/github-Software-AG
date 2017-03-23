package sal;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import sal.FruitPOJO.color;
import sal.FruitPOJO.type;




public class Test {

	@org.junit.Test
	public void test() {
		
			List<FruitPOJO> actuallist = new ArrayList<FruitPOJO>();
			Methods mtest = new Methods();
			ArrayList<FruitPOJO> sizeS = new ArrayList<FruitPOJO>();
			actuallist.add(new FruitPOJO(1,"Apple","Big",color.RED.toString(),type.FRUITS.toString()));
			actuallist.add(new FruitPOJO(2,"Mango","Big",color.YELLOW.toString(),type.FRUITS.toString()));
			actuallist.add(new FruitPOJO(3,"Orange","Small",color.ORANGE.toString(),type.FRUITS.toString()));
			actuallist.add(new FruitPOJO(4,"Strawberry","Small",color.RED.toString(),type.BERRIES.toString()));
			List<FruitPOJO> expectedDetails=mtest.sortSizeSmall(actuallist);
			sizeS.add(new FruitPOJO(3,"Orange","Small",color.ORANGE.toString(),type.FRUITS.toString()));
			sizeS.add(new FruitPOJO(4,"Strawberry","Small",color.RED.toString(),type.BERRIES.toString()));
			
			assertEquals(sizeS,expectedDetails);
		}
	}


