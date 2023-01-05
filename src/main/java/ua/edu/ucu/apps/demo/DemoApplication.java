package ua.edu.ucu.apps.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.flower.*;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping(path = "/api/v1/flowers")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//	@RequestMapping(path = "/flowers")
	@GetMapping
	public static List<FlowerBucket> RunIt(){
		FlowerBucket flowerBucket = new FlowerBucket();
		CactusFlower cFlower = new CactusFlower(3, "Green", 100);
		RomashkaFlower rFlower = new RomashkaFlower(3, "Blue", 100);
		FlowerPack pack1 = new FlowerPack(cFlower, 3);
		FlowerPack pack2 = new FlowerPack(rFlower, 5);

		flowerBucket.addFlowers(pack1);
		flowerBucket.addFlowers(pack2);

		return List.of(flowerBucket);
	}


}
