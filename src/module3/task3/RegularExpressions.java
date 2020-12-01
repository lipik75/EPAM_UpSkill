package module3.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class RegularExpressions {
    /*
    1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции:
    1) отсортировать абзацы по количеству предложений;
    2) в каждом предложении отсортировать слова по длине;
    3) отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
     */

    public void sortParagraphs(String text) {
        String [] paragraphs = text.split("\n");
        int [] counterSentences = new int[paragraphs.length];
        int maxLengthParagraph = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            String [] sentences = splitSentences(paragraphs[i]);
            counterSentences[i] = sentences.length;
            if (maxLengthParagraph < sentences.length) {
                maxLengthParagraph = sentences.length;
            }
        }

        //вывод от самого короткого абазаца до самого длинного
        for (int i = 1; i <= maxLengthParagraph; i++) {
            for (int j = 0; j < counterSentences.length; j++) {
                if (i == counterSentences[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
        }
        System.out.println();
    }

    public void sortWords(String text) {
        String[] str = text.split("\n");
        for (String s : str) {
            String[] sentences = splitSentences(s);
            for (int k = sentences.length - 1; k >= 0; k--) {
                for (int m = 0; m < k; m++) {
                    if (sentences[m].length() > sentences[m + 1].length()) {
                        String tmp = sentences[m];
                        sentences[m] = sentences[m + 1];
                        sentences[m + 1] = tmp;
                    }
                }
            }
            System.out.println(Arrays.toString(sentences));
        }
    }

    public void sortLexemes(String text) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите символ для сортировки лексем по убыванию: ");
        String letter = reader.readLine();
        String [] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                //сортировка лексем
                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        int countRight = 0;
                        int countLeft = 0;
                        for (int n = 0; n < words[m].length(); n++) { //считаем количество вхождений
                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countLeft++;
                            }
                        }
                        for (int n = 0; n < words[m + 1].length(); n++) {   //считаем количество вхождений следующего символа
                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft < countRight) {   //сравниваем количесво вхождений
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        } else if (countLeft == countRight) { //если количество вхождений равно, сортировка по алфавиту
                            String [] forCompare = {words[m], words[m + 1]};
                            Arrays.sort(forCompare);
                            words[m] = forCompare[0];
                            words[m + 1] = forCompare[1];
                        }
                    }
                }

                //вывод слов
                for (String  word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static String [] splitSentences(String text) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(text);
    }

    private static String [] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(sentence);
    }
}
