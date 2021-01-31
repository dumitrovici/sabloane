package Lab_6_Sabloane;

public class Paragraph implements Element
{
    protected String text;
    protected AlignStrategy align;

    public Paragraph(String t)
    {
        this.text=t;
    }

    public String toString() {
        return "Paragraph [text=" + text + "]";
    }

    public void print()
    {
        if(align==null)
            {
                System.out.println(this.text);
            }
        else
            {
                align.render(this.text);
            }

    }

    public void setAlignStrategy(AlignStrategy x)
    {
       this.align=x;
    }

    public String getText()
    {
        return this.text;
    }

    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}