package me.boukadi.structural.decorator.implementation2;

import me.boukadi.structural.decorator.implementation2.componants.Boisson;
import me.boukadi.structural.decorator.implementation2.componants.Espresso;
import me.boukadi.structural.decorator.implementation2.decorators.Caramel;
import me.boukadi.structural.decorator.implementation2.decorators.Chocolat;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        Boisson boisson = new Espresso();
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());
        System.out.println("----------------------------");
        boisson = new Chocolat(new Caramel(boisson));
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescription());
        System.out.println("----------------------------");

        // USE CASES
        // JAVA.IO Package is based on the decorator design pattern
        //BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream()));
        //
    }
}
