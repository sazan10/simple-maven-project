package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";
    private static int[] numbers = {1, 2, 3, 4, 5};
    private static int sum = 0;

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("After processing element " + (i + 1) + ", sum = " + sum);
        }

        System.out.println("Total sum of array: " + sum);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
