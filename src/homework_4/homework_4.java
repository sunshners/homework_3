package homework_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class homework_4 {
    public static void main(String[]args){
        getNum();
        remoovNum();
        randomArray();
        compareArray();}



    // Задание 1 - создайте массив целыхчисел. Напишите программу, котора выводит сообшение о том, входит ли
    // заданное число в массив или нет. Пусть число для поиска задается в консоли (класс Scanner)
        public static void getNum(){
            Scanner sc = new Scanner(System.in);
        int[] iData = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("****************");
        System.out.print("Введите целое число: ");
        
        int userImput = sc.nextInt();
        
        boolean found = false;
        for(int number : iData){
            if (number == userImput){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Число " + userImput + " входит в массив.");
        } else {
            System.out.println("Число " + userImput + " не входит в массив.");
        }
    }

    // Задание 2 - создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть число задается
    // в консоли (Scanner). Если такого числа нет - выведите сообщения об этом. В результате должен быть новый массив
    // без указанного числа.
    public static void remoovNum(){
        Scanner sc = new Scanner(System.in);
        int[] iData = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("****************");
       System.out.print("Введите число для удаления: ");
       int numberToRemoove = sc.nextInt();
        List<Integer>newList = new ArrayList<>();
        boolean found = false;
        for (int num : iData){
            if (num == numberToRemoove){
                found = true;
            } else {
                newList.add(num);
            }
        }
        if (!found){
            System.out.println("Число " + numberToRemoove + " не найдено в массиве.");
        } else {
            int[] newArray = new int[newList.size()];
            for (int i=0; i< newList.size(); i++){
                newArray[i] = newList.get(i);
            }
            System.out.println("Новый массив без числа " + numberToRemoove + " : ");
            for (int num : newArray){
                System.out.println(num + " ");
            }
        }
    }

    // Задание 3 - создать и заполнить масси случайными числами и вывести макс, мин и среднее значение. Для генерации
    //использовать метод Math.Random(). Пусть будет возможность создавать массив произвольного размера, пусть размер
    // массива вводится с консоли.
    public static void randomArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("****************");
            System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        double[] array = new double[size];
        for (int i = 0; i< size; i++){
            array[i] = Math.random()*100;
        }
        double max = array[0];
        double min = array[0];
        double sum = 0;
        for (double num : array){
            if (num>max){
                max = num;
            }
            if (num<min){
                min = num;
            }
            sum += num;
        }
          double average = sum / size;
        System.out.printf("Максимальное знаение: %.2f\n ", max );
        System.out.printf("Минимальное знаение: %.2f\n ", min );
        System.out.printf("Среднее знаение: %.2f\n ", average );
    }

    //Задание 4 создать два массива по 5 целых чисел, вывести их на консоль в двух отдельных строах, вычислить среднее
    // арифметическое элементов для каждого массива и сравнивнить эти значения.
    public static void compareArray(){
        Random random = new Random();
        int [] array1 = new int[5];
        int [] array2 = new int[5];
        for (int i = 0; i<5; i++){
            array1[i] = random.nextInt(101);
            array2[i] = random.nextInt(101);
        }
        System.out.println("****************");
        // сканер для получения ввода пользоватея
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите на интер для запуска");
        scanner.nextLine();
        System.out.println("Массив 1: ");
        for (int num : array1){
            System.out.println(num + " ");
        }
        System.out.println();

        System.out.println("Массив 2: ");
        for (int num : array2){
            System.out.println(num + " ");
        }
        System.out.println();

        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);

        System.out.printf("Среднее арифметическое массива 1: %.2f\n ", average1);
        System.out.printf("Среднее арифметическое массива 2: %.2f\n ", average2);

        if (average1 > average2){
            System.out.println("Массив 1 больше.");
        } else if (average1 < average2) {
            System.out.println("Массив 2 юолбше.");
        } else {
            System.out.println("Они равны.");
        }
    }
    public static double calculateAverage(int[] array){
        double sum = 0;
                for (int num : array){
                    sum =+ num;
                }
                return sum / array.length;
    }
}
