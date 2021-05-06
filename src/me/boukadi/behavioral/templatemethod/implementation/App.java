package me.boukadi.behavioral.templatemethod.implementation;

public class App {
    public static void main(String[] args) {
        TemplateClass templateClass = new TemplateImpl1();
        System.out.println("Template method with Implementation1 " +templateClass.templateOperation());
        templateClass = new TemplateImpl2();
        System.out.println("Template method with Implementation1 " +templateClass.templateOperation());

        // N.B: strategy vs template method
        // template method is based on inheritance, the implementations are defined statically
        // strategy is based on composition, the implementations are defined dynamically
    }
}
