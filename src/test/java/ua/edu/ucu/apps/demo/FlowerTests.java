package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.flower.*;
import org.junit.jupiter.api.Assertions;

public class FlowerTests {
    private Flower cactus;
    private Flower romashka;
    private FlowerPack pack ;

    @BeforeEach
    public void init(){
        FlowerBucket flowerBucket = new FlowerBucket();
        cactus = new CactusFlower(1, 3,"Green", 100);
        romashka = new RomashkaFlower(2, 3,"Blue", 100);
        pack = new FlowerPack(cactus, 3);

    }
    @Test
    public void TestFlower(){
        Assertions.assertTrue(cactus instanceof Flower);
        Assertions.assertTrue(romashka instanceof Flower);
        Assertions.assertEquals(300, pack.getPacketPrice());
    }


}
