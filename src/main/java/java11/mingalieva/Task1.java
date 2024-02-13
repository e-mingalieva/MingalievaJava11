package java11.mingalieva;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        scanner.close();

        if (a > b) {
            System.out.println ("a > b");
        } else if (a < b) {
            System.out.println ("a < b");
        } else {
            System.out.println ("a = b");
        }

        System.out.printf("a + b = %d%n", a + b);
        System.out.printf("a - b = %d%n", a - b);
        System.out.printf("b - a = %d%n", b - a);
        System.out.printf("a * b = %d%n", a * b);
        if (b != 0) {
            System.out.printf("a / b = %f%n", a * 1f / b);
        } else {
            System.out.println("a / b = Ошибка деления на 0");
        }
        if (a != 0) {
            System.out.printf("b / a = %f%n", b * 1f / a);
        } else {
            System.out.println("b / a = Ошибка деления на 0");
        }

    }
}