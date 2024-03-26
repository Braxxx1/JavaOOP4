package ru.geekbrains.oop.lesson4.homework;

import java.util.ArrayList;

import javax.sound.sampled.AudioFileFormat.Type;

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> anotherBox) {
        return this.getWeight() == anotherBox.getWeight(); 
    }

    public void pourTo(Box<T> anotherBox) {
        if (this == anotherBox) {
            return; 
        }
        for (T fruit : fruits) {
            anotherBox.addFruit(fruit);
        }
        fruits.clear(); 
    }
}