package ua.edu.ucu.apps.demo.flower;

abstract class Item {
    String description;
    public abstract double price();
    public String getDescription(){
        return description;
    }

}
