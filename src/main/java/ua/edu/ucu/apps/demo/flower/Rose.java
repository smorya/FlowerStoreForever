package ua.edu.ucu.apps.demo.flower;

public class Rose extends Flower {

    private FlowerType flower = FlowerType.ROSE;

    public Rose(double sepalLength, String color, double price) {
        super(sepalLength, color, price);
    }
//    private FlowerColor color = FlowerColor.RED;
}
