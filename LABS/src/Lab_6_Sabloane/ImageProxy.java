package Lab_6_Sabloane;

public class ImageProxy implements Element
{
    private String name;
    Image imagine=null;

    public ImageProxy(String name)
    {
        this.name=name;
    }

    public void print() {
        if(imagine ==null)
        {
            imagine = new Image(this.name);
        }

        imagine.print();
    }

    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
