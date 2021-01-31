package Models;

import java.util.ArrayList;

public class Section implements Element,Observable{

    protected String sectionTitle;
    protected ArrayList<Element> content = new ArrayList<>();
    protected ArrayList<Observer> observers = new ArrayList<Observer>();

    public Section(String sectionTitle){
        this.sectionTitle=sectionTitle;
    }
    protected   String newValue,oldValue;
    public int add(Element elm){
        content.add(elm);
        return content.indexOf(elm);
    }

    public void accept(Visitor v) {

        v.visit(this);
        for (Element i:content){
            i.accept(v);
        }
    }

    public void remove(Element elm){
        content.remove(elm);
    }

    public Element getElement(int index){
        return content.get(index);
    }

    public void print(){
        System.out.println("Section: "+this.sectionTitle);
        for(Element i : content){
            i.print();
        }
    }

    public void setNewValue(String newValue) {
        this.oldValue=this.newValue;
        this.newValue=newValue;
        System.out.println("Section: A fost inlocuita valoarea "+oldValue+" cu "+newValue);
    }


    public void addObserver(Observer obs) {
        observers.add(obs);
        System.out.println("Section: A fost adaugat " + obs);
    }

    public void removeObserver(Observer obs) {
        observers.remove(obs);
        System.out.println("Section: A fost sters " + obs);

    }

    public void notifyObserver() {
        System.out.println("Notificare Section");
    }
}