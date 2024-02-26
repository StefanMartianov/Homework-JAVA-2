package org.example.HomeworkJAVA.factorial;

public class Factorial {
    public  int calculateFactorialWithWhile(int n) {
        int result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    public  int calculateFactorialWithDoWhile(int n) {
        int result = 1;
        int i = 1;
        do {
            result *= i;
            i++;
        } while (i <= n);
        return result;
    }

    public  int calculateFactorialWithForLoop(int n) {
        int result = 1;
        for (int i = 1; i <=n; i++){
            result *= i;
        }
        return result;
    }
}
