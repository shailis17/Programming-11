package unit06;
import java.util.*;
import java.text.DecimalFormat;

public class TempConversionV2
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
        System.out.println("3) Farenheit to Kelvin \n4) Kelvin to Fahrenhiet");
        System.out.println("5) Celsius to Kelvin \n6) Kelvin to Celsius");
        choice = sc.nextInt();
        
        switch(choice)
        {
            case 1:
            System.out.print(fTOc(temp) + "°C");
            break;
            
            case 2:
            System.out.print(cTOf(temp) + "°F");
            break;
            
            case 3:
            System.out.print(fTOk(temp) + "K");
            break;
            
            case 4:
            System.out.print(kTOf(temp) + "°F");
            break;
            
            case 5:
            System.out.print(cTOk(temp) + "K");
            break;
            
            case 6:
            System.out.print(kTOc(temp) + "°C");
            break;
        }
    }
    public static double fTOc(double temp)
    {
        return (5.0/9.0)*(temp -32);
    }
    public static double cTOf(double temp)
    {
        return (9.0/5.0)*temp + 32;
    }
    public static double fTOk(double temp)
    {
        //(°F − 32) × 5/9 + 273.15 = K
        return ((5.0/9.0)*(temp -32)) + 273.15;
    }
    public static double kTOf(double temp)
    {
        //(K − 273.15) × 9/5 + 32 = °F
        return ((temp - 273.15) * (9.0/5.0)) + 32;
    }
    public static double cTOk(double temp)
    {
        //°C + 273.15 = K
        return temp + 273.15;
    }
    public static double kTOc(double temp)
    {
        //K − 273.15 = °C
        return temp - 273.15;
    }
}