package homework_6;

public class creditCard {
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
    }
}
