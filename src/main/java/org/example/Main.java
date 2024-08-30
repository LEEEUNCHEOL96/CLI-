package org.example;

public class Main {
    public static void main(String[] args) {
        Container.start();
        new App().run();
        Container.close();
    }
}