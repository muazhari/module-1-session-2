package org.dti.se;

class Message {
    public static String getMessage() {
        return "Hello World!";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Message.getMessage());
    }
}
