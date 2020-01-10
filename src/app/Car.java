package app;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, boolean engine, int cylinders, int wheels) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean getEngine() {
        return engine;
    }
    
    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    
    
    }

}