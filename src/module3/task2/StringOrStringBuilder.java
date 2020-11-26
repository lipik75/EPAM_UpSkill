package module3.task2;


public class StringOrStringBuilder {

    //1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

    public int moreSpaces(String str) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        return maxCount;
    }

    //2. В строке вставить после каждого символа 'a' символ 'b'.

    public String addSymbolB(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                stringBuilder.append("ab");
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
    //3. Проверить, является ли заданное слово палиндромом.

    public boolean isPalindrome(String word) {
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            String a = String.valueOf(word.charAt(i));
            String b = String.valueOf(word.charAt(word.length() - i - 1));
            if (!a.equalsIgnoreCase(b)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    //4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

    public String createWordCake(String word) {
        String cake = String.valueOf(word.charAt(word.indexOf('т')));
        cake += String.valueOf(word.charAt(word.indexOf('о')));
        cake += String.valueOf(word.charAt(word.indexOf('р')));
        cake += String.valueOf(word.charAt(word.indexOf('т')));
        return cake;
    }

    //5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

    public int symbolA(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
    //6. Из заданной строки получить новую, повторив каждый символ дважды.

    public String changeStringOne(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(String.valueOf(str.charAt(i)) + (str.charAt(i)));
        }
        return stringBuilder.toString();
    }
    //7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
    // Например, если было введено "abc cde def", то должно быть выведено "abcdef".

    public String changeStringTwo(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            char ch = stringBuilder.charAt(i);
            if (ch == ' ') {
                stringBuilder.deleteCharAt(i);
                i--;
                continue;
            }
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(j) == ch) {
                    stringBuilder.deleteCharAt(j);
                }
            }
        }
        return stringBuilder.toString();
    }

    //8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
    // Случай, когда самых длинных слов может быть несколько, не обрабатывать.

    public String longestWord(String str) {
        String longestWord = "";
        int maxLenght = 0;
        String[] words = str.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLenght) {
                maxLenght = words[i].length();
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    //9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.

    public void lowerAndUpperSymbols(String str) {
        int lowerCount = 0;
        int upperCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                lowerCount++;
            if (ch >= 'A' && ch <= 'Z')
                upperCount++;
        }
        System.out.println("Строчных букв: " + lowerCount + " прописных букв: " + upperCount);
    }

    //10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком.
    // Определить количество предложений в строке X.

    public int sentenceCount(String str) {
        int counter = 1;
        char[] marks = {'.', '!', '?'};
        for (int i = 0; i < str.length() - 1; i++) {
            char character = str.charAt(i);
            for (char mark : marks) {
                if (character == mark && (str.charAt(i + 1) == ' ' || str.charAt(i + 1) == 10)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
