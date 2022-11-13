package ua.edu.ucu.apps.demo.flower;



public class BasketDecorator extends ItemDecorator{

    @Override
    public double price() {
        return 4 + getItem().price();
    }

    @Override
    String getDesciption() {
        return "Decorates the basket with flowers";
    }
}
