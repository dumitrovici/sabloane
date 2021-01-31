package Sabloane_test;

public class Test_Main {


    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Director d1 = new Director("Director1");

        txt text1 = new txt("Some Text");
        mp3 mp3_1 = new mp3 ("Mp3_1");
        svg svg_1 = new svg("Svg_1");

        d1.addFisiere(text1);
        d1.addFisiere(mp3_1);
        d1.addFisiere(svg_1);

        System.out.println("Without Alignment");
        d1.print();
        System.out.println("");

        text1.setAlignStrategy(new AlignRight());

        System.out.println("With Alignment");

        d1.print();


        CalculDimensiune calcul = new CalculDimensiune();
        d1.accept(calcul);
        calcul.afisareDimensiune();


        /* OUT PUT

                        Without Alignment
                Numele Directorului este : Director1Structura :
                Some Text
                Numele fisierului mp3 este : Mp3_1
                Numele fisierului Svg este : Svg_1

                With Alignment
                Numele Directorului este : Director1Structura :
                Some Text>>>>>
                Numele fisierului mp3 este : Mp3_1
                Numele fisierului Svg este : Svg_1
                Dimensiunea Fisierelor este  :
                Dimensiunea fisierelor txt este : 5Kb .
                Dimensiunea fisierelor svg este : 45Kb .
                Dimensiunea fisierelor txt este : 3MB .

         */

    }
}
