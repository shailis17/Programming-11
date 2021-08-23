package unit06;
import java.util.*;
import java.text.DecimalFormat;

public class TempConversion
{
    static DecimalFormat df = new DecimalFormat("#");
    
    public static void main(String arg[])
    {
        int choice;
        double temp;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");
        
        System.out.print("Enter your temperature: ");
        temp = sc.nextDouble();
        
        System.out.println("Conversion: ");
        System.out.println("1) Fahrenheit to Celsius \n2) Celsius to Fahrenheit");
        choice = sc.nextInt();
        
        if(choice == 1)
        {
            fTOc(temp);
        }
        else if(choice == 2)
        {
            cTOf(temp);
        }
        else
        {
            System.out.print("Invalid number");
        }
        
    }
    public static void fTOc(double F)
    {
        double celsius;
        celsius = (5.0/9.0)*(F -32);
        System.out.print(df.format(F) + "˚F is " + df.format(celsius) + "˚C"); 
    }
    public static void cTOf(double C)
    {
        double fahrenheit;
        fahrenheit = (9.0/5.0)*C + 32;
        System.out.print(df.format(C) + "˚F is " + df.format(fahrenheit) + "˚C");
    }
}