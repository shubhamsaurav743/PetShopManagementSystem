package com.petshopmanagement.system;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Pet Shop !!!!!");
        Cat cat=new Cat();
        cat.id = "C001";
        cat.price = 1000;
        Dog dog=new Dog();
        dog.id = "D001";
        dog.price = 2000;
        Duck duck=new Duck();
        duck.id = "DU001";
        duck.price = 3000;
        LoveBirds lovebirds=new LoveBirds();
        lovebirds.id = "L001";
        lovebirds.price = 4000;
        Macau macau=new Macau();
        macau.id = "M001";
        macau.price = 5000;

        PetRepository petRepository=new PetRepository();
        petRepository.add(cat);
        petRepository.add(dog);
        petRepository.add(duck);
        petRepository.add(lovebirds);
        petRepository.add(macau);

        UserInterface userInterface=new UserInterface();
        userInterface.print(petRepository.getPetList());

    }
}
