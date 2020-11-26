package module3.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов
xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега,
тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */
public class XMLParser {
    public String xmlAnalyzer(String xml) {
        StringBuilder strBuilder = new StringBuilder();
        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");

        String [] lines = xml.split("\n\\s*"); /* разбиваем xml построчно */

        /* проверяем содержимое каждой строки */
        for (String line : lines) {
            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose = pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);
            if (mEmpty.find()) {
                strBuilder.append(mEmpty.group());
                strBuilder.append(" - тег без тела\n");
            }
            else if (mOpen.find()) {
                strBuilder.append(mOpen.group());
                strBuilder.append(" - открывающий тег\n");
            }
            if (mBody.find()) {
                strBuilder.append(mBody.group().substring(1));
                strBuilder.append("\b - содержимое тега\n");
            }
            if (mClose.find()) {
                strBuilder.append(mClose.group());
                strBuilder.append(" - закрывающий тег\n");
            }

        }
        return strBuilder.toString();
    }
}
