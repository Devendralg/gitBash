package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee2
{
	String name;
	int id;
	double sal;	String designation;
	public Employee2(String name, int id, double sal, String designation) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String toString()
	{
		return name+"\t"+id+"\t"+sal+"\t"+designation;
	}
	
}

public class SortObjects {
	public static void main(String[] args)
	{
		sortBasedOnName();
		
		
	}
	private static void sortBasedOnName()
	{
		//empdetails();
		Collections.sort(empdetails(),new Comparator<Employee2>() {

			@Override
			public int compare(Employee2 o1, Employee2 o2)
			{
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println(empdetails());
		
		
	}
	public static List<Employee2> empdetails()
	{
		List<Employee2> list = Arrays.asList(new Employee2("A",1,10000.00,"clerk"),
				new Employee2("A",10,10000.00,"jr clerk"),
				new Employee2("Z",11,11000.00,"senior clerk"),
				new Employee2("S",15,15000.00,"manager"),
				new Employee2("C",16,17000.00,"assistant manager"),
				new Employee2("E",19,10000.00,"team lead"),
				new Employee2("Z",20,30000.00,"project manager"),
				new Employee2("B",21,20000.00,"scrum master"),
				new Employee2("L",22,70000.00,"qa"),
				new Employee2("O",23,90000.00,"senior qa")
				);
		return list;
		
	}

}
