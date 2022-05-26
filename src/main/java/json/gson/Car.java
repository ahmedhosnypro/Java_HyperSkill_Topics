package json.gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    private final String name;
    private final String model;
    private final int price;
    private final String[] colours;

    public Car(String name, String model, int price, String[] colours) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.colours = colours;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", model=" + model + ", price=" + price + ", colours=" + Arrays.toString(colours) + '}';
    }

    static List<Car> createCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "2012", 22000, new String[]{"gray", "red", "white"}));
        cars.add(new Car("Skoda", "2016", 14000, new String[]{"black", "gray", "white"}));
        cars.add(new Car("Volvo", "2010", 19500, new String[]{"black", "silver", "beige"}));
        return cars;
    }
}