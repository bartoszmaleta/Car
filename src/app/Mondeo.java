package app;

public class Mondeo extends Car {
    private int parkingSensors;

    public Mondeo(String name, boolean engine, int cylinders, int wheels, int velocity, int parkingSensors) {
        super(name, engine, cylinders, wheels, velocity);
        this.parkingSensors = parkingSensors;
    }

    public int getParkingSensors() {
        return parkingSensors;
    }

    public void setParkingSensors(int parkingSensors) {
        this.parkingSensors = parkingSensors;
    }
        
}