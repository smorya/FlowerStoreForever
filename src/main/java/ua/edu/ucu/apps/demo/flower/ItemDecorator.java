package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;
import lombok.Setter;

abstract class ItemDecorator extends Item {
    @Getter
    @Setter
    public Item item;
    abstract String getDesciption();
}
