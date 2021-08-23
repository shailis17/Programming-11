package unit05;
import java.util.*;

public class SimpleMenu
{
    public static void main(String args[])
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            System.out.print("Enter a number: ");
            choice = sc.nextInt();
            
            if(choice == 1)
                System.out.println("Hi");
            else if(choice == 2)
                System.out.println("Hey");
            else if(choice == 3)
                System.out.println("Hello");
            else if(choice != 4)
                System.out.println("Invalid Input");
        }while(choice != 4);
        
        System.out.print("Program Terminated...");
    }
}