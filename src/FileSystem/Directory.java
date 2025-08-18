import java.util.ArrayList;
import java.util.List;

public class Directory implements File {
    private String name;
    private List<File> files;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + name);
        for (File file : files) {
            file.ls();
        }
    }

    public String getName() {
        return name;
    }

    public List<File> getFiles() {
        return files;
    }
}
