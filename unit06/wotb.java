package unit06;

public class wotb  //Wheels on the Bus
{
    public static void main(String args[])
    {
        sing("wheels", "round and round");
        sing("wipers", "swish swish swish");
        sing("doors", "open and shut");
        sing("wheels", "round and round");
    }
    
    public static void sing(String part, String action)
    {
        System.out.println("The " + part + " on the bus go " + action);
        System.out.println(action);
        System.out.println(action);
        System.out.println("The " + part + " on the bus go " + action);
        System.out.println("All through the town.\n \n ");
    }
}