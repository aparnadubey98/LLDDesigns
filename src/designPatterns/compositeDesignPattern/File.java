package designPatterns.compositeDesignPattern;

public class File implements FileSystem {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void ls() {
        System.out.println(name);
    }
}
