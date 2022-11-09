package ua.edu.ucu.apps.demo;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.flower.FlowerPack;
import ua.edu.ucu.apps.demo.flower.Flower;
@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}
	public List<FlowerBucket> getFlowers(){
		FlowerBucket flowerBucket = new FlowerBucket();
		Flower flower = new Flower();
		FlowerPack pack = new FlowerPack(flower, 3);

//		flowerBucket.add()
//		return


	}


}
