package ua.edu.ucu.apps.demo.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@NoArgsConstructor
@Entity
@Table
public class Flower {
    @Getter
    private double sepalLength;
    private String color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;
    @Id @Getter
    private Long id;

    public Flower(double sepalLength, String color, double price) {
        this.price = price;
        this.sepalLength = sepalLength;
        this.color = color;

    }

    public void setPrice(int number) {
        price = number;
    }


    public String getColor() {
        return color;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
