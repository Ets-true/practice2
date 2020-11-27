package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class DogFarm {

    private List<Dog> dogs;

    public DogFarm() {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void addAllDogs(Dog ... dogs) {
        Collections.addAll(this.dogs, dogs);
    }

    @Override
    public String toString() {
        return "DogNursery{" + "dogs=" + dogs + '}';
    }

}
