package ua.edu.ucu.apps.flowerstore;

import lombok.Getter;

public abstract class Item {
    private double price;
    public abstract String getDescription();
    public abstract double price();
}
