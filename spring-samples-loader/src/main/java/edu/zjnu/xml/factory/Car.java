package edu.zjnu.xml.factory;

/**
 * @author: 杨海波
 * @date: 2022-12-16 09:37:48
 * @description: todo
 */
public class Car {
    private int maxSpeed;

    private String brand;

    private double price;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
