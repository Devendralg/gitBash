package task;

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
	
	
}

public class SortObjects {
	public static void main(String[] args)
	{
		sortInAscendingOrderBasedOnName();
		sortInDescendingOrderBasedOnName();
		sortInAscendingOrderBasedOnId();
		sortInDescendingOrderBasedOnId();
		sortInAscendingOrderBasedOnSal();
		sortInDescendingOrderBasedOnSal();
		sortInAscendingOrderBasedOnDesignation();
		sortInDescendingOrderBasedOnDesignation();
		
		
		
		
	}
	private static void sortInDescendingOrderBasedOnDesignation() {
		List<Employee2> list1 = empdetails();
		Collections.sort(list1,new Comparator<Employee2>() {

			@Override
			public int compare(Employee2 o1, Employee2 o2)
			{
				return o2.getDesignation().compareTo(o1.getDesignation());
			}
		});
		
		printEmpDetails(list1);
		
		
	}
	private static void sortInAscendingOrderBasedOnDesignation() {
		List<Employee2> list1 = empdetails();
		Collections.sort(list1,new Comparator<Employee2>() {

			@Override
			public int compare(Employee2 o1, Employee2 o2)
			{
				return o1.getDesignation().compareTo(o2.getDesignation());
			}
		});
		
		printEmpDetails(list1);
		
		
	}
	private static void sortInDescendingOrderBasedOnSal() {
		List<Employee2> list1 = empdetails();
		Collections.sort(list1,new Comparator<Employee2>() {

			@Override
			public int compare(Employee2 o1, Employee2 o2)
			{
				return Double.compare(o2.getSal(), o1.getSal());
			}
		});
		
		printEmpDetails(list1);
		
	}
	private static void sortInAscendingOrderBasedOnSal() {
		List<Employee2> list1 = empdetails();
		Collections.sort(list1,new Comparator<Employee2>() {

			@Override
			public int compare(Employee2 o1, Employee2 o2)
			{
				return Double.compare(o1.getSal(), o2.getSal());
			}
		});
		
		printEmpDetails(list1);
		
	}
	private static void sortInDescendingOrderBasedOnId() {
		List<Employee2> list1 = empdetails();
		Collections.sort(list1,new Comparator<Employee2>() {

			@Override
			public int compare(Employee2 o1, Employee2 o2)
			{
				return o2.getId()-o1.getId();
			}
		});
		
		printEmpDetails(list1);

		
	}
	private static void sortInDescendingOrderBasedOnName() {
		List<Employee2> list1 = empdetails();
		Collections.sort(list1,new Comparator<Employee2>() {

			@Override
			public int compare(Employee2 o1, Employee2 o2)
			{
				return o2.getName().compareTo(o1.getName());
			}
		});
		
		printEmpDetails(list1);
		
	}
	private static void sortInAscendingOrderBasedOnId()
	{
		List<Employee2> list1 = empdetails();
		Collections.sort(list1,new Comparator<Employee2>() {

			@Override
			public int compare(Employee2 o1, Employee2 o2)
			{
				return o1.getId()-o2.getId();
			}
		});
		
		printEmpDetails(list1);

	}
	private static void sortInAscendingOrderBasedOnName()
	{
		List<Employee2> list1 = empdetails();
		Collections.sort(list1,new Comparator<Employee2>() {

			@Override
			public int compare(Employee2 o1, Employee2 o2)
			{
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		printEmpDetails(list1);
		
		
	}
	private static void printEmpDetails(List<Employee2> empdetails) 
	{
		for (Employee2 emp : empdetails)
		{
			System.out.println(emp.getId()+"\t"
							  +emp.getName()+"\t"
							  +emp.getSal()+"\t\t"
							  +emp.getDesignation());
		}
	}
	public static List<Employee2> empdetails()
	{
		List<Employee2> list = Arrays.asList(new Employee2("A",1,10000.00,"clerk"),
				new Employee2("A",10,10000.0,"jr clerk"),
				new Employee2("Z",11,11000.0,"senior clerk"),
				new Employee2("S",15,15000.0,"manager"),
				new Employee2("C",16,17000.0,"assistant manager"),
				new Employee2("E",19,10000.0,"team lead"),
				new Employee2("Z",20,30000.0,"project manager"),
				new Employee2("B",21,20000.0,"scrum master"),
				new Employee2("L",22,70000.0,"qa"),
				new Employee2("O",23,90000.0,"senior qa")
				);
		return list;
		
	}

}
