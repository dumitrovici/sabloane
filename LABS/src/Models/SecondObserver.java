package Models;

public class SecondObserver implements Observer{

    public void update(String value, String newValue) {
        System.out.println("Second Observer: Old value: "+value+" and new value: "+newValue);
    }
}
