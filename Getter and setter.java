import java.util.*;
class employee{
	private int id;
	private String name;
	private double salary;
	public employee(int id,String name,double salery)
	{
		this.id = id;
		this.name = name;
		this.salary = salery;
	}
	public employee()
	{
		this.id = 0;
		this.name = "";
		this.salary = 0;
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		if(id>0)
		{
			this.id = id;
		}
		else
		{
			System.out.println("Enter the valid id");
		}
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		if(name!=null && !name.isEmpty())
		{
			this.name = name;
		}
		else
		{
			this.name = "Enter the valid name";
		}
	}
	public double getSalery(){
		return this.salary;
	}
	public void setSalery(double salary){
		if(salary>0)
		{
			this.salary = salary;
		}
		else
		{	
			System.out.println("Enter the valid Salery");
		}
	}
	public void display(){
		System.out.println("The name is "+this.name+" and id is "+this.id+" and salary is : "+this.salary);
	}
}
public class Main{
	public static void main(String[] args){
		employee e1 = new employee(120,"James",12000.5);
		employee e2 = new employee();
		e2.setId(162);
		e2.setName("mark");
		e2.setSalery(120000);
		System.out.println("The name is : "+e1.getName());
		System.out.println("The Id is : "+e1.getId());
		System.out.println("The Salery is : "+e1.getSalery());
		System.out.println("The name is : "+e2.getName());
		System.out.println("The Id is : "+e2.getId());
		System.out.println("The Salery is : "+e2.getSalery());
		e1.display();
	}	
}
