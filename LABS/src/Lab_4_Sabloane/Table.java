package Lab_4_Sabloane;

public class Table implements Element
{
    protected String title;

    public Table(String t)
    {
        this.title=t;
    }

    public String toString() {
        return "Table [title=" + title + "]";
    }


    public void print()
    {
        System.out.println("Table title :" + this.title);
    }

}
