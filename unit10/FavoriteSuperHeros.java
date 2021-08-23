package unit10;

public class FavoriteSuperHeros
{
    public static void main (String args[])
    {
        String[] arr = {"Captain America", "Thor", "Black Widow", "Antman", "Captain Marvel"};
        
        System.out.println("My Top 5 SuperHeroes:");
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println((i+1) + ". " + arr[i]);
        }
    }
}