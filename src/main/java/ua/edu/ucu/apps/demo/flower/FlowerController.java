package ua.edu.ucu.apps.demo.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {

    private final FlowerService flowerservice;
    @Autowired
    public FlowerController(FlowerService flowerservice) {
        this.flowerservice = flowerservice;
    }
    @GetMapping
    public List<Flower> getFlowers(){
        return flowerservice.getflowers();
    }
    @PostMapping
    public void addFlowers(@RequestBody Flower flower){
        flowerservice.addflowers(flower);
    }
}
