package module1.task1;

public class Main {
    public static void main(String[] args) {
        LinearProgramm linearProgramm = new LinearProgramm();

        System.out.println(linearProgramm.functionOne(5, 10, 15));
        System.out.println(linearProgramm.functionTwo(0, 0, 2));
        System.out.println(linearProgramm.functionThree(8, 10));
        System.out.println(linearProgramm.numberRevers(123.456));
        linearProgramm.timeCurrent(1245);
        System.out.println(linearProgramm.functionFour(1, 2));
    }


}
