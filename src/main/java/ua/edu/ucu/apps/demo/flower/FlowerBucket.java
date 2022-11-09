package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;

import java.util.ArrayList;
public class FlowerBucket {
    @Getter
    private ArrayList<FlowerPack> flowerBucket = new ArrayList();


    public void add(FlowerPack pack) {
        flowerBucket.add(pack);


    }

    public double getPrice() {
        double price = 0.0d;
        for (FlowerPack pack
                : getFlowerBucket()) {
            price += pack.getPacketPrice();

        }
        return price;

    }
}

