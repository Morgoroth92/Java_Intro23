package org.example;

public class Main {
    public static void main(String[] args) {
        contaESalta(12);
    }
    public static void contaESalta(int n) {
        for (int i = 0; i <= n; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}