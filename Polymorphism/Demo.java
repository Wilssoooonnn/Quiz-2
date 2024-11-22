public class Demo {
    public static void main(String[] args) {
        // heterogeneous Collection
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Motorcycle();
        vehicles[2] = new Vehicle();

        // Polymorphic Arguments
        for (Vehicle v : vehicles) {
            v.startEngine();

            if (v instanceof Car) {
                Car car = (Car) v; // Object casting
                car.drift();
            } else if (v instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) v; // Object casting
                motorcycle.doWheelie();
            } else {
                System.out.println("Unknown vehicle type");
            }
            System.out.println("---");
        }

    }

    public static void startEngine(Vehicle v) {
        v.startEngine();
    }
}
