package Sabloane_test;
import java.util.ArrayList;


public class Director implements TipFisier{

    private String numeDirector;
    private ArrayList<TipFisier> listaFisiere = new ArrayList<>();


    public Director(String numeDirector)
    {
        this.numeDirector=numeDirector;
    }

    public void addFisiere(TipFisier fisier)
    {
        listaFisiere.add(fisier);
    }

    public TipFisier getFisier(int index)
    {
        return listaFisiere.get(index);
    }


    public void print()
    {
        System.out.println("Numele Directorului este : " + numeDirector + "Structura : ");
        for (TipFisier s: listaFisiere)
        {
            s.print();
        }
    }


    public void accept(Visitor visitor) {
        for (TipFisier e : listaFisiere)
            e.accept(visitor);
    }
}
