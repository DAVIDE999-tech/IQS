public class CarDemo1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setNumberOfTires(1);
        process(vehicle, "ZZ123CC");

        Car car = new Car();
        car.setNumberOfTires(4);
        process(car, "AB123CD");
    }

    private static void process(Vehicle vehicle, String plateNumber) {
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.setPlateNumber(plateNumber);
        }
        System.out.println(vehicle);
    }
}
