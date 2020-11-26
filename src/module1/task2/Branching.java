package module1.task2;

public class Branching {

    // 1.Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
    String triangle(int x, int y) {
        if ((x + y) < 180) {
            if (x == 90 || y == 90 || (x + y) == 90) {
                return "Треугольник является прямоугольным";
            }
            return "Треугольник существует";
        }
        return "Треугольник не существует";
    }
    //2.Найти max{min(a, b), min(c, d)}.

    int maximum(int a, int b, int c, int d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }

    //3.Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

    boolean oneSameLine(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            return true;
        }
        return false;
    }
    //4.Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

    boolean pushBrick(int a, int b, int x, int y, int z) {
        if (x <= a && y <= b || y <= a && x <= b || x <= a && z <= b || z <= a && x <= b || z <= a && y <= b || y <= a && z <= b) {
            return true;
        }
        return false;
    }

    //5.Вычислить значение функции:
    double function(double x) {
        double z = 0.0;
        if (x <= 3)
            z = x * x - 3 * x + 9;
        if (x > 3) {
            z = 1 / (x * x * x + 6);
        }
        return z;
    }
}
