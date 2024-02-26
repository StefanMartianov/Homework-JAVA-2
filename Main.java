package org.example.HomeworkJAVA.factorial;

public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.calculateFactorialWithWhile(5));
        System.out.println(factorial.calculateFactorialWithForLoop(10));
        System.out.println(factorial.calculateFactorialWithDoWhile(30));
    }
}
