package com.petshopmanagement.system;

import java.util.Objects;

public class Pet {
    enum Color {
        RED, GREEN, WHITE, BLACK, BLUE, BLACK_WHITE
    }

    String id;
    String name;
    Color color;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return id.equals(pet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
