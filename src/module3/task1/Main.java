package module3.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] camelCase = {"getChars", "equalsIgnoreCase", "toLowerCase", "toUpperCase", "toCharArray", "charAt"};

        String word = "displaying word count in microsoft word";

        String line = "Поезд состоит из: \n" +
                "колес - 600 пар, \n" +
                "тягачей - 3 штуки, \n" +
                "вагонов - 80 штук, \n" +
                "осей - 300 штук, \n" +
                "двигатель - 1 штука , \n" +
                "экипаж - 3 человека";

        String shakespeareLine = " You shall find of the king a  husband, madam; you,\n" +
                "sir, a father: he that so  generally is at all  times\n" +
                "good  must   of necessity hold his virtue to you;  whose\n" +
                "worthiness would  stir it up where it wanted rather\n" +
                "than lack it where there is such abundance.   ";


        StringsAndCharacters s = new StringsAndCharacters();
        System.out.println("exercise #1");
        System.out.println(Arrays.toString(s.toSnakeCase(camelCase)));
        System.out.println("exercise #2");
        System.out.println(s.changeWordtoLetter(word));
        System.out.println("exercise #3");
        System.out.println(s.digitsCounter(line));
        System.out.println("exercise #4");
        System.out.println(s.numberCount(line));
        System.out.println("exercise #5");
        System.out.println(s.removeSpaces(shakespeareLine));

    }
}
