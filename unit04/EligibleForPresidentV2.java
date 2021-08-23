package unit04;
import java.util.*;

public class EligibleForPresidentV2
{
    public static void main(String [] args)
    {
        //declare variables and scanner
        Scanner sc = new Scanner(System.in);
        
        int age;
        String response;
        boolean citizen, resident;
        
        System.out.print("Are you a natural born citizen of the US? \nYes or No:");
        response = sc.nextLine();
        citizen  = response.equals("Yes")||response.equals("yes");
            
            if(!citizen)
                {
                    System.out.print("Sorry... you are not eligible for president");
                }
            else
            {
               System.out.print("Have you been a US resident for over 14 years \nYes or No: ");
               response = sc.nextLine();
               resident = response.equals("Yes")||response.equals("yes");
               
               if(!resident)
                {
                    System.out.print("Sorry... you are not eligible for president");
                }
               else
               {
                   System.out.print("Enter your age: ");
                   age = sc.nextInt();
                   if(age <= 35)
                   {
                       System.out.print("Sorry... you are not eligible for president");
                   }
                   else
                   {
                       System.out.print("Yay! You are eligible to run for president");
                   }
                }
            }
    }
    }