package Lab_5_Sabloane;

public class Image implements Element
{
    protected String imageName;

    public Image(String s)
    {
        this.imageName=s;
    }

    public String toString()
    {
        return "Lab_3_Sabloane.Image [imageName=" + imageName + "]";
    }


    public void print()
    {
        System.out.println("Lab_3_Sabloane.Image with name :" + this.imageName);
    }

}