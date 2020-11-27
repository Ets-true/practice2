package com.company;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Book book = new Book();
        Ball ball = new Ball();

        DogFarm farm = new DogFarm();
        Dog dog_1 = new Dog("Jack", 5);
        System.out.println(dog_1);
        farm.addDog(dog_1);

    }

}
