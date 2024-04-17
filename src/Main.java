// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        Person p = new Person("Alice", 32);
        System.out.println(p.toString());
        p.greeting();

        System.out.println();

        Scouser s = new Scouser("Sinbad", 55);
        System.out.println(s.toString());
        s.greeting();


    }
}