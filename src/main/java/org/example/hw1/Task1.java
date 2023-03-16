package org.example.hw1;
import java.util.Scanner;

/**
 * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество цифр(кроме 0 и 1): ");
        int userNumber = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < userNumber; i++) {
            int userNumber2 = scanner.nextInt();
            if(isPrime(userNumber2)){
                result += userNumber2;
            }
        }
        scanner.close();
        System.out.println("result : "+ result);
    }

    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}