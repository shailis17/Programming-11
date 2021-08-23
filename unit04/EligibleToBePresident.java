package unit04;
import java.util.*;
public class EligibleToBePresident
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int age;
        String response;
        boolean citizen, resident, eligible;
        
        System.out.print("Are you a natural born citizen of the US? \nYes or No:");
        response = sc.nextLine();
        citizen  = response.equals("Yes")||response.equals("yes");
        
        System.out.print("Have you been a US resident for over 14 years \nYes orNo: ");
        response = sc.nextLine();
        resident = response.equals("Yes")||response.equals("yes");
        
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        
        eligible = (resident && citizen && age >=35);
        
        System.out.print("You are... ");
        if(!eligible)
            System.out.print("not ");
        System.out.print("eligible");
        
    }
}