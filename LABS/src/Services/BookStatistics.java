package Services;

import Models.*;

public class BookStatistics implements Visitor {

    int paragraphs=0,sections=0,imageproxy=0,images=0,tables=0,book=0;


    public void visit(Book b) {
        book++;
    }


    public void visit(Section s) {
        sections++;
    }


    public void visit(Paragraph p) {
        paragraphs++;
    }


    public void visit(ImageProxy ip) {
        imageproxy++;
    }


    public void visit(Image i) {
        images++;
    }


    public void visit(Table t) {
        tables++;
    }

    public void printStatistics(){
        System.out.println("Books: "+book+"\nSections: "+sections+"\nparagraphs: "+paragraphs+"\nimages: "+images+"\nimageproxy: "+imageproxy+"\ntables: "+tables);
    }
}