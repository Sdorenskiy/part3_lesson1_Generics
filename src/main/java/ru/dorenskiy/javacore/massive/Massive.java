package ru.dorenskiy.javacore.massive;

import java.util.ArrayList;
import java.util.Arrays;

public class Massive {

    public static void main( String[] args ){
        String strObj[] = {"Q", "W", "E", "R"};
        System.out.println(Arrays.toString(strObj));
        Integer intObj[] = {1,2,3};
        System.out.println(Arrays.toString(intObj));

        GenericClassMassive<String> sob = new GenericClassMassive<String>(strObj); //это экземпляры обобщенного класса
        GenericClassMassive<Integer> iob = new GenericClassMassive<Integer>(intObj);

        sob.changeMethod(1,2);      // Этот метод работает с любыми типами массивов.
        iob.changeMethod(1,2);
        System.out.println(Arrays.toString(strObj));
        System.out.println(Arrays.toString(intObj));

        sob.massiveToArrayList();
        iob.massiveToArrayList();
    }
}
