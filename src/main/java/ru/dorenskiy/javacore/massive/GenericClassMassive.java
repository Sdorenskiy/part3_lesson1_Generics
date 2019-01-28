package ru.dorenskiy.javacore.massive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericClassMassive<T> {

    private T[] mas;
    List<T> list = new ArrayList<T>();

    public GenericClassMassive(T[] mas) {     //Конструктор
        this.mas = mas;
    }

    void changeMethod(int i, int j){    // метод, который меняет два элемента массива местами
        T temp;
        temp = mas[i];                  //sob и iob - экземпляры этого класса, поэтому у них у каждого есть параметр mass
        mas[i] = mas[j];
        mas[j] = temp;
    }

    void massiveToArrayList(){
        for (int i = 0; i < this.mas.length; i++){
            this.list.add(this.mas[i]);
        }
        System.out.println("ArrayList: " + Arrays.toString(this.list.toArray()));
    }
}
