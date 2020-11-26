package module3.task2;

public class Main {

    public static void main(String[] args) {

        String line = "Shall  I   compare thee to a summer’s    day?\n" +
                "Thou   art more lovely and   more  temperate:\n" +
                "Rough winds do shake the darling buds of May,\n" +
                "And summer’s lease hath all too short a date:\n" +
                "Sometime  too  hot  the eye of heaven shines,\n" +
                "And  often  is     his  gold complexion dimm’d.";

        String line1 = "Sometime  too  hot  the eye of heaven shines";

        String line2 = "abc cde def";

        StringOrStringBuilder s = new StringOrStringBuilder();
        System.out.println("---exercise #1---");
        System.out.println(s.moreSpaces(line));
        System.out.println("---exercise #2---");
        System.out.println(s.addSymbolB(line));
        System.out.println("---exercise #3---");
        System.out.println(s.isPalindrome("bob"));
        System.out.println("---exercise #4---");
        System.out.println(s.createWordCake("информатика"));
        System.out.println("---exercise #5---");
        System.out.println(s.symbolA(line));
        System.out.println("---exercise #6---");
        System.out.println(s.changeStringOne(line1));
        System.out.println("---exercise #7---");
        System.out.println(s.changeStringTwo(line2));
        System.out.println("---exercise #8---");
        System.out.println(s.longestWord(line));
        System.out.println("---exercise #9---");
        s.lowerAndUpperSymbols(line);
        System.out.println("---exercise #10---");
        System.out.println(s.sentenceCount(line));

    }
}
