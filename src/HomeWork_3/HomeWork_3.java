package HomeWork_3;

import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задание 1 - Написать программу для вывода названия поры года по номеру
        //месяца. При решении используйте оператор switch-case.

        System.out.print("Введите номер месяца (1-12):");
        int month = scanner.nextInt();
        switch (month) {
            case 12, 1, 2:
                System.out.println("Сейчас зима.");
                break;
            case 3, 4, 5:
                System.out.println("Это весна.");
                break;
            case 6, 7, 8:
                System.out.println("Сейчас лето.");
                break;
            case 9, 10, 11:
                System.out.println("Осень на улице.");
                break;
            default:
                System.out.println("От 1 до 12 сказано же, ты норм?");
                break;
        }
    }
}





