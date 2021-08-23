package unit10;

public class Student 
{
	//declare instance data
	private String name;
	private int idNum, grade, section;
	
	//constructor method
	public Student()
	{
		//this left blank
	}
	
	//constructor method
	public Student(String name, int idNum, int grade, int section)
	{
		//set the attributes of the Student object. Since the instance data and parameters have the same name, the "this" keyword is necessary
		this.name = name;
		this.idNum = idNum;
		this.grade = grade;
		this.section = section;
	}
	
	//print method
	public void printStudent()
	{
		System.out.println("Name: " + name);
		System.out.println("ID Number: " + idNum);
		System.out.println("Grade: " + grade);
		System.out.println("Section: " + section);
		//since there is no local variable of the same name. I do not need the "this" keyword here
	}
	
	//I don't need methods to set the value of the instance data, once the name, idnum, grade and section are set, they won't change.
	//However, at the end of a school year the grade value will increase by one. So we need a method to move up a year.
	public void moveUpYear()
	{
		if(grade < 12)
		{
			grade++;
		}
	}
	
	//now we can write getter methods to retrieve information
	public String getName()
	{
		return name;
	}
	
	public int getIdNum()
	{
		return idNum;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	public int getSection()
	{
		return section;
	}
	
}