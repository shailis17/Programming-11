package unit10;
import java.util.*;

public class Group
{
    Scanner sc = new Scanner(System.in);
    public int numMem;
    public Student[] group;
    
    public Group(int num)
    {
        this.numMem = num;
        group = new Student[numMem];
    }
    public void fillStudents()
    {
        String name;
        int idNum, grade, section;
    
        for (int i = 0; i < numMem; i++)
        {
            System.out.println("Enter information for student " + (i+1)); 
            System.out.println("Name: ");
            name = sc.nextLine();
            System.out.println("ID: ");
            idNum = sc.nextInt();
            System.out.println("grade: ");
            grade = sc.nextInt();
            System.out.println("section: ");
            section = sc.nextInt();
            
            group[i] = new Student(name, idNum, grade, section);
	}
    }  
    public void printMembers()
    {
        for(int x = 0; x < group.length; x++)
        {
            System.out.println("");
            System.out.println("Student#" + (x+1));
            group[x].printStudent();
        }
    }
}