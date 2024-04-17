public class Scouser extends Person
{
    public Scouser(String aName, int anAge)
    {
        super(aName, anAge); // must be first line of subclass constructor
    }

    @Override
    public void greeting()
    {
        super.greeting();

        System.out.println(" and Arite, cocker!");
    }


}
