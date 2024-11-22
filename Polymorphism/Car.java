public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with key ignition");
    }

    public void drift() {
        System.out.println("Car drifting");
    }
}
