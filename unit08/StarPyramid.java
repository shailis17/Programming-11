package unit08;
//extra credit assignment/busy work

public class StarPyramid
{
    public static void main (String args[])
    {
        for (int i=0; i<6; i++)
        {
          for (int j=0; j<i; j++)
          {
          System.out.print("*");
          }
          System.out.println(" ");
        }
    }
}