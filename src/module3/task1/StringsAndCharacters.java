package module3.task1;


public class StringsAndCharacters {

    //1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

    public String[] toSnakeCase(String[] camelCase) {
        String[] snakeCase = new String[camelCase.length];
        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < camelCase[i].length(); j++) {
                char let = camelCase[i].toCharArray()[j];
                if (Character.isLowerCase(let)) {
                    stringBuilder.append(let);
                } else {
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(let));
                }
            }
            snakeCase[i] = stringBuilder.toString();
        }
        return snakeCase;
    }
    //2. Замените в строке все вхождения 'word' на 'letter'.

    public String changeWordtoLetter(String str) {
        return str.replace("word", "letter");
    }

    //3. В строке найти количество цифр.

    public int digitsCounter(String str) {
        int counter = 0;
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < str.length(); i++) {
            for (char element : digits) {
                if (str.charAt(i) == element) {
                    counter++;
                }
            }
        }
        return counter;
    }

    //4. В строке найти количество чисел.

    public int numberCount(String str) {
        String[] sarr = str.split(" ");
        int count = 0;
        for (String s : sarr) {
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                count++;
            }
        }
        return sarr.length - count;
    }

    //5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.

    public String removeSpaces(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String line = str.trim();
        boolean isSpace = false;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                if (!isSpace) {
                    stringBuilder.append(" ");
                }
                isSpace = true;
            } else {
                stringBuilder.append(line.charAt(i));
                isSpace = false;
            }
        }
        return stringBuilder.toString();
    }
}
