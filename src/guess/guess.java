package guess;
import java.util.Scanner;
import java.util.Random;
public class guess {
        public static void main(String[] args) {
            String[] words = {"JAVA", "PROGRAMMING", "COMPUTER", "DEVELOPER", "GITHUB"};
            Random random = new Random();
            String chosenWord = words[random.nextInt(words.length)];
            char[] guessedWord = new char[chosenWord.length()];
            for (int i = 0; i < guessedWord.length; i++) {
                guessedWord[i] = '_';
            }

            int attempts = 6;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Добро пожаловать в игру 'Угадай слово'!");

            while (attempts > 0 && new String(guessedWord).contains("_")) {
                System.out.println("Попробуйте угадать слово: " + new String(guessedWord));
                System.out.println("Осталось попыток: " + attempts);
                System.out.print("Введите букву: ");
                char guess = scanner.next().toUpperCase().charAt(0);

                if (chosenWord.indexOf(guess) >= 0) {
                    for (int i = 0; i < chosenWord.length(); i++) {
                        if (chosenWord.charAt(i) == guess) {
                            guessedWord[i] = guess;
                        }
                    }
                    System.out.println("Правильно!");
                } else {
                    attempts--;
                    System.out.println("Неправильно! Эта буква отсутствует.");
                }
            }

            if (new String(guessedWord).equals(chosenWord)) {
                System.out.println("Поздравляем! Вы угадали слово: " + chosenWord);
            } else {
                System.out.println("Вы проиграли! Загаданное слово было: " + chosenWord);
            }
        }
    }
