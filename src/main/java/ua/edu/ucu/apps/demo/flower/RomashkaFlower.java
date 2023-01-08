package ua.edu.ucu.apps.demo.flower;

public class RomashkaFlower extends Flower{
    private FlowerType flower = FlowerType.ROMASHKAFLOWER;

    public RomashkaFlower( long id, double sepalLength, String color, double price) {
        super( id, sepalLength, color, price);
    }
//    private FlowerColor color = FlowerColor.BLUE;
}
