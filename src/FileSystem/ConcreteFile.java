public class ConcreteFile implements File{
    private final String name;

    public ConcreteFile(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("File: " + name);
    }

    public String getName() {
        return name;
    }
}
