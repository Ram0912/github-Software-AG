package sortingbycomparator;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mainmethod {

	public static void main(String[] args) {
		
		  List names = new ArrayList();
			
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
			
	      names.forEach(System.out::println);
	      
		ArrayList <Employee>al = new ArrayList<>();
		System.out.println("enter the number of Employees");
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		for(int i=1;i<=a;i++){
			
		System.out.println("Enter the details of Employee"+i);
		al.add(new Employee(s.nextInt(), s.next(), s.nextInt()));
		
		
		}
		System.out.println("List of Employee u hav entered");
		
		al.forEach(System.out::println);
		for(Employee e:al ){
			System.out.println(e.id+" "+e.name+" "+e.age);
		}
		
System.out.println("Choose the option below");
System.out.println("1. Sort by id");
System.out.println("2. Sort by Name");
System.out.println("3. Sort by age");
int b=s.nextInt();

switch(b){
case 1:
	Collections.sort(al, new Comparator_id());
	for(Employee e :al)
	System.out.println(e.id+" "+e.name+" "+e.age);
	
	break;
	
case 2:
	Collections.sort(al,new Comparator_name());
	for(Employee e :al)
		System.out.println(e.id+" "+e.name+" "+e.age);
	
	break;
case 3:
	Collections.sort(al,new Comparator_age());
	for(Employee e :al)
		System.out.println(e.id+" "+e.name+" "+e.age);
	
	break;
	default :
		System.out.println("Invalid option");
		
	
		
		
		
}

		

	}

}
