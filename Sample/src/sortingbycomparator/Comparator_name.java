package sortingbycomparator;

import java.util.Comparator;

public class Comparator_name implements Comparator<Employee>  {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.name.compareTo(e2.name);
	}

	
}
