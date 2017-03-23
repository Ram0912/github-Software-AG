package sortingbycomparator;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_display {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
        ArrayList<Integer> phone = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some name");
            while (sc.hasNext()) {
            String i = sc.next();
            name.add(i);
            for(String obj:name)  
	        	    System.out.println(obj);
            	         }

	}

}
