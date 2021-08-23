package unit09;

public class Student
{
    private int ID, grade, section;
    private String name;
    
    public Student()
    {
        
    }
    public Student(String name, int ID, int grade, int section)
    {
        this.name = name;
        this.ID = ID;
        this.grade = grade;
        this.section = section;
    }
    public void printStudent()
    {
        System.out.println("Student Name: " + name);
        System.out.println("ID Number: " + ID);
        System.out.println("Grade: " + grade);
        System.out.println("Section: " + section);
    }
    public void moveUpYear()
    {
        grade++;
    }
    public String getName()
    {
        return name;
    }
    public int getID()
    {
        return ID;
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