public class Car extends Vehicle {
    private String plateNumber;

    public Car() {
        setNumberOfTires(4);
        plateNumber = "";
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getDescription() {
        return "Sono un'automobile e quindi " + super.getDescription() +
                " e con targa " + plateNumber;
    }

    @Override
    public String toString() {
        return "Sono un'automobile e quindi " + super.toString() +
                " e con targa " + plateNumber;
    }
}
