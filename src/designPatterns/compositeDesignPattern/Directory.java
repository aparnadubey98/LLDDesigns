package designPatterns.compositeDesignPattern;

import java.util.List;

public class Directory implements FileSystem{
    private final String name;
    List<FileSystem> fileSystems;

    public Directory(String name, List<FileSystem> fileSystems) {
        this.name = name;
        this.fileSystems = fileSystems;
    }

    public String getName() {
        return name;
    }

    @Override
    public void ls() {
        System.out.println("Inside directory: " + name);
        for(FileSystem fileSystem : fileSystems) {
            fileSystem.ls();
        }
    }
}
