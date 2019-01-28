package ru.dorenskiy.javacore.fruits;

public class Application {
    public static void main(String[] args){

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Box<Orange> box1 = new Box<Orange>();
        Box<Orange> box3 = new Box<Orange>();
        Box<Apple> box2 = new Box<Apple>();

        box1.putInBox(orange1);
        box1.putInBox(orange2);

        box2.putInBox(apple1);
        box2.putInBox(apple2);
        box2.putInBox(apple3);

        box3.putInBox(orange3);
        box3.putInBox(orange4);
        box3.putInBox(orange5);

        System.out.println("вес коробки 1: " + box1.getWeight());
        System.out.println("вес коробки 2: " + box2.getWeight());
        System.out.println("вес коробки 3: " + box3.getWeight());

        System.out.println("коробки 1 и 2 весят одинаково? " + box1.compare(box2));

        box1.fruitsChangeBox(box3);

        System.out.println("пересыпаем...");
        System.out.println("теперь в коробке № 3 находится фруктов: " + box3.getWeight());
        System.out.println("теперь в коробке № 1 находится фруктов: " + box1.getWeight());
    }
}
