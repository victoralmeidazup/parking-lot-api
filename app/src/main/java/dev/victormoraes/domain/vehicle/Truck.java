package dev.victormoraes.domain.vehicle;

public class Truck extends Vehicle {
    public Truck(Long vehicleId, String plate, String model, String color) {
        super(vehicleId, plate, model, color);
    }

    public Truck() {
        super();
    }
}
