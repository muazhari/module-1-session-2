package org.dti.se;

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

        System.out.println("Task 1");
        System.out.println("Celcius: " + Temperature.convertFahrenheitToCelsius(32.0));

        System.out.println("Task 2");
        System.out.println("Kilometers: " + Distance.convertCentimetersToKilometers(100000.0) + " km");

        System.out.println("Task 3");
        System.out.println("Is Odd: " + Numberer.isOdd(1000.0));

        System.out.println("Task 4");
        System.out.println("Removed: " + Stringer.removeFirstOccurrence("Hello world", "ell"));

        System.out.println("Task 5");
        System.out.println("Is Palindrome: " + Stringer.isPalindrome("madam"));
    }
}
