package module3.task3;

import module3.task3.RegularExpressions;
import module3.task3.XMLParser;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        RegularExpressions regularExpressions = new RegularExpressions();

        String text = "Раз. Два.\n" +
                "Раз.\n" +
                "Раз. Два. Три. Четыре. Пять. Шесть.\n" +
                "Раз. Два. Три. Четыре. Пять.\n" +
                "Раз. Два. Три. Четыре.\n" +
                "Раз. Два. Три.\n";

        System.out.println("Сортировка по количеству предложений: ");
        regularExpressions.sortParagraphs(text);
        System.out.println("--------------------------------------------");

        System.out.println("Сортировка слов в предложениях по длине: ");
        regularExpressions.sortWords(text);

        System.out.println("--------------------------------------------");
        System.out.println("Сортировка лексем по убыванию: ");


        XMLParser xmlParser = new XMLParser();

        String xml = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";

        String xmlAnalysis = xmlParser.xmlAnalyzer(xml);
        System.out.println(xmlAnalysis);
    }
}
