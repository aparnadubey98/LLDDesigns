public class FileSystemDemo {
    public static void main(String[] args) {
        // Create a directory structure
        Directory root = new Directory("root");
        Directory subDir1 = new Directory("subDir1");
        Directory subDir2 = new Directory("subDir2");

        // Create files
        ConcreteFile file1 = new ConcreteFile("file1.txt");
        ConcreteFile file2 = new ConcreteFile("file2.txt");
        ConcreteFile file3 = new ConcreteFile("file3.txt");

        // Build the directory structure
        root.addFile(file1);
        root.addFile(subDir1);
        subDir1.addFile(file2);
        subDir1.addFile(subDir2);
        subDir2.addFile(file3);

        // List the contents of the root directory
        root.ls();
    }
}
