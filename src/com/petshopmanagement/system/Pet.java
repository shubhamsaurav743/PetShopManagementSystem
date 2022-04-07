package com.petshopmanagement.system;

public class Pet {
    String id;
    String name;
    String color;
    int price;

    void eat() {
        System.out.println(getClass().getSimpleName() + "eats");
    }

    void fly() {
        System.out.println(getClass().getSimpleName() + "fly");
    }

    void swim() {
        System.out.println(getClass().getSimpleName() + "swim");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
