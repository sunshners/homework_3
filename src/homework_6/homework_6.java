package homework_6;

public class homework_6 {
    static class CreditCard {
        private String accountNumber;
        private double balance;

        // Конструктор класса
        public CreditCard(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        // Метод для пополнения карточки
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Пополнение на " + amount + " успешно.");
            } else {
                System.out.println("Сумма должна быть положительной.");
            }
        }

        // Метод для снятия средств с карточки
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Снятие " + amount + " успешно.");
            } else {
                System.out.println("Недостаточно средств или некорректная сумма.");
            }
        }

        // Метод для вывода информации о карточке
        public void displayInfo() {
            System.out.println("Номер счета: " + accountNumber + ", Текущий баланс: " + balance);
        }

        public static void main(String[] args) {
            // Создание трех объектов класса CreditCard
            CreditCard card1 = new CreditCard("7148-8653-2200-1252", 1779.0);
            CreditCard card2 = new CreditCard("3300-8545-9632-0214", 4366.75);
            CreditCard card3 = new CreditCard("4585-0022-3663-9999", 100.17);

            // Тестовый сценарий
            card1.deposit(354.0); // Пополнение первой карточки
            card2.deposit(900.7); // Пополнение второй карточки
            card3.withdraw(98.0); // Снятие со третьей карточки

            // Вывод текущего состояния всех трех карточек
            System.out.println("Текущее состояние карточек:");
            card1.displayInfo();
            card2.displayInfo();
            card3.displayInfo();
        }
    }
}
