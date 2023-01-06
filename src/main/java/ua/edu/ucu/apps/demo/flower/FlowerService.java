package ua.edu.ucu.apps.demo.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    @Autowired
    private FlowerRepository flowerrepository;
    public FlowerService(FlowerRepository flowerrepository) {
        this.flowerrepository = flowerrepository;
    }

    public List<Flower> getflowers(){
        return flowerrepository.findAll();
//        return List.of(new CactusFlower(3, "Green", 100));
    }
    public void addflowers(Flower flower){
        flowerrepository.save(flower);
    }
}
