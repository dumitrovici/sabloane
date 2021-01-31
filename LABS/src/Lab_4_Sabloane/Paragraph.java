package Lab_4_Sabloane;

public class Paragraph implements Element
{
    protected String text;

    public Paragraph(String t)
    {
        this.text=t;
    }

    public String toString() {
        return "Paragraph [text=" + text + "]";
    }

    public void print()
    {
        System.out.println("Paragraph :" + this.text);
    }
}