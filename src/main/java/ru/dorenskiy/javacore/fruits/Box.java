package ru.dorenskiy.javacore.fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits = new ArrayList<T>();

    void putInBox (T fruit){
        this.fruits.add(fruit);
    }

    float getWeight(){
        float sum = 0;
        for (T o : fruits){
            sum += o.weight;
        }
        return sum;
    }

    boolean compare(Box<?> box){    // Тут <?>, т.к. типы сравниваемых коробок могут не совпдать.
        return box.getWeight() == this.getWeight(); //this вызывает метод getWeight для экземпляра класса, для которого метод ompare будет вызван.
    }

    void fruitsChangeBox(Box<T> box){
        for (T o : this.fruits){
            box.putInBox(o);
        }
        this.fruits.clear();
    }
}
