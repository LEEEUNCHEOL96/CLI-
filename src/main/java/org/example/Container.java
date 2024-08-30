package org.example; // 패키지 구조 변경

import java.util.Scanner;

public class Container { // 컨태이너 class 추가
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