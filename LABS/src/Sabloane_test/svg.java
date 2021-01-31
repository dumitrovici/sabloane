package Sabloane_test;



public class svg implements TipFisier
{
    private String numeSvg;

    public svg(String nume)
    {
        this.numeSvg=nume;
    }

    public void print()
    {
        System.out.println("Numele fisierului Svg este : " + numeSvg);
    }

    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }


}
