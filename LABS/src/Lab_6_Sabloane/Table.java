package Lab_6_Sabloane;

public class Table implements Element
{
    protected String title;

    public Table(String t)
    {
        this.title=t;
    }

    public String toString() {
        return "Lab_3_Sabloane.Table [title=" + title + "]";
    }


    public void print()
    {
        System.out.println("Lab_3_Sabloane.Table title :" + this.title);
    }

    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }

}
