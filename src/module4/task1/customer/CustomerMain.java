package module4.task1.customer;

import module4.task1.customer.Customer;
import module4.task1.customer.CustomerBase;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод  toString(). Создать второй класс,
 * агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *
 *    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки,
 *    номер банковского счета.
 *    Найти и вывести:
 *    a) список покупателей в алфавитном порядке;
 *    b) список покупателей, у которых номер кредитной карточки находится
 *    в заданном интервале.
 */

public class CustomerMain {

    public static void main(String[] args) {
        CustomerBase vipClient = new CustomerBase("VIP clients", new ArrayList<>());

        vipClient.addCustomer("Kravchuk", "Aleksei", "Sergeevich",
                "Minsk", new BigInteger("1111111111111111"), 12345678);
        vipClient.addCustomer("Tereshchenko", "Anastasia", "Vladislavovna",
                "Moscow", new BigInteger("2222222222222222"), 23456789);
        vipClient.addCustomer("Solovei", "Yegor", "Vasilievich",
                "Tallinn", new BigInteger("3333333333333333"), 34567891);
        vipClient.addCustomer("Kovalec", "Svetlana", "Konstantinovna",
                "Warsaw", new BigInteger("4444444444444444"), 45678912);
        vipClient.addCustomer("Saiko", "Dmitry", "Antonovich",
                "Brest", new BigInteger("5555555555555555"), 56789123);

        System.out.println("Список покупателей в алфавитном порядке:");
        vipClient.sortName();
        for (int i = 0; i < vipClient.getBase().size(); i++) {
            System.out.println(vipClient.getBase().get(i));
        }

        System.out.println("\nСписок покупателей, у которых номер кредитной карточки находится в заданном интервале:");
        ArrayList<Customer> list = vipClient.getCustomerByCreditCardRange("2000000000000000", "5000000000000000");
        list.sort(Comparator.comparing(Customer::getCardNumber));
        if (list.size() == 0) {
            System.out.println("банковские карты не найдены");
        } else {
            for (Customer customer : list) {
                System.out.println(customer);
            }
        }
    }
}
