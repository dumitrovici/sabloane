package Lab_5_Sabloane;

import java.util.ArrayList;

public class Section implements Element

{
    protected String title;
    ArrayList<Element> sectiune = new ArrayList<>();


    public Section(String t)
    {
        this.title=t;
    }

    public void add(Element e)
    {
        sectiune.add(e);
    }

    public Element getElemet(int index )
    {
        return sectiune.get(index);
    }

    public void print()
    {
        System.out.println("Sectiune: " + title );
        for(Element e: sectiune)
        {
            e.print();
        }
    }


    public void remove(Element e)
    {
        sectiune.remove(e);
    }
}
