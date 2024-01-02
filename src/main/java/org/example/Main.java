package org.example;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        LogicExercises exercises = new LogicExercises();
        //fizzbuzz
        LogicExercises.FizzBuzz.fizzBuzz();
        //anagram
        System.out.println(LogicExercises.Anagram.isAnAnagram("amor","roma"));
        //fibonacci
        LogicExercises.Fibonacci.fibonacci();
        //prime numbers
        for (int i=1;i<=100;i++)
            System.out.println("el numero "+ i + "es primo --> " + LogicExercises.PrimeNumber.primeNumber(i));
        //polygons
        LogicExercises.Area.Square square = new LogicExercises.Area.Square(10,10);
        LogicExercises.Area.Rectangle rectangle = new LogicExercises.Area.Rectangle(10,10);
        LogicExercises.Area.Triangle triangle = new LogicExercises.Area.Triangle(10,10);
        System.out.println(LogicExercises.Area.calculateArea(square));
        System.out.println(LogicExercises.Area.calculateArea(rectangle));
        System.out.println(LogicExercises.Area.calculateArea(triangle));
        //aspect ratio una imagen
        try {
            URL imageUrl = new URL("https://w.wallhaven.cc/full/01/wallhaven-01kqy3.png");
            System.out.println(LogicExercises.ImageRatio.imageRatio(imageUrl));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        //reverse strings
        System.out.println(LogicExercises.RevertStrings.reverseStrings("hello world"));
        //counting words
        System.out.println(LogicExercises.CountingWords.countingWords("hola que tal. que? me dijiste algo?", "que"));
        //decimal to binary
        System.out.println(LogicExercises.DecimalToBinary.decimalToBinary(123));

    }
}