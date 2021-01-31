package Lab_3_Sabloane;

public class test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);
        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        noapteBuna.addContent(new Paragraph("Multumesc celor care au facut posibila......"));
        noapteBuna.addContent(cap1);

        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));
        cap11.add(cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new Image("Lab_3_Sabloane.Image subchapter 1.1.1.1"));
        noapteBuna.print();
    }
}

        /*
        Lab_3_Sabloane.Book discoTitanic = new Lab_3_Sabloane.Book("Disco Titanic");
        Lab_3_Sabloane.Author rpGheo = new Lab_3_Sabloane.Author("Radu Pavel Gheo");

        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");

        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);

        scOneOne.createNewParagraph("Lab_3_Sabloane.Paragraph 1");
        scOneOne.createNewParagraph("Lab_3_Sabloane.Paragraph 2");
        scOneOne.createNewParagraph("Lab_3_Sabloane.Paragraph 3");
        scOneOne.createNewImage("Lab_3_Sabloane.Image 1");
        scOneOne.createNewParagraph("Lab_3_Sabloane.Paragraph 4");
        scOneOne.createNewTable("Lab_3_Sabloane.Table 1");
        scOneOne.createNewParagraph("Lab_3_Sabloane.Paragraph 5");

        scOneOne.print();


    }
*/

