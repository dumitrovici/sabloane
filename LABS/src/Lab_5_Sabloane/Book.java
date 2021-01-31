package Lab_5_Sabloane;

import java.util.ArrayList;

public class Book
{
    protected String title;

    protected ArrayList<Element> content= new ArrayList();
    protected ArrayList<Author> autori= new ArrayList();


    public Book (String title)
    {
        this.title=title;
    }


    public void addContent(Element e)
    {
        content.add(e);
    }

    public void addAuthor(Author x)
    {
        autori.add(x);
    }


    public String toString()
    {
        return "Lab_3_Sabloane.Book{" +
                "title='" + title + '\'' +
                ", content=" + content +
                '}';
    }
public void print()
{
     System.out.println("Titlu:" + title);
    for (Author s: autori)
    {
        s.print();
    }

    for (Element e: content)
    {
        e.print();
    }
}
    /*
    public int createChapter (String n)
    {
        Chapter x = new Chapter(n);
        ch.add(x);
        return ch.indexOf(x);
    }

    public Chapter getChapter(int x)
    {
        return ch.get(x);
    }

    public void print()
    {
        System.out.println("Lab_3_Sabloane.Book title : " + this.title);

        for(Lab_3_Sabloane.Author s: autori)
        {
            s.print();
        }

        for(Chapter s: ch)
        {
            s.print();
        }
    }

 */
}