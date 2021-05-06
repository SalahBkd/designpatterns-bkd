package me.boukadi.structural.composite.implementation;

public class App {
    public static void main(String[] args) {
        Folder root = new Folder("Design Patterns");
        Folder folder1 = (Folder) root.add(new Folder("Creational"));
        Folder folder2 = (Folder) root.add(new Folder("Behavioral"));
        Folder folder3 = (Folder) root.add(new Folder("Structural"));

        folder1.add(new File("Singelton"));
        folder2.add(new File("Stratgey"));
        folder3.add(new File("Decorator"));

        root.show();


    }
}
