package Models;

public class FirstObserver implements Observer{
    public void update(String value, String newValue) {
        System.out.println("First Observer: Old value: "+value+" and new value: "+newValue);
    }
}
