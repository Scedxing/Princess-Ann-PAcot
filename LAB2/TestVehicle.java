import java.util.Scanner;

class Vehicle {
    private final String brand;
    private final double speed;
    private final String fuelType;

    // Constructor
    public Vehicle(String brand, double speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Encapsulation (getter)
    public String getBrand() {
        return brand;
    }

    public double getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    // displayInfo
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Vehicle extend
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, double speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, double speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

class TestVehicle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Car
        System.out.println("Enter the Car details");
        System.out.print("Brand: ");
        String carBrand = scan.nextLine();

        System.out.print("Speed: ");
        double carSpeed = scan.nextDouble();
        scan.nextLine(); // Consume newline

        System.out.print("FuelType: ");
        String carFuel = scan.nextLine();

        System.out.print("Number of Doors: ");
        int numDoors = scan.nextInt();
        scan.nextLine(); // Consume newline

        // Motorcycle
        System.out.println("Enter the Motorcycle details");
        System.out.print("Brand: ");
        String motorBrand = scan.nextLine();

        System.out.print("Speed: ");
        double motorSpeed = scan.nextDouble();
        scan.nextLine(); // Consume newline

        System.out.print("FuelType: ");
        String motorFuel = scan.nextLine();

        System.out.print("Has Sidecar ?(true/false): ");
        boolean hasSidecar = scan.nextBoolean();

        // Create Car object
        Car car = new Car(carBrand, carSpeed, carFuel, numDoors);
        System.out.println("Details of the Car");
        car.displayInfo();

        // Create Motorcycle object
        Motorcycle motor = new Motorcycle(motorBrand, motorSpeed, motorFuel, hasSidecar);
        System.out.println("Details of the Motorcycle");
        motor.displayInfo();

        scan.close();
    }
}
