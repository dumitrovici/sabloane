package Sabloane_test;

public class txt implements TipFisier{

    private String text;
    private AlignStrategy alineat;

    public txt(String text)
    {
        this.text=text;
    }

    public void setAlignStrategy(AlignStrategy alineat )
    {
        this.alineat=alineat;
    }

    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }

    public void print()
    {
        if(alineat==null)
        {
            System.out.println(this.text);
        }
        else
        {
            alineat.render(this.text);
        }

    }


    public void accept(Lab_6_Sabloane.Visitor visitor) {

    }
}
