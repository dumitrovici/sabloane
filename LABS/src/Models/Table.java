package Models;

import java.util.ArrayList;

public class Table implements Element,Observable{

    private String name;
    protected String newValue,oldValue;
    protected ArrayList<Observer> observers = new ArrayList<Observer>();
    public Table(String name){
        this.name=name;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public void print(){
        System.out.println("Table name: "+this.name);
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