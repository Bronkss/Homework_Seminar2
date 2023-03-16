package org.example.hw2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println(isSequanceIncreasing());
    }

    public static boolean isSequanceIncreasing() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int one = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int two = sc.nextInt();
            if (two < one) {
                sc.close();
                return false;
            }
            one = two;
        }
        sc.close();
        return true;
    }
}
