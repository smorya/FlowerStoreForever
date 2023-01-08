package ua.edu.ucu.apps.demo.flower;

public class Rose extends Flower {

    private FlowerType flower = FlowerType.ROSE;

    public Rose(long id, double sepalLength, String color, double price) {
        super(id, sepalLength, color, price);
    }
//    private FlowerColor color = FlowerColor.RED;
}
