package org.example;

public class FactorialNum {

    public  int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}




