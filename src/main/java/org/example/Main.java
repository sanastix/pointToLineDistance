package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        scan.close();

        int A = y1 - y2;
        int B = x2 - x1;
        int C = x1 * y2 - x2 * y1;

        double distance = Math.abs(A * x + B * y + C) / Math.sqrt(A * A + B * B);

        System.out.printf("%.6f", distance);

    }
}