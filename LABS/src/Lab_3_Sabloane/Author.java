package Lab_3_Sabloane;

public class Author
{
    protected String name;

    public Author(String name)
    {
        this.name=name;
    }

    public String toString()
    {
        return "Lab_3_Sabloane.Author [name=" + name + "]";
    }


    public void print()

    {
        System.out.println("Lab_3_Sabloane.Author : " + this.name);
    }
}
