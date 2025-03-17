package homework_5;

import java.util.Random;
import java.util.Scanner;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;


public class homework_5 {
    public static void main(String[]args){
        array();

    }
    public static void array(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int b = 2;
        int y = 7;
        int o = 4;
        int[][][] array = new int[b][y][o];
        for (int i=0; i<b; i++){
            for (int j=0; j<y; j++){
                for (int k=0; k<o; k++){
                    array[i][j][k] = random.nextInt(15);
                }
            }
        }
        System.out.println("Исходный массив: ");
        printArray(array);

        System.out.println("Введите число для увеличения каждого элемента - ");
        int incrementValue = sc.nextInt();

        for (int i=0; i<b; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < o; k++) {
                    array[i][j][k] += incrementValue;
                }
            }
        }
                    System.out.println("Измененный массив: ");
                    printArray(array);
                    sc.close();
    }
    public static void printArray(int[][][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                for (int k=0; k< array.length; k++){
                    System.out.println(array[i][j][k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
