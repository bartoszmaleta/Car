package secondTry;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEnging()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

	@Override
	public String accelerate() {
        return "Mitsubishi -> accelerate()";
	}

	@Override
	public String brake() {
        return "Mitsubishi -> brake()";
	}

	@Override
	public String startEngine() {
        return "Mitsubishi -> startEnging()";
	}
}

class Skoda extends Car {

    public Skoda(int cylinders, String name) {
        super(cylinders, name);
    }

	@Override
	public String accelerate() {
        return "Skoda -> accelerate()";
	}

	@Override
	public String brake() {
        return "Skoda -> brake()";
	}

	@Override
	public String startEngine() {
        return "Skoda -> startEnging()";
	}
}

class Volkswagen extends Car {

    public Volkswagen(int cylinders, String name) {
        super(cylinders, name);
    }

	@Override
	public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
	}

	@Override
	public String brake() {
        // COOOOOOOOOOOOL THING!!!!!!!!!!
        return getClass().getSimpleName() + " -> brake()";
	}

	@Override
	public String startEngine() {
        return "Volkswagen -> startEnging()";
	}
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println("------------");

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println("------------");

        Skoda skoda = new Skoda (6, "Octavia");
        System.out.println(skoda.startEngine());
        System.out.println(skoda.accelerate());
        System.out.println(skoda.brake());

        System.out.println("------------");

        Volkswagen volkswagen = new Volkswagen (6, "Passat");
        System.out.println(volkswagen.startEngine());
        System.out.println(volkswagen.accelerate());
        System.out.println(volkswagen.brake());


    }
}