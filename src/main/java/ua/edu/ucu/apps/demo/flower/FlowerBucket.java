package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;

import java.util.ArrayList;
public class FlowerBucket {
    @Getter
    private ArrayList<FlowerPack> flowerBucket = new ArrayList();


    public void addFlowers(FlowerPack pack) {
        flowerBucket.add(pack);


    }
    public Boolean searchFlowers(Flower flowerToSearch) {
        for (FlowerPack pack : getFlowerBucket()) {
            if (pack.getFlower() == flowerToSearch) {
                return true;
            }

        }
        return false;
    }

    public double price() {
        double price = 0.0d;
        for (FlowerPack pack
                : getFlowerBucket()) {
            price += pack.getPacketPrice();

        }
        return price;

    }
}

