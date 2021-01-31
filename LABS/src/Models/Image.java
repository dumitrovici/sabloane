package Models;
import Services.ImageLoaderFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Observable{

    private String imageName;
    protected String newValue,oldValue;
    protected ArrayList<Observer> observers = new ArrayList<Observer>();

    public Image(String name){
        this.imageName=name;
        try {
            TimeUnit.SECONDS.sleep(2);
            ImageLoaderFactory.create(name);

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
    public void accept(Visitor v) {
        v.visit(this);
    }

    public void print(){
        System.out.println("models.Image with name: "+this.imageName);
    }

    public void setNewValue(String newValue) {
        this.oldValue=this.newValue;
        this.newValue=newValue;
        System.out.println("Image: A fost inlocuita valoarea "+oldValue+" cu "+newValue);
    }


    public void addObserver(Observer obs) {
        observers.add(obs);
        System.out.println("Image: A fost adaugat "+obs);
    }

    public void removeObserver(Observer obs) {
        observers.remove(obs);
        System.out.println("Image: A fost sters " + obs);

    }
    public void notifyObserver(){
        System.out.println("Notificare Image");
    }
}