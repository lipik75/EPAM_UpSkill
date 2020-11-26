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
        String[] paragraphs = text.split("\n");
        Arrays.sort(paragraphs);
        for (int i = 0; i < paragraphs.length; i++) {
            System.out.println((i + 1) + ") " + paragraphs[i]);
        }
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

    public String[] splitSentences(String text) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(text);
    }
}
