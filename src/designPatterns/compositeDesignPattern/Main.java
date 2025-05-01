package designPatterns.compositeDesignPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final FileSystem directory1 = new Directory("dir1", List.of(
                new File("file1.txt"),
                new Directory("dir2", List.of(
                        new File("file2.txt"),
                        new Directory("dir3", List.of(
                                new File("file3.txt")
                        ))
                ))
        ));

        directory1.ls();
    }
}
