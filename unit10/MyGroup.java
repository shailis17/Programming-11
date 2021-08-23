package unit10;
import java.util.*;

/**
 * Executable Class
 */

public class MyGroup
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many people are in your group");
        int x = sc.nextInt();
        Group myGroup = new Group(x);
        
        myGroup.fillStudents();
        
        myGroup.printMembers();
        
    }
}