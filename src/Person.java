/**
 * Represents a person
 */

public class Person
{
    private String name;
    private int age;

    /**
     * Constructs a new object of the Person class
     * @param aName the person's name (e.g. Alice)
     * @param anAge the person's age (e.g. 32)
     */
    public Person(String aName, int anAge)
    {
        this.name = aName;
        this.age = anAge;
    }

    /**
     * Returns the name of the person
     * @return the name of the person
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Sets the person's name
     * @param newName The new name for the person
     */
    public void setName(String newName)
    {
        this.name = newName;
    }

    /**
     * Returns the age of the person
     * @return the person's age (e.g. 21)
     */
    public int getAge()
    {
        return this.age;
    }

    /**
     * Increments the age of the person
     */
    public void birthday()
    {
        this.age++;
    }

    /**
     * Outputs a standard greeting
     */
    public void greeting()
    {
        System.out.println("Hello");
    }

    /**
     * Returns a string describing the state of the Person object
     * @return a string describing the state of the Person object
     */
    @Override
    public String toString()
    {
        return "An object of " + this.getClass() + " with name " + this.getName() + " and age " + this.getAge();
    }

}
