package app;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int velocity;

    public Car(String name, boolean engine, int cylinders, int wheels, int velocity) {
        this.name = name;
        this.engine = engine; // change to true in future
        this.cylinders = cylinders;
        this.wheels = 4;
        this.velocity = 0;
    }

    public void startEngine() {
        this.engine = true;
        System.out.println("Engine started");
    }

    public int accelerate(int speedToChange) {
        System.out.println("Previous velocity = " + this.velocity);
        this.velocity = this.velocity + speedToChange;
        System.out.println("Car is accelerating");
        System.out.println("Velocity changed by = " + speedToChange);
        System.out.println("Actual velocity = " + this.velocity);
        return this.velocity;
    }

    public int brake(int speedToChange) {
        System.out.println("Previous velocity = " + this.velocity);
        this.velocity = this.velocity - speedToChange;
        System.out.println("Car is stoping");
        System.out.println("Velocity changed by = " + speedToChange);
        System.out.println("Actual velocity = " + this.velocity);
        return this.velocity;
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

    public int getVelocity() {
        return velocity;
    }

    

    public static void main(String[] args) {
        Car myCar = new Car("Tesla", false, 8, 4, 0);

        System.out.println(myCar.getEngine());
        myCar.startEngine();
        System.out.println(myCar.getEngine());

        System.out.println("------------");

        System.out.println(myCar.getVelocity());
        myCar.accelerate(10);
        System.out.println(myCar.getVelocity());

        System.out.println("------------");

        System.out.println(myCar.getVelocity());
        myCar.brake(5);
        System.out.println(myCar.getVelocity());

        System.out.println("------------");

        Octavia octavia = new Octavia("Octaviee", false, 8, 4, 0, 5);

        Mondeo mondeo = new Mondeo("Mondek", false, 8, 4, 0, 10);

        Insignia insignia = new Insignia("Insi", false, 10, 4, 0, 1);


        System.out.println("------------");

        System.out.println(octavia.getName());
        System.out.println(octavia.getVelocity());
        octavia.accelerate(4);
        System.out.println(octavia.getVelocity());

        System.out.println("------------");

        System.out.println(octavia.getName());
        System.out.println(octavia.getVelocity());
        octavia.brake(5);
        System.out.println(octavia.getVelocity());
    }
}

class Octavia extends Car {
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

class Mondeo extends Car {
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

class Insignia extends Car {
    private int reversingCamera;

    public int getReversingCamera() {
        return reversingCamera;
    }

    public void setReversingCamera(int reversingCamera) {
        this.reversingCamera = reversingCamera;
    }

    public Insignia(String name, boolean engine, int cylinders, int wheels, int velocity, int reversingCamera) {
        super(name, engine, cylinders, wheels, velocity);
        this.reversingCamera = reversingCamera;
    }
}