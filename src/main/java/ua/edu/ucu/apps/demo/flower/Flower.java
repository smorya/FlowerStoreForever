package ua.edu.ucu.apps.demo.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Flower {
    @Id @Getter @GeneratedValue
    private Long id;
    @Getter
    private double sepalLength;
    @Getter
    private String color;
    @Getter
    private double price;


    public void setPrice(int number) {
        price = number;
    }


}
