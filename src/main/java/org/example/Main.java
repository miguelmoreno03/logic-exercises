package org.example;

public class Main {
    public static void main(String[] args) {
        LogicExercises exercises = new LogicExercises();
        //fizzbuzz
        LogicExercises.FizzBuzz.fizzBuzz();
        //anagram
        System.out.println(LogicExercises.Anagram.isAnAnagram("amor","roma"));
        //fibonacci
        LogicExercises.Fibonacci.fibonacci();

    }
}