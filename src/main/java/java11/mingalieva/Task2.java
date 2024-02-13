package java11.mingalieva;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку a: ");
        String a = scanner.next();
        System.out.print("Введите строку b: ");
        String b = scanner.next();

        scanner.close();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
