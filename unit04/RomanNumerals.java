package unit04;
import java.util.*;

public class RomanNumerals
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int num, h, t, o;
        
        System.out.print("Enter a number between 1 - 1000");
        num = sc.nextInt();
        
        System.out.println("Your number as a Roman Numeral would be: ");  
        if (num >= 1 && num <=1000)
        {
            if(num == 1000)
                {
                    System.out.print("M");
                }
            
            h = num/100;
            t = (num/10)%10;
            o = num%10;
            
            switch(h)
            {
              case 1: 
              System.out.print("C");
              break;
              
              case 2: 
              System.out.print("CC");
              break;
              
              case 3: 
              System.out.print("CCC");
              break;
              
              case 4: 
              System.out.print("CD");
              break;
              
              case 5: 
              System.out.print("D");
              break;
              
              case 6: 
              System.out.print("DC");
              break;
              
              case 7: 
              System.out.print("DCC");
              break;
              
              case 8: 
              System.out.print("DCCC");
              break;
              
              case 9: 
              System.out.print("CM");
              break;
              
            }
            
            switch(t)
            {
               case 1: 
               System.out.print("X");
               break;
              
               case 2: 
               System.out.print("XX");
               break;
                  
               case 3: 
               System.out.print("XXX");
               break;
              
               case 4: 
               System.out.print("XL");
               break;
              
               case 5: 
               System.out.print("L");
               break;
              
               case 6: 
               System.out.print("LX");
               break;
              
               case 7: 
               System.out.print("LXX");
               break;
              
               case 8: 
               System.out.print("LXXX");
               break;
              
               case 9: 
               System.out.print("XC");
               break;
            }
            
            switch(o)
            {
               case 1: 
               System.out.print("I");
               break;
              
               case 2: 
               System.out.print("II");
               break;
                  
               case 3: 
               System.out.print("III");
               break;
              
               case 4: 
               System.out.print("IV");
               break;
              
               case 5: 
               System.out.print("V");
               break;
              
               case 6: 
               System.out.print("VI");
               break;
              
               case 7: 
               System.out.print("VII");
               break;
              
               case 8: 
               System.out.print("VIII");
               break;
              
               case 9: 
               System.out.print("IX");
               break;  
            }
        }
    }
}