package guess2;
import java.util.Scanner;
public class guess2 {
        public static void main(String[] args) {
            // Загаданное слово
            String wordToGuess = "JAVA";
            StringBuilder guessedLetters = new StringBuilder();
            int attempts = 7;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Добро пожаловать в игру 'Угадай слово'!");

            while (attempts > 0) {
                System.out.println("\nЗагаданное слово: " + displayWord(wordToGuess, guessedLetters));
                System.out.print("Введите букву: ");
                char guess = scanner.next().toUpperCase().charAt(0);

                // Проверка, была ли буква уже угадана
                if (guessedLetters.toString().contains(String.valueOf(guess))) {
                    System.out.println("Вы уже угадали эту букву! Попробуйте другую.");
                    continue;
                }

                guessedLetters.append(guess);

                if (wordToGuess.indexOf(guess) >= 0) {
                    System.out.println("Правильно!");
                } else {
                    attempts--;
                    System.out.println("Неправильно! Осталось попыток: " + attempts);
                }

                // Проверка, угадано ли слово
                if (isWordGuessed(wordToGuess, guessedLetters.toString())) {
                    System.out.println("Поздравляем! Вы угадали слово: " + wordToGuess);
                    break;
                }
            }

            if (attempts == 0) {
                System.out.println("Игра окончена. Загаданное слово: " + wordToGuess);
            }

            scanner.close();
        }

        private static String displayWord(String word, StringBuilder guessedLetters) {
            StringBuilder displayedWord = new StringBuilder();
            for (char letter : word.toCharArray()) {
                if (guessedLetters.indexOf(String.valueOf(letter)) >= 0) {
                    displayedWord.append(letter).append(" ");
                } else {
                    displayedWord.append("_ ");
                }
            }
            return displayedWord.toString().trim();
        }

        private static boolean isWordGuessed(String word, String guessedLetters) {
            for (char letter : word.toCharArray()) {
                if (!guessedLetters.contains(String.valueOf(letter))) {
                    return false;
                }
            }
            return true;
        }
    }
