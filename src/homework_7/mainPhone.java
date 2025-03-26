package homework_7;

public class mainPhone {
    public static void main(String[] args) {
        // Создание трех экземпляров класса Phone
        phome.Phone phone1 = new phome.Phone("655-855-0212", "Model S", 150.0);
        phome.Phone phone2 = new phome.Phone("987-002-7475", "Model T");
        phome.Phone phone3 = new phome.Phone();

        // Вывод значений переменных
        phone1.displayInfo();
        phone2.displayInfo();
        phone3.displayInfo();

        // Вызов метода ReceiveCall для каждого объекта
        phone1.ReceiveCall("Susan");
        phone2.ReceiveCall("Garry");
        phone3.ReceiveCall("Chloe");

        // Вызов перегруженного метода ReceiveCall
        phone1.ReceiveCall("Susan", phone1.getNumber());
        phone2.ReceiveCall("Garry", phone2.getNumber());

        // Вызов метода sendMessage
        phome.Phone.sendMessage(phone1.getNumber(), phone2.getNumber());
    }
}
