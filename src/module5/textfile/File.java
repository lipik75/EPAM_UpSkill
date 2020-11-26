package module5.textfile;


abstract class File {

    private Directory directory;
    private String fileName;

    File(Directory directory, String fileName) {
        this.directory = directory;
        this.fileName = fileName;
    }

    public Directory getDirectory() {
        return directory;
    }

    public String getFileName() {
        return fileName;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    abstract public void changeName(String fileName);

    @Override
    public String toString() {
        return "File{" +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
