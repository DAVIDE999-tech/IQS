public class CarDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setNumberOfTires(1);
        System.out.println(vehicle.getDescription());

        Car car = new Car();
        car.setPlateNumber("AB123CD");
        System.out.println(car.getDescription());
    }
}
