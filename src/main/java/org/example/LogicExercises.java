package org.example;

import java.util.Arrays;

public class LogicExercises {
    public static class FizzBuzz{
        /*
         * Escribe un programa que muestre por consola (con un print) los
         * números de 1 a 100 (ambos incluidos y con un salto de línea entre
         * cada impresión), sustituyendo los siguientes:
         * - Múltiplos de 3 por la palabra "fizz".
         * - Múltiplos de 5 por la palabra "buzz".
         * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
         */
        public static void fizzBuzz(){
            for (int i=1;i<=100;i++){
                if(i%3==0 && i%5==0)
                    System.out.println("fizzbuzz");
                else if(i%3==0)
                    System.out.println("fizz");
                else if(i%5==0)
                    System.out.println("buzz");
                else
                    System.out.println(i);

            }
        }
    }
    public static class Anagram{
        /*
         * Escribe una función que reciba dos palabras (String) y retorne
         * verdadero o falso (Bool) según sean o no anagramas.
         * - Un Anagrama consiste en formar una palabra reordenando TODAS
         *   las letras de otra palabra inicial.
         * - NO hace falta comprobar que ambas palabras existan.
         * - Dos palabras exactamente iguales no son anagrama.
         */
        public static boolean isAnAnagram(String word1,String word2){
        if(word1.length()!=word2.length())
            return false;
        else if(word1.equals(word2))
            return false;
        else {
            char[] lettersWord1= word1.toCharArray();
            char[] lettersWord2= word2.toCharArray();
            Arrays.sort(lettersWord1);
            Arrays.sort(lettersWord2);
            for(int i=0;i<word1.length();i++){
                if(lettersWord1[i] != lettersWord2[i])
                    return false;
            }
        }
          return true;
        }
    }
    public static class Fibonacci{
        /*
         * Escribe un programa que imprima los 50 primeros números de la sucesión
         * de Fibonacci empezando en 0.
         * - La serie Fibonacci se compone por una sucesión de números en
         *   la que el siguiente siempre es la suma de los dos anteriores.
         *   0, 1, 1, 2, 3, 5, 8, 13...
         */
        public static void fibonacci(){
            long number1=0;
            long number2=1;
            StringBuilder string = new StringBuilder();
            string.append(number1).append(", ").append(number2).append(", ");
            for(int i=0;i<47;i++){
                long number3=number1+number2;
                string.append(number3).append(", ");
                //0, 1, 1,
                number1=number2;
                number2=number3;
            }
            System.out.println(string);
        }
    }
    public static class PrimeNumber{
        /*
         * Escribe un programa que se encargue de comprobar si un número es o no primo.
         * Hecho esto, imprime los números primos entre 1 y 100.
         */
        public static void primeNumber(){

        }
    }
    public LogicExercises(){

    }
}
