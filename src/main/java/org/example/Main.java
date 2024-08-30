package org.example;   // 패키지 구조변경

public class Main {
    public static void main(String[] args) {
        Container.start(); // Container 로 부터 매서드를 받아온다.
        new App().run();
        Container.close(); // Container 로 부터 매서드를 받아온다.
    }
}