package Sabloane_test;

public class CalculDimensiune implements Visitor
{

        public int dimensiuneMp3=0;
        public int dimensiuneTxt=0;
        public int dimensiuneSvg=0;

    public void visit(txt text)
    {
        dimensiuneTxt=dimensiuneTxt + 5 ;
    }

    public void visit(svg svg) { dimensiuneSvg=dimensiuneSvg + 45; }

    public void visit(mp3 mp3)
    {
        dimensiuneMp3=dimensiuneMp3 + 3;
    }


    public void afisareDimensiune()
    {
        System.out.println("Dimensiunea Fisierelor este  : ");
        System.out.println("Dimensiunea fisierelor txt este : " + dimensiuneTxt + "Kb .");
        System.out.println("Dimensiunea fisierelor svg este : " + dimensiuneSvg + "Kb .");
        System.out.println("Dimensiunea fisierelor txt este : " + dimensiuneMp3 + "MB .");

    }
}
