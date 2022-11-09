package ua.edu.ucu.apps.demo.flower;

public class FlowerPack {
    private Flower flower;
    private int amount;

    private double packetPrice;
    public FlowerPack(Flower newFlower, int newAmount) {
        flower = newFlower;
        amount = newAmount;
    }
    public double getPacketPrice() {
        packetPrice = flower.getPrice() * amount;
        return packetPrice;
    }
}
