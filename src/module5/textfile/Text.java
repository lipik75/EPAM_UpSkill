package module5.textfile;

public class Text {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    public void addText(String text){
        StringBuilder stringBuilder = new StringBuilder(this.text);
        stringBuilder.append(' ');
        this.text = stringBuilder.append(text).toString();
    }
}
