package web.models;

import java.util.List;

public class Car {

    private String model;
    private int price;
    private String owner;

    public Car(String model, int price, String owner) {
        this.model = model;
        this.price = price;
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }
}
