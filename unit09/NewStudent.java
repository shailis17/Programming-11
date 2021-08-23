package unit09;

public class NewStudent
{
    public static void main (String args[])
    {
        Student s = new Student("Anne Smith", 2394923, 11, 7);
        s.moveUpYear();
        s.printStudent();
    }
}