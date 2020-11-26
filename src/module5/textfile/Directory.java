package module5.textfile;

import java.util.ArrayList;

public class Directory {

    private String directoryName;
    private ArrayList<TextFile> files;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        files = new ArrayList<>();
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void changeDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public ArrayList<TextFile> getFiles() {
        return files;
    }

    public void addFile(TextFile textFile) {
        this.files.add(textFile);
    }

    public void removeFile(String fileName) {
        for (int i = 0; i < files.size(); i++) {
            if(files.get(i).getFileName().equalsIgnoreCase(fileName)) {
                files.remove(i);
            }
        }
    }
}
