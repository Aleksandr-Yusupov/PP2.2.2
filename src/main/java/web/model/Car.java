package web.model;

public class Car {
    public String model;
    private int year;
    private int mileage;
    public Car(String model, int year, int mileage) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
