package ua.edu.ucu.apps.demo.flower;


public class RibbonDecorator extends ItemDecorator{

    @Override
    public double price() {
        return 40 + item.price();
    }

    @Override
    String getDesciption() {
        return "Chooses a ribbon for the flowers";
    }
}
