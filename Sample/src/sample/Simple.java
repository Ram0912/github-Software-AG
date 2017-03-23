package sample;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Simple extends HashMap {
	
	enum days {  
		  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
		} 

	public static void main(String[] args){  
	
		Map <String,String> pb =new HashMap<>();
		Set<String> key= pb.keySet();
		Set <Map.Entry<String, String>> ma=pb.entrySet();
		
		pb.put("ram", "14587656");
		pb.put("sam", "1446546");
		pb.put("sram", "14524");
		pb.put("pram", "145844654");
		System.out.println(pb.get("ram"));
		for(String a: key)
		{
			System.out.println(a+":"+pb.get(a));
		}
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		for(Map.Entry<String, String> e:ma)
		{
			System.out.println(e.getKey()+":"+e.getValue());
			e.setValue("III");
		}
		 
			
			  
			    Set<days> set1 = EnumSet.allOf(days.class);
			    Iterator <days>itr= set1.iterator();
			    while(itr.hasNext())
			    
			    System.out.print(itr.next()+", ");
			           
			  } 
		
	}
	
