package module4.task1;

/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или
 * уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите инициа-
 * лизацию счетчика значениями по умолчанию и произвольными значениями. Счетчик
 * имеет методы увеличения и уменьшения состояния, и метод позволяющее получить
 * его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

class DecimalCounter {
    private int currentValue;
    private int minValue;
    private int maxValue;

    DecimalCounter() {
        this.currentValue = 0;
        this.minValue = 0;
        this.maxValue = 100;
    }

    DecimalCounter(int currentValue, int minValue, int maxValue) {
        this.currentValue = currentValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    int getCurrentValue() {
        return this.currentValue;
    }

    void increase() {
        currentValue++;
        if(currentValue == maxValue) {
            System.out.println("Достигнута верхняя граница диапазона");
        } else if (currentValue > maxValue) {
            System.out.println("Недопустимый выход за верхнюю границу диапазона");
            currentValue--;
        }
    }


    void reduce() {
        currentValue--;
        if(currentValue == maxValue) {
            System.out.println("Достигнута нижняя граница диапазона");
        } else if (currentValue < minValue) {
            System.out.println("Недопустимый выход за нижнюю границу диапазона");
            currentValue++;
        }
    }
}

class TestDecimalCounter {

    public static void main(String[] args) {

        /* тест счетчика по умолчанию */
        DecimalCounter firstCounter = new DecimalCounter();
        System.out.println("Текущее значение счетчика №1 - " + firstCounter.getCurrentValue());
        System.out.print("firstCounter.reduce(): ");
        firstCounter.reduce();

        System.out.print("firstCounter.increase() * 99: ");
        for (int i = 1; i <= 99; i++) {
            firstCounter.increase();
        }
        System.out.println("Текущее значение счетчика №1 - " + firstCounter.getCurrentValue());
        System.out.print("firstCounter.increase(): ");
        firstCounter.increase();
        System.out.println("Текущее значение счетчика №1 - " + firstCounter.getCurrentValue());
        System.out.print("firstCounter.increase(): ");
        firstCounter.increase();
        System.out.println("Текущее значение счетчика №1 - " + firstCounter.getCurrentValue());
        System.out.println("\n");


        /* тест счетчика с заданных диапазоном значений */
        DecimalCounter secondCounter = new DecimalCounter(1, 1, 8);
        System.out.println("Текущее значение счетчика №2 - " + secondCounter.getCurrentValue());
        System.out.print("secondCounter.reduce(): ");
        secondCounter.reduce();

        System.out.print("secondCounter.increase() * 6: ");
        for (int i = 1; i <= 6; i++) {
            secondCounter.increase();
        }
        System.out.println("Текущее значение счетчика №2 - " + secondCounter.getCurrentValue());
        System.out.print("secondCounter.increase(): ");
        secondCounter.increase();
        System.out.println("Текущее значение счетчика №2 - " + secondCounter.getCurrentValue());
        System.out.print("secondCounter.increase(): ");
        secondCounter.increase();
        System.out.println("Текущее значение счетчика №2 - " + secondCounter.getCurrentValue());
    }
}
