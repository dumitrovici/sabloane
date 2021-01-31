package Models;

import Services.AlignStrategy;

import java.util.ArrayList;

public class Paragraph implements Element,Observable{

    protected String newValue,oldValue;
    protected ArrayList<Observer> observers = new ArrayList<Observer>();
    private String name;
    private AlignStrategy alignStrategy;

    public Paragraph(String name){
        this.name=name;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }


    public void print(){

        if(alignStrategy==null) {
            System.out.println(this.name);
        }else{
            alignStrategy.render(this.name);
        }
    }

    public void setAlignStrategy(AlignStrategy alignStrategy){
        this.alignStrategy=alignStrategy;
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