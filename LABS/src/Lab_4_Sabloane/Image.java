package Lab_4_Sabloane;

public class Image implements Element
{
    protected String imageName;

    public Image(String s)
    {
        this.imageName=s;
    }

    public void print()
    {
        System.out.println("Image with name :" + this.imageName);
    }

}