package Sabloane_test;

public class AlignLeft implements AlignStrategy
{
    public void render(String text)
    {
        System.out.println("<<<<<"+text);
    }
}
