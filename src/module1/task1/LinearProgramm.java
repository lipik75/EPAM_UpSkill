package module1.task1;

public class LinearProgramm {

    // 1.Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.
    double functionOne(double a, double b, double c) {
        return  ((a - 3) * b / 2) + c;
    }

    // 2.Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    double functionTwo(double a, double b, double c) {
        return  ((b + Math.sqrt(b * b + 4 * a * c)) / 2 * a) - a * a * a * c + 1 / (b * b);
    }

    // 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    double functionThree(double x, double y) {
        return  (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }
    /*
    4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа.
     */
    double numberRevers(double r) {
        return r * 1000 % 1000 + (int) r / 1000.0;
    }
    /*
    5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
    Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
    ННч ММмин SSc.
     */
    void timeCurrent(int t) {
        int hh = (t / 60) / 60;
        int mm = (t / 60) % 60;
        int ss = t - (t / 60) * 60;
        System.out.println(hh + " ч " + mm + " мин " + ss + " сек ");
    }
    /*
    6. Для данной области составить линейную программу, которая печатает true,
    если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
     */
    boolean functionFour(int x, int y) {
        if (y >= -3 && y <= 0 && x >= -4 && x <= 4) {
            return true;
        }
        if (y >= 0 && y <= 4 && x >= -2 && x <= 2) {
            return true;
        }
        return false;
    }
}
