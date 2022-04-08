package com.petshopmanagement.system;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {

    void print(Set set){
        for(Object object: set){
            System.out.println(object);
        }
    }

    int showUserMenu(){
        System.out.println("Enter 1.Add Pet \n 2.Remove Pet \n 3.Modify Pet \n 4.Print Pet \n 5.Exit");
        Scanner scanner = new Scanner(System.in);
        int option=scanner.nextInt();
        return option;
    }
}
