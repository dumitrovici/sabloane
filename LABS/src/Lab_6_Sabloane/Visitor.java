package Lab_6_Sabloane;

import Lab_6_Sabloane.Image;
import Lab_6_Sabloane.ImageProxy;
import Lab_6_Sabloane.Paragraph;
import Lab_6_Sabloane.Table;

public interface Visitor {

    public abstract void visit(Image image);
    public abstract void visit(ImageProxy imageProxy);
    public abstract void visit(Paragraph paraghraph);
    public abstract void visit(Table table);
    public abstract void visit(Section section);
}
