package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;

public class FlowerPack {
    @Getter
    private Flower flower;
    @Getter
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
