package Lab_6_Sabloane;

public class Image implements Element
{
    protected String imageName;

    public Image(String s)
    {
        this.imageName=s;
    }

    public String toString()
    {
        return "Image [imageName=" + imageName + "]";
    }


    public void print()
    {
        System.out.println("Image with name :" + this.imageName);
    }

    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}