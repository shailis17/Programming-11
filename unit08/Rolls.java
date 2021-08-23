package unit08;

public class Rolls
{
    public static void main (String args[])
    {
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        Die d = new Die(6);
        for(int i = 1; i <= 50; i++)
        {
            d.roll();
            switch(d.faceValue)
            {
                case 1:
                one++;
                break;
                
                case 2:
                two++;
                break;
                
                case 3:
                three++;
                break;
                
                case 4:
                four++;
                break;
                
                case 5:
                five++;
                break;
                
                case 6:
                six++;
                break;
            }
        }
        
        System.out.println("Number of 1's: " + one);
        System.out.println("Number of 2's: " + two);
        System.out.println("Number of 3's: " + three);
        System.out.println("Number of 4's: " + four);
        System.out.println("Number of 5's: " + five);
        System.out.println("Number of 6's: " + six);
    }
}