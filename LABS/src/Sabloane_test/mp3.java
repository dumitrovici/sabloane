package Sabloane_test;

public class mp3 implements TipFisier{

    private String NumeMp3;

    public mp3(String nume)
    {
        this.NumeMp3=nume;
    }

    public void print()
    {
        System.out.println("Numele fisierului mp3 este : " + NumeMp3);
    }

    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
