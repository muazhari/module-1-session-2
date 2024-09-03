package org.dti.se;

import java.util.Scanner;

class Message {
    public static String getMessage() {
        return "Hello World!";
    }
}

class Temperature {
    public static Double convertFahrenheitToCelsius(Double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

class Distance {
    public static Double convertCentimetersToKilometers(Double centimeters) {
        return centimeters / 1E5;
    }
}

class Stringer {
    public static String removeFirstOccurrence(String string, String stringToRemove) {
        return string.replaceFirst(stringToRemove, "");
    }

    public static Boolean isPalindrome(String string) {
        for (int i = 0; i <= string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

class Numberer {
    public static Boolean isOdd(Double number) {
        return number % 2 != 0;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Message.getMessage());

        Scanner scanner = new Scanner(System.in);
        Boolean isUseScanner = true;

        System.out.println("Task 1");
        Double inputOne;
        if (isUseScanner) {
            System.out.print("Enter Fahrenheit: ");
            inputOne = scanner.nextDouble();
            scanner.nextLine();
        } else {
            inputOne = 100.0;
        }
        System.out.println("Celcius: " + Temperature.convertFahrenheitToCelsius(inputOne) + "°C");

        System.out.println("Task 2");
        Double inputTwo;
        if (isUseScanner) {
            System.out.print("Enter Centimeters: ");
            inputTwo = scanner.nextDouble();
            scanner.nextLine();
        } else {
            inputTwo = 100000.0;
        }
        System.out.println("Kilometers: " + Distance.convertCentimetersToKilometers(inputTwo) + " km");

        System.out.println("Task 3");
        Double inputThree;
        if (isUseScanner) {
            System.out.print("Enter Number: ");
            inputThree = scanner.nextDouble();
            scanner.nextLine();
        } else {
            inputThree = 1000.0;
        }
        System.out.println("Is Odd: " + Numberer.isOdd(inputThree));

        System.out.println("Task 4");
        String inputFour;
        String inputFive;
        if (isUseScanner) {
            System.out.print("Enter String: ");
            inputFour = scanner.nextLine();
            System.out.print("Enter String to Remove: ");
            inputFive = scanner.nextLine();
        } else {
            inputFour = "Hello world";
            inputFive = "ell";
        }
        System.out.println("Removed: " + Stringer.removeFirstOccurrence(inputFour, inputFive));

        System.out.println("Task 5");
        String inputSix;
        if (isUseScanner) {
            System.out.print("Enter String: ");
            inputSix = scanner.nextLine();
        } else {
            inputSix = "madam";
        }
        System.out.println("Is Palindrome: " + Stringer.isPalindrome(inputSix));
    }
}
