package homework_7;
import java.util.Arrays;
public class phome {
    static class Phone {
        private String number;
        private String model;
        private double weight;

        // Конструктор с тремя параметрами
        public Phone(String number, String model, double weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        // Конструктор с двумя параметрами
        public Phone(String number, String model) {
            this(number, model, 0.0); // Вызывает предыдущий конструктор
        }

        // Конструктор без параметров
        public Phone() {
            this("Unknown", "Unknown", 0.0); // Вызывает предыдущий конструктор
        }

        // Метод для получения номера телефона
        public String getNumber() {
            return number;
        }

        // Метод для получения информации о звонке
        public void ReceiveCall(String name) {
            System.out.println("Звонит: " + name);
        }

        // Перегруженный метод ReceiveCall
        public void ReceiveCall(String name, String callerNumber) {
            System.out.println("Звонит: " + name + ", номер: " + callerNumber);
        }

        // Метод для отправки сообщений
        public static void sendMessage(String... numbers) {
            System.out.println("Сообщение будет отправлено на номера: " + Arrays.toString(numbers));
        }

        // Метод для вывода информации о телефоне
        public void displayInfo() {
            System.out.println("Номер: " + number + ", Модель: " + model + ", Вес: " + weight);
        }
    }
}
