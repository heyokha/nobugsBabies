package org.example.HwCar;

public class Car implements Drivable {
    private String brand;
    private String model;
    private int year;
    private boolean isRunning;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isRunning = false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Автомобиль заведен.");
        } else {
            System.out.println("Автомобиль уже заведен.");
        }
    }

    @Override
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Автомобиль остановлен.");
        } else {
            System.out.println("Автомобиль уже остановлен.");
        }
    }

    @Override
    public void drive(int distance) {
        if (isRunning) {
            System.out.println("Автомобиль проехал " + distance + " километров.");
        } else {
            System.out.println("Сначала нужно завести автомобиль.");
        }
    }
}
