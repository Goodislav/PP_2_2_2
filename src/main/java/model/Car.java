package model;

public class Car {
    private int id;
    private String model;
    private int mileage;
    private int yearOfProduction;

    public Car() {
    }

    public Car(int id, String model, int mileage, int yearOfProduction) {
        this.id = id;
        this.model = model;
        this.mileage = mileage;
        this.yearOfProduction = yearOfProduction;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
