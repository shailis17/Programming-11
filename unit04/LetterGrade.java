package unit04;
import java.util.*;

public class LetterGrade
{
    // instance variables - replace the example below with your own
    public static void main(String args [])
    {
       Scanner sc = new Scanner(System.in); 
       int grade, t, o;
       
       System.out.print("Enter your grade\n(Please round to the nearest whole number):");
       grade = sc.nextInt();
       
       System.out.print("Your grade is:  "); 
       if(grade >= 0 && grade <=100)
       {
          t = (grade/10)%10;
          o = grade%10;
          
          switch(t)
          {
            case 10:
            System.out.print("A+");
            break;
            
            case 9:
            System.out.print("A");
            break;
            
            case 8:
            System.out.print("B");
            break;
            
            case 7:
            System.out.print("C");
            break;
            
            case 6:
            if(o >= 5)
                System.out.print("D");
            break;
            
        }
        if(grade <=64)
        {
            System.out.print("F");
        }
        if(grade >= 70)
        {
              switch(o)
              {
               case 0:
               case 1:
               case 2:
               System.out.print("-");
               break;
               
               case 7:
               case 8:
               case 9:
               System.out.print("+");
               break;
              }
        }
       }
       else
       {
           System.out.print("Invalid input");
       }
    }
}