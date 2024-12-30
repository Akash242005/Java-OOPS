public class parameterConstructor{
	int roll;
	String name;
	// PARAMETER CONSTRUCTOR
	public parameterConstructor(int number,String name)
	{
		this.roll = number;
		this.name = name;
	}
	// COPY CONSTRUCTOR
	public parameterConstructor(parameterConstructor obj)
	{
		this.roll = obj.roll;
		this.name = obj.name;
	}
	// DEFAULT CONSTRUCTOR
	public parameterConstructor()
	{
		this.roll = 0;
		this.name = "unknown";
	}
	public void display(){
		System.out.println("The name is "+this.name+" and the roll number is "+this.roll);
	}
}
