package org.example;


import java.io.File;
import java.io.IOException;

public class MyClass {

    public int add(int a, int b) {
        return a + b;
    }

    public String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public double calculateAverage(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }


    public void createTempDirectory() {
        try {
            // Vulnerable code: Using an insecure method to create a temporary directory
            File tempDir = File.createTempFile("mytemp", "");

            // Modify the file into a directory
            if (!tempDir.delete()) {
                throw new IOException("Failed to delete the temporary file");
            }

            if (!tempDir.mkdir()) {
                throw new IOException("Failed to create the temporary directory");
            }

            System.out.println("Temporary directory created: " + tempDir.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error creating temporary directory: " + e.getMessage());
        }
    }


    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }


    public boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
