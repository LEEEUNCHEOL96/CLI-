package org.example;

import java.util.Scanner;

public class Container {
    private static Scanner sc;

    public static void start() {
        sc = new Scanner(System.in);
    }

    public static void close() {
        sc.close();
    }

    public static Scanner getSc() {
        return sc;
    }
}