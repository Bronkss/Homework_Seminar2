package org.example.cw1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите перове число: ");
        double user_num = scanner.nextDouble();
        System.out.println("Введите значения n: ");
        int n = scanner.nextInt();
        System.out.println(Math.pow(user_num,n));
    }
}
