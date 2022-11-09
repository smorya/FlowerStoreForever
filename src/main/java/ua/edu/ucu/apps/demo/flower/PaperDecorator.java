package ua.edu.ucu.apps.demo.flower;


public class PaperDecorator extends ItemDecorator {

    @Override
    public double price() {
        return 13 + item.price();
    }

    @Override
    String getDesciption() {
        return "Decorates flowers with paper";
    }
}


