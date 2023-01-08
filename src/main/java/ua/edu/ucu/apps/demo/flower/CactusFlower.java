package ua.edu.ucu.apps.demo.flower;

public class CactusFlower extends Flower{
    private FlowerType flower = FlowerType.CACTUSFLOWER;

    public CactusFlower(long id, double sepalLength, String color, double price) {
        super(id, sepalLength, color, price);
    }


//    private FlowerColor color = FlowerColor.GREEN;
}
