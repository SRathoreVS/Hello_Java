package oopsInJava.digest;

public class Car {
    private String Color;
    private String brand ;
    private String model;
    private int year;
    private int speed;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void accelerate(int increament){
        speed += increament;
    }

    public void brake(int decreament){
        speed -= decreament;
    }


}
