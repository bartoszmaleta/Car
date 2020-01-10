package app;

public class Octavia extends Car {
    private int seatbelts;

    public Octavia(String name, boolean engine, int cylinders, int wheels, int velocity, int seatbelts) {
        super(name, engine, cylinders, wheels, velocity);
        this.seatbelts = seatbelts;
    }

    public int getSeatbelts() {
        return seatbelts;
    }

    public void setSeatbelts(int seatbelts) {
        this.seatbelts = seatbelts;
    }
}