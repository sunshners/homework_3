package HomeWork_3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String[] args) {
        Season();
        SeasonIfElse();
        SetNumber();
        Temperature();
        NomberOfColor();
        OddNumber();
        DownNumber();
        Summ();
        Sequence();
        TenNum();
        Squares();}




    //Задание 1 - Написать программу для вывода названия поры года по номеру месяца. При решении использйте оператор
    //switch-case.
    public static void Season() {
    Scanner scanner =new Scanner(System.in);
    System.out.println("*************************");
        System.out.print("Введите номер месяца (1-12): ");
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

    //Задание 2 - Написать программу для вывода названия поры года по номеру месяца. при решении используйте оператор
    //if-else-if.
    public static void SeasonIfElse(){
        System.out.println("*************************");
        System.out.print("Введите номер месяца (1-12). ");
        Scanner scanner =new Scanner(System.in);
        int month =scanner.nextInt();
        if(month ==12|| month ==1|| month ==2) {
            System.out.println("Зима.");
        } else if (month>=3 && month <=5) {
            System.out.println("Весна.");
        } else if (month >=6 && month <=8) {
            System.out.println("Лето.");
        } else if (month >=9 && month <=11) {
            System.out.println("Осень.");
        } else {
            System.out.println("Ошибка, введите от 1 до 12.");
        }
    }

    //Задание 3 - Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение
    //четное число или нет. Для определения четности числа используйте операцию получения остатка от деления  - операия
    //выглядит так: '% 2').
    public static void SetNumber() {
        System.out.println("*************************");
       Scanner scanner = new Scanner(System.in);
       System.out.print("Введите любое число. Прям любое.  ");
       int number = scanner.nextInt();
       if (number % 2 == 0){
           System.out.println("Ок, оно четное");
       }else {
           System.out.println("Не, оно нечетное");
       }
    }

    //Задание 4 - Для введенного числа t (температура на улице) вывести:
    //если t>–5, то вывести «Тепло».
    //если –5>= t > –20, то вывести «Нормально».
    //если –20>= t, то вывести «Холодно».
    public static void Temperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************");
        System.out.print("Введите температуру от -много до просто много.  ");
        int t = scanner.nextInt();
        
        if (t>-5){
            System.out.println("Тепло, норм)");
        } else if (t<=-5 && t>-20) {
            System.out.println("Ну пойдет");
        } else if (t<= -20) {
            System.out.println("Что за дубак???");
        }
    }

    //Задание 5 - По введенному номеру определить цвет радуги. Например 1 - красный, 4 - синий.
    public static void NomberOfColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************");
        System.out.print("Введите номер радуги от 1 до 7  ");
        int number = scanner.nextInt();
        String color;
        switch(number){
            case 1:
                color = "Красный";
                System.out.println("Красный");
                break;
            case 2:
                color = "Оранжевый";
                System.out.println("Оранжевый");
                break;
            case 3:
                color = "Желтый";
                System.out.println("Желтый");
                break;
            case 4:
                color = "Зеленый";
                System.out.println("Зеленый");
                break;
            case 5:
                color = "Голубой";
                System.out.println("Голубой");
                break;
            case 6:
                color = "Синий";
                System.out.println("Синий");
                break;
            case 7:
                color = "Фиолетовый";
                System.out.println("Фиолетовый");
                break;
            default:
                color = "Ты что ввел? нет такой радуги...";
                System.out.println(color);

        }
    }

    //Задание цикла 1 - При помощи цикла for вывести на экран нечетные числа от 1 до 99. При решении используйте операцию
    //инкремента (++).
    public static void OddNumber() {
        System.out.println("*************************");
        // сканер для получения ввода пользоватея
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите на интер для запуска");
        scanner.nextLine();
        //начнем с 1 + 2 чтоб получить нечетные числа
        for (int i = 1; i<100; i+=2){
            System.out.println(i);
        }
    }

    //Задание цикла 2 - Необходимо вывести на экран числа от 5 до 1. При решении используйте операцию декремента (--).
    public static void DownNumber() {
        System.out.println("*************************");
        // сканер для получения ввода пользоватея
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите интер, чтоб посчитать от 5 до 1");
        scanner.nextLine();
        //вывод чисел от 5 до 1
        for (int i = 5; i > 0; i--){
            System.out.println(i);
        }
    }

    //Задание цикла 3- Напишите программу, где пользователь вводит любое целое положительное число. А программа
   // суммирует все числа от 1 до введенного пользователем числа. Для ввода числа воспользуйтесь классом Scanner.
    public static void Summ() {
        System.out.println("*************************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число.");
        int number = scanner.nextInt();
        if (number <=0){
            System.out.println("Попросили же ЦЕЛОЕ ПОЛОЖИТЕЛЬНОЕ число");
        } else {
            int sum = 0;
            for (int i =1; i<= number; i++){
                sum +=i;
            }
            System.out.println("Сумма чисел от 1 до " + number + " равна " + sum);
        }
    }

    //Задание цикла 4 - Необходимо, чтоб программа выводила на экран вот такую последовательность: 7 14 21 28 35 42 49
   //56 63 70 77 84 91 98. В решении используйте цикл while.
    public static void Sequence() {
        System.out.println("*************************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите интер, чтоб запустить ");
        scanner.nextLine();
        int number =7;
        while(number <=98){
            System.out.println(number + "  ");
            number +=7;
        }
    }

    //Задание цикла 5 - Вывести 10 первых чисел последовательности 0, -5,-10,-15..
    public static void TenNum() {
        System.out.println("*************************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите интер, чтоб запустить цепочку ");
        scanner.nextLine();
        int number = 0;
        for (int a = 1; a <= 10; a++) {
            System.out.print(number + " ");
            number -= 5;
            System.out.println();
        }
    }

    // Задание цикла 6 - Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
    private static void Squares() {
        System.out.println("*************************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите интер, чтоб запустить цепочку ");
        scanner.nextLine();
        for (int a = 10; a <= 20; a++) {
            int num = a * a;
            System.out.print(num + " ");
            System.out.println();
        }
    }
}









